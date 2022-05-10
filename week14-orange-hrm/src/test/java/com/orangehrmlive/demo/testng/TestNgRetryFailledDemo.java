package com.orangehrmlive.demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryFailledDemo {

    @Test
    public void test1() {
        System.out.println("I am in test1");
    }

    @Test
    public void test2() {
        System.out.println("I am in test2");
    }


    @Test(retryAnalyzer = RetryAnalyser.class)// here test 3 run 5 times
    public void test3() {
        System.out.println("I am in test3");
        Assert.assertTrue(true);// here test fail no 3

    }


}
