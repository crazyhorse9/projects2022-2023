package unit02.lesson15;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntSumTest {

    @Test
    void sum() {
        int result = IntSum.sum(10);
        assertThat(result).isEqualTo(55);
    }

    @Test
    void sum_negative() {
        int result = IntSum.sum(-10);
        assertThat(result).isEqualTo(0);
    }
}