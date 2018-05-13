package com.pashley.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1执行。。。");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore12行。。。");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore13行。。。");
    }
}
