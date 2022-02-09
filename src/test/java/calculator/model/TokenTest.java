package calculator.model;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

public class TokenTest {

    @Test
    void 숫자가_아닐시_예외() {
        assertThatExceptionOfType(NumberFormatException.class)
            .isThrownBy(() -> new Token("*"));
    }
}