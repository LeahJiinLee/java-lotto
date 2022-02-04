package lotto;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private static final int PRICE_OF_A_LOTTO = 1000;
    private static final String LIMIT_PRICE_INPUT="1000원 이상의 금액을 입력해주세요";
    private List<Lotto> lottos;
    private int lottoAmount;

    public Lottos(int priceInput) {
        this.lottoAmount = calculateLotto(priceInput);
        this.lottos = new ArrayList<>(saveLottos());
    }

    private int calculateLotto(int priceInput) {
        if (priceInput < PRICE_OF_A_LOTTO) {
            throw new IllegalArgumentException(LIMIT_PRICE_INPUT);
        }
        return priceInput / PRICE_OF_A_LOTTO;
    }

    private List<Lotto> saveLottos() {
        List<Lotto> tempLottos = new ArrayList<>();
        for (int i = 0; i < lottoAmount; i++) {
            tempLottos.add(new Lotto());
        }
        return tempLottos;
    }

    public void findEachLottoMatchingNumber(WinningNumber winningNumber) {
        for (Lotto lotto : lottos) {
            lotto.findMatchingCount(winningNumber);
        }
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public int getLottoAmount() {
        return lottoAmount;
    }
}
