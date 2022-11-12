package extra;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArithmeticOperationTest {

    @Test
    void multiply() {
        int result = ArithmeticOperation.multiply(5,2);
        assertThat(result).isEqualTo(10);
    }
}