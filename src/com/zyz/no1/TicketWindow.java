package com.zyz.no1;

/**
 * Created by yizhi on 2018-12-02.
 */
public class TicketWindow extends Thread {

    private final static int MAX = 50;

    private static int index = 1;

    private String name;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(String.format("票号为%s的请到%s号柜台", index++, name));
        }
    }
}
