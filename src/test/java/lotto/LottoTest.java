package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class LottoTest {
    @Test
    @RepeatedTest(4)
    void 로또는_1부터_45_사이(){
        List<Integer> numbers= new ArrayList<>();
        for (int i=1; i<=45; i++){
           numbers.add(i);
        }
        Lotto lotto = new Lotto();
        for (int eachNumber:lotto.getLotto()){
            assertThat(eachNumber).isIn(numbers);
        }
    }

//    @Test
//    void 로또번호는_6개(){
//        Lotto lotto = new Lotto();
//        for (int eachNumber:lotto.getLotto()){
//            assertThat(eachNumber);
//        }
//    }
}
