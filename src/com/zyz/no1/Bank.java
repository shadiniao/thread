package com.zyz.no1;

/**
 * Created by yizhi on 2018-12-02.
 */
public class Bank {

    public static void main(String[] args) {
        Thread t1 = new TicketWindow("1");
        t1.start();

        Thread t2 = new TicketWindow("2");
        t2.start();

        Thread t3 = new TicketWindow("3");
        t3.start();
    }
}
