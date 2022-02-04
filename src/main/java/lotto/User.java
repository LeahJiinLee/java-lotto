package lotto;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int price;
    private int lottoAmount;
    private Lottos lottoss;
    private List<Lotto> lottos;

    public User(int price) {
        this.price = price;
        this.lottoAmount = calculateLotto(price);
        this.lottos = new ArrayList<>(saveLottos());
    }

    private int calculateLotto(int priceInput) {
        if (priceInput < 1000) {
            throw new IllegalArgumentException("1000원 이상의 금액을 입력해주세요");
        }
        return priceInput / 1000;
    }

    private List<Lotto> saveLottos() {
        List<Lotto> tempLottos = new ArrayList<>();
        for (int i = 0; i < lottoAmount; i++) {
            tempLottos.add(new Lotto());
        }
        return tempLottos;
    }
}
