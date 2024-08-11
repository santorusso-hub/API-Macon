package com.techprudent.springbootrestcrud.model;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class TestsUnit5Test extends TestCase {
    TestsUnit5 cases=new TestsUnit5();
    @Test
    public void testSoma() {
        cases.soma(12,6);
    }
}