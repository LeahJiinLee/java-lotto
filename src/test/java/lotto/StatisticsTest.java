package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StatisticsTest {

    @Test
    void 초기화_테스트(){
        Statistics statistics = new Statistics(3);
        List<Lotto> lottos = Arrays.asList(
            new Lotto(),new Lotto(), new Lotto()
        );
        statistics.calculateEachTotal(lottos);
        assertThat(statistics.calculateBenefits()).isEqualTo(0.0);
    }

    @Test
    void 최종_일치_개수_구하기(){

        Lottos lottos= new Lottos(3000);
        Statistics statistics = new Statistics(3);
        statistics.calculateEachTotal(lottos.getLottos());

    }

}
