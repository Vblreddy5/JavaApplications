public class MultithreadingExample {
    public static void main(String[] args) {
        System.out.println("This is thread #" + Thread.currentThread().getId());
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
         thread.start();
         t2.start();
    }
}
