package com.learnhub.tricks;

public class ThreadvsRunnable {

    public static void main(String[] args) {

        Task task = new Task();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(new Threaded());
        Thread t3 = new Thread(task);

        t1.start();

        t2.start();

        // Run is executed on main
        t3.run();
    }
}

class Task implements Runnable {

    public void run() {

        System.out.println(" Runnable executed = "+Thread.currentThread().getName());
    }
}


class Threaded extends Thread {

    @Override
    public void run(){
        System.out.println(" Thread executed = "+Thread.currentThread().getName());
    }
}