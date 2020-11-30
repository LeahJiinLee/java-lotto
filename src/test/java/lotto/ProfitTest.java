package lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfitTest {

    @BeforeEach
    void setUp(){
        List<Lotto> lottoList = new ArrayList<>();
        List<Integer> lottoNumbers = new ArrayList<>();
        lottoNumbers.add(1);
        lottoNumbers.add(2);
        lottoNumbers.add(3);
        lottoNumbers.add(9);
        lottoNumbers.add(10);
        lottoNumbers.add(11);
        Lotto lotto = new Lotto(lottoNumbers);
        lottoList.add(lotto);
        int[] winnerLottoNumbers = {1,2,3,4,5,6};
        new LottoWinner(winnerLottoNumbers);
        LottoGameService.setLottoBuyAmt(14000);
    }

    @ParameterizedTest
    @CsvSource(value = {"3:이득이", "0.35:손해"}, delimiter = ':')
    public void profitToStringTest(double profitRate, String resultString) {
        assertThat(PrintView.profitToString(profitRate)).isEqualTo(resultString);

    }

}