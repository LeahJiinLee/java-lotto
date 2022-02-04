package lotto;

public class LottoGame {

    public void play() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Lottos lottos = new Lottos(inputView.inputPrice());
        outputView.printLottos(lottos.getLottos());
        WinningNumber winningNumber = new WinningNumber(inputView.inputWinningNumbers(), inputView.inputBonusBall());
        lottos.findEachLottoMatchingNumber(winningNumber);
        Statistics statistics = new Statistics(lottos.getLottoAmount());
        statistics.calculateEachTotal(lottos.getLottos());
        outputView.printStatistics(statistics.calculateBenefits());
    }

}
