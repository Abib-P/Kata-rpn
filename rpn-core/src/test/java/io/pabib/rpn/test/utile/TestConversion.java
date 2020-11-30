package io.pabib.rpn.test.utile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.pabib.rpn.utile.Conversion.isDouble;
import static org.assertj.core.api.Assertions.assertThat;

class TestConversion {

    @ParameterizedTest
    @ValueSource(strings = {"1", "3.4","5.2", "-3", "-15.65"})
    void conversion_isDouble_should_return_true_when_given_number_string(String value) {
        assertThat(isDouble(value)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"  ", "3 4","deux", "3+4", "-42.k" ,"+"})
    void conversion_isDouble_should_return_false_when_given_no_number_string(String value) {
        assertThat(isDouble(value)).isFalse();
    }
}
