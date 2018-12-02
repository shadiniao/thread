package com.zyz.no1;

/**
 * Created by yizhi on 2018-12-02.
 */
public class TicketWindowRunnable implements Runnable {

    private int index = 1;

    private final static int MAX = 50;

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(String.format("票号为%s的请到%s号柜台", index++, Thread.currentThread().getName()));
        }
    }
}
