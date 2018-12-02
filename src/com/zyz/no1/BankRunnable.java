package com.zyz.no1;

/**
 * Created by yizhi on 2018-12-02.
 */
public class BankRunnable {

    public static void main(String[] args) {
        TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable();

        Thread t1 = new Thread(ticketWindowRunnable, "1");
        Thread t2 = new Thread(ticketWindowRunnable, "2");
        Thread t3 = new Thread(ticketWindowRunnable, "3");

        t1.start();
        t2.start();
        t3.start();
    }

}
