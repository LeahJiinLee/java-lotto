package lotto;

import java.util.List;

public class OutputView {

    private static final String LOTTO_AMOUNT_MESSAGE = "개를 구매했습니다.";
    private static final String WINNING_STATISTICS_MESSAGE = "당첨 통계";
    private static final String GUIDE_LINE = "---------";
    private static final String BONUS_BALL_MESSAGE=", 보너스 볼 일치";
    private static final String AMOUNT_OF_MATCHING_MESSAGE = "개 일치 (";
    private static final String WON = "원)-";
    private static final String AMOUNT = "개";
    private static final String TOTAL_BENEFITS_MESSAGE = "총 수익률은 ";
    private static final String END_OF_SENTENCE = "입니다.";
    private static final String LOSS_GUIDE_MESSAGE = "(기준이 1이기 때문에 결과적으로 손해라는 의미임)";

    public void printLottos(List<Lotto> lottos) {
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getLotto());
        }
        printLottoAmount(lottos.size());
    }

    private void printLottoAmount(int lottoAmount) {
        System.out.println(lottoAmount + LOTTO_AMOUNT_MESSAGE);
    }

    public void printStatistics(double benefits) {
        String bonusMessage;
        System.out.println(WINNING_STATISTICS_MESSAGE);
        System.out.println(GUIDE_LINE);

        for (Rank rank : Rank.values()) {
            bonusMessage=addMessageForBonus(rank);
            System.out.print(
                rank.getMatchingNumbers() + "개 일치" + bonusMessage+" ("+ rank.getPrize()
                    + WON + rank.getTotal() + AMOUNT);
            System.out.println();
        }

        printBenefits(benefits);
    }
    private String addMessageForBonus(Rank rank){
        if(rank==Rank.FIVE_BONUS){
            return BONUS_BALL_MESSAGE;
        }
        return "";
    }
    private void printBenefits(double benefits) {
        System.out.print(TOTAL_BENEFITS_MESSAGE + benefits + END_OF_SENTENCE);
        if (benefits < 1) {
            System.out.println(LOSS_GUIDE_MESSAGE);
        }
    }

}
