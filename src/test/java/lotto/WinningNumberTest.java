package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class WinningNumberTest {
    @Test
    void 번호_일치_테스트(){
        List<String> winningNumbersInput= Arrays.asList("1","2","3","4","5","6");
        int bonusBall=7;
        WinningNumber winningNumber = new WinningNumber(winningNumbersInput,bonusBall);
        int result = winningNumber.findMatchingCount(Arrays.asList(1,3,7,18,35,40));
        assertThat(result).isEqualTo(2);
    }

    @Test
    void 보너스_볼_일치_테스트(){
        List<String> winningNumbersInput= Arrays.asList("1","2","3","4","5","6");
        int bonusBall=7;
        WinningNumber winningNumber = new WinningNumber(winningNumbersInput,bonusBall);
        boolean result = winningNumber.checkBonusBall(Arrays.asList(1,3,7,18,35,40));
        assertThat(result).isEqualTo(true);
    }
}
