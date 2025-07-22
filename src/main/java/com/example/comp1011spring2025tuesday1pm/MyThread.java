package com.example.comp1011spring2025tuesday1pm;

public class MyThread extends Thread{


    public MyThread() {
        super();
    }
    public MyThread(String name) {
        super(name);
    }
    public MyThread(Runnable r) {
        super(r);
    }
    MyThread(Runnable task, String name) {
        super(task, name);
    }
    public void run() {
        System.out.println("MyThread started. Isn't this cool?");
    }

}
