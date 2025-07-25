package com.example.comp1011spring2025tuesday1pm;

import java.io.Console;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Week11 {

    public static void main(String[] args) {
            example6();
    }

    static void example1(){

        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread();
        t1.start();

    }
    static void example2(){
        Runnable task = ()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("This is another Thread");
           // Integer.parseInt("abc");
            System.out.println(Thread.currentThread().getState());

        };
        task.run();
        Thread t2 = new Thread(task);
        t2.start();
        new MyThread().start();

        System.out.println("End of program");
    }
    static void example3(){
        Console console = System.console();
        Runnable task = ()->{
            System.out.println("Enter your name");
            String name = console.readLine();
            System.out.println("Hello, " + name);
        };

        task.run();
        new Thread(task).start();


    }
    static void example4(){

        Runnable task = ()->{

            try{
                for(int i = 3; i >= 0; i--){
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    //Thread.sleep(1000);
                    Thread.sleep(new Random().nextInt( 1000));

                }
            }
            catch (Exception e){
                System.err.println(e.getMessage());
            }
        };

        new Thread(task).start();
        task.run();

    }
    static void example5(){
        Runnable task = ()->{
            try{
                System.out.println("Running " + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("Ending " + Thread.currentThread().getName());

            }
            catch (Exception e){
                System.err.println(e.getMessage());
            }
        };

ExecutorService service1 = Executors.newFixedThreadPool(2);
ExecutorService service2 = Executors.newSingleThreadExecutor();
ExecutorService service3 = Executors.newScheduledThreadPool(2);
ExecutorService service4 = Executors.newFixedThreadPool(2);

service2.execute(task);
service2.execute(task);
service2.execute(task);

try {
    service2.awaitTermination(7, TimeUnit.SECONDS);
    service2.shutdownNow();
}
catch (InterruptedException e) {
    System.err.println(e.getMessage());
}
//service1.shutdown();

    }
    static void example6(){
        Runnable task = ()->{
            try{
                System.out.println("Running " + Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("Ending " + Thread.currentThread().getName());

            }
            catch (Exception e){
                System.err.println(e.getMessage());
            }
        };

        ScheduledExecutorService service3 = Executors.newScheduledThreadPool(2);
        ScheduledExecutorService service4 = Executors.newScheduledThreadPool(2);

//        service3.schedule(task, 1, TimeUnit.SECONDS);
//        service3.schedule(task, 2, TimeUnit.SECONDS);
//        service3.schedule(task, 3, TimeUnit.SECONDS);

        //service4.scheduleWithFixedDelay(task, 5, 2, TimeUnit.SECONDS);
        service4.scheduleAtFixedRate(task, 5, 2, TimeUnit.SECONDS);


        //service4.shutdown();


    }
    static void example7(){}
    static void example8(){}
}
