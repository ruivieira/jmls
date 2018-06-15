package org.ruivieira.jmls.mdl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

    Integer[] targetTable(Double[] data) {
        final Double[] levels = this.levels(data);
        final int size = levels.length;
        final Integer[] target = new Integer[size];
        Arrays.fill(target, 0);
        for (Double item : data) {
            for (int i = 0 ; i < size ; i++) {
                if (item.equals(levels[i])) {
                    target[i] += 1;
                }
            }
        }
        return target;
    }
}
