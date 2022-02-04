package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private static final int MAX_LOTTO_NUMBER=45;
    private static final int FIVE_MATCHING = 5;
    private static final int MAX_LOTTO_LENGTH=6;

    private List<Integer> numbers;
    private List<Integer> lotto;
    private int matchCount;
    private boolean bonusMatch;

    public Lotto() {
        this.numbers = initializeNumber();
        lotto = generateLottoNumber();
        matchCount = 0;
        bonusMatch = false;
    }

    private List<Integer> initializeNumber() {
        List<Integer> tempNumbers = new ArrayList<>();
        for (int i = 1; i <= MAX_LOTTO_NUMBER; i++) {
            tempNumbers.add(i);
        }
        return tempNumbers;
    }

    private List<Integer> generateLottoNumber() {
        Collections.shuffle(numbers);
        List<Integer> pickedNumber = numbers.subList(0, MAX_LOTTO_LENGTH);
        Collections.sort(pickedNumber);
        return pickedNumber;
    }

    public int findMatchingCount(WinningNumber winningNumber) {
        matchCount = winningNumber.findMatchingCount(lotto);
        if (matchCount == FIVE_MATCHING) {
            bonusMatch = winningNumber.checkBonusBall(lotto);
        }
        return matchCount;
    }

    public List<Integer> getLotto() {
        return lotto;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public boolean getBonusMatch() {
        return bonusMatch;
    }
}
