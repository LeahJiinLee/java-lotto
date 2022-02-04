package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LottosTest {
    @Test
    void 개수_만큼_로또_생성(){
        Lottos lottos = new Lottos(14000);
        int lottoCount=lottos.getLottos().size();
        assertThat(lottoCount).isEqualTo(14);
    }
}
