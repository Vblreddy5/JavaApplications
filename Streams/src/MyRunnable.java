public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello multithreading from thread #" + Thread.currentThread().getId());

    }
}
