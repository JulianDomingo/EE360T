package com.juliandomingo.pset6;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinWebTestGeneratorTest {

    @Test public void t0() {
        MinWebTestGenerator testGen = new MinWebTestGenerator();
        testGen.main(new String[]{});
        assertNotNull(testGen);
    }
}
