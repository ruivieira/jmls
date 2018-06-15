package org.ruivieira.jmls.mdl;

import java.util.ArrayList;
import java.util.List;
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

    Double[] levels(Double[] data) {
        final List<Double> levels = new ArrayList<>();

        for (Double level : data) {
            if (!levels.contains(level)) {
                levels.add(level);
            }
        }
        return levels.toArray(new Double[0]);
    }
}
