package org.ruivieira.jmls;

import java.util.Arrays;

public class MathUtils {

    private static Double stableLog(Double data) {
        if (data <= 1e-10) {
            return Math.log(1.0);
        } else {
            return Math.log(data);
        }
    }

    public static Double[] stableLog(Double[] data) {

        return Arrays.stream(data).map(MathUtils::stableLog).toArray(Double[]::new);

    }

}
