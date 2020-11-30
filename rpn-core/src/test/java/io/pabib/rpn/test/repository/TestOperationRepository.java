package io.pabib.rpn.test.repository;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.pabib.rpn.utile.Conversion.isDouble;
import static org.assertj.core.api.Assertions.assertThat;

public class TestOperationRepository {

    @ParameterizedTest
    @ValueSource(strings = {"+"})
    void conversion_isDouble_should_return_true_when_given_number_string(String value) {
    }
}
