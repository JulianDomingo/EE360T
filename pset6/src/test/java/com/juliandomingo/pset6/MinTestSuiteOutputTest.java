package com.juliandomingo.pset6;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinTestSuiteOutputTest {
    @Test public void t0() { 
        MinWebTestGenerator generator = new MinWebTestGenerator();
        generator.main(new String[]{});
        assertNotNull(generator);
    }
}

