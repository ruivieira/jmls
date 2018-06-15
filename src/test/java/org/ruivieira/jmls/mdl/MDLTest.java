package org.ruivieira.jmls.mdl;

import org.junit.Test;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class MDLTest {

    @Test
    public void barrier() {

        final Double[] data = new Double[] {1.0, 2.0, 2.0, 3.0, 4.0, 5.0,
                5.0, 5.0, 5.0, 6.0};

        final MDL mdl = new MDL();

        final Optional<Integer> barrier = mdl.barrier(data, 4.0);

        assertTrue("Barrier should not be empty", barrier.isPresent());
        assertEquals("sd", 5, (int) barrier.get());
    }

    @Test
    public void barrierEmpty() {

        final Double[] data = new Double[] {1.0, 2.0, 2.0, 3.0, 4.0, 5.0,
                5.0, 5.0, 5.0, 6.0};

        final MDL mdl = new MDL();

        final Optional<Integer> barrier = mdl.barrier(data, 10.0);

        assertTrue("Barrier should be empty", !barrier.isPresent());
    }

    @Test
    public void levels() {

        final Double[] data = new Double[] {1.0, 2.0, 2.0, 3.0, 4.0, 5.0,
                5.0, 5.0, 5.0, 6.0};

        final MDL mdl = new MDL();

        final Double[] levels = mdl.levels(data);
        assertArrayEquals("Levels should match", new Double[] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0}, levels);
    }
}
