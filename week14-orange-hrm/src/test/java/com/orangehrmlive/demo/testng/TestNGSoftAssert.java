package com.orangehrmlive.demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssert {

    @Test
    public void testSum() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Running Test ----------->");
        Assert.assertTrue(result == 40);
        System.out.println("Line after assert 1");
        Assert.assertTrue(result == 30);
        System.out.println("Line after assert 2");
    }
    @Test
    public void testSum1() {
        SoftAssert softAssert=new SoftAssert();//create object
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Running Test ----------->");
        softAssert.assertTrue(result == 40,"Result not eqaul to 40");
        System.out.println("Line after assert 1");
        softAssert.assertTrue(result == 30,"Result not ewual to 30");
        System.out.println("Line after assert 2");
        softAssert.assertAll();// if you forget this line your test not valid
    }

}
