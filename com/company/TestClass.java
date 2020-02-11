package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    @Test
    public void testHello(){
        Main.helloUser("User");
        Assert.assertTrue(Main.operationSuccess);
        Main.helloUser("User44");
        Assert.assertFalse(Main.operationSuccess);
    }
}
