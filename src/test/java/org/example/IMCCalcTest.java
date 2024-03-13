package org.example;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IMCCalcTest {

    @Test
    void calcImc() {
        // altura 1,75 peso 70 = 22,87
        IMCCalc imcCalc = new IMCCalc();
        var result = imcCalc.calcImc(175, 70);
        assertThat(result).isCloseTo(22.87f, Offset.offset(0.01f));

    }
}