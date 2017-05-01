package com.juliandomingo.pset6;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinAndMaxTestSuiteOutputTest {
    @Test public void t0() { 
        MinAndMaxWebTestGenerator generator = new MinAndMaxWebTestGenerator();
        generator.main(new String[]{});
        assertNotNull(generator);
    }
}

