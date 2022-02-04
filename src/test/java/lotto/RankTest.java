package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RankTest {

    @Test
    void 일치하는_개수_매칭(){
        Rank.THREE.increaseTotal(Rank.THREE, 3);
        assertThat(Rank.THREE.getTotal()).isEqualTo(1);
    }
}
