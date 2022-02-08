package lotto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoRules {

    private final static int START_NUM = 1;
    private final static int LAST_NUM = 45;
    private final static int LOTTO_COUNT = 6;
    private final static int LOTTO_PRICE = 1000;
    private final static int START_INDEX = 0;
    private final static int LAST_INDEX = 6;

    private final List<Integer> lottoNums;

    public LottoRules() {
        List<Integer> lottoNums = new ArrayList<>();
        for (int i = START_NUM; i <= LAST_NUM; i++) {
            lottoNums.add(i);
        }
        this.lottoNums = lottoNums;
    }

    public List<Integer> makeLottoNums() {
        Collections.shuffle(lottoNums);
        return lottoNums.subList(START_INDEX, LAST_INDEX);
    }

    public int getLottoPrice() {
        return LOTTO_PRICE;
    }

    public int getLottoCount() {
        return LOTTO_COUNT;
    }

    public int getStartNum() {
        return START_NUM;
    }

    public int getLastNum() {
        return LAST_NUM;
    }
}
