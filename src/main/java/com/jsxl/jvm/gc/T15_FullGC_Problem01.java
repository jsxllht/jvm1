package com.jsxl.jvm.gc;

import java.math.BigDecimal;
import java.util.Date;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;


public class T15_FullGC_Problem01 {
    private static class CardInfo {
        BigDecimal price =  new BigDecimal(0.0);
        String name = "张三";
        int age = 5;
        Date birthDate = new Date();

        public void m(){}
    }
   // private static ScheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(50,new ThreadPoolExecutor.DiscardOldestPolicy());
}
