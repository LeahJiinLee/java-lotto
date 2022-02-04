package lotto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String PRICE_INPUT_GUIDE_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String WINNING__NUMBER_INPUT_GUIDE_MESSAGE = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String BONUS_BALL_INPUT_GUIDE_MESSAGE = "보너스 볼을 입력해 주세요.";

    public int inputPrice() {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println(PRICE_INPUT_GUIDE_MESSAGE);
        int priceInput = SCANNER.nextInt();

        return priceInput;
    }

    public List<String> inputWinningNumbers() {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println(WINNING__NUMBER_INPUT_GUIDE_MESSAGE);
        String userInput = SCANNER.nextLine();
        return Arrays.asList(userInput.split(" |,"));
    }

    public int inputBonusBall() {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println(BONUS_BALL_INPUT_GUIDE_MESSAGE);
        int bonusBallInput = SCANNER.nextInt();

        return bonusBallInput;
    }
}
