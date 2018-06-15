package org.ruivieira.jmls.mdl;

import java.util.Optional;

public class MDL {

    public MDL() {

    }

    Optional<Integer> barrier(Double[] data, Double value) {
        final int size = data.length;
        for (int i = 0 ; i < size ; i++) {
            if (data[i] > value) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
