package org.ruivieira.jmls;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void stableLog() {
        final Double[] data = new Double[] {0.1, 1e-12, 2e-15, 3.0, 0.001, 0.04,
                0.12, 0.0001, 5.0, 6.0};

        final Double[] logs = MathUtils.stableLog(data);

        final Double[] expected = new Double[] {-2.3025850929940455,
                0.0,
                0.0,
                1.0986122886681098,
                -6.907755278982137,
                -3.2188758248682006,
                -2.120263536200091,
                -9.210340371976182,
                1.6094379124341003,
                1.791759469228055};
        assertArrayEquals("Stable log should be correct",
                expected, logs);

    }
}