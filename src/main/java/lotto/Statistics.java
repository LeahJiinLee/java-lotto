package lotto;

import java.util.Arrays;
import java.util.List;

public class Statistics {

    private static final int FIVE_BONUS_MATCHING_NUMBER = 5;
    private static final int FIVE_BONUS_INDEX = 3;
    private static final int PRICE_OF_A_LOTTO = 1000;

    private List<Rank> winningRank;
    private double totalPrice;
    private double totalPrize;

    public Statistics(int lottoAmount) {
        this.winningRank = Arrays.asList(Rank.values());
        this.totalPrice = lottoAmount * PRICE_OF_A_LOTTO;
        this.totalPrize = 0;
    }

    public void calculateEachTotal(List<Lotto> lottos) {
        for (Lotto lotto : lottos) {
            updateTotal(lotto.getMatchCount(), lotto.getBonusMatch());
        }
    }

    private void updateTotal(int matchCount, boolean bonusMatch) {
        if (matchCount == FIVE_BONUS_MATCHING_NUMBER && bonusMatch == true) {
            winningRank.get(FIVE_BONUS_INDEX).increaseBonusTotal(Rank.FIVE_BONUS);
            return;
        }
        for (int i = 0; i < winningRank.size(); i++) {
            winningRank.get(i).increaseTotal(winningRank.get(i), matchCount);
        }
    }

    private void calculateTotalPrize() {
        for (int i = 0; i < winningRank.size(); i++) {
            totalPrize += winningRank.get(i).getTotalPrize();
        }
    }

    public double calculateBenefits() {
        calculateTotalPrize();
        return Math.floor((totalPrize / totalPrice)*100)/100;
    }

    public List<Rank> getWinningRank() {
        return winningRank;
    }
}
