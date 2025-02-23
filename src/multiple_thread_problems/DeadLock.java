package multiple_thread_problems;

public class DeadLock {
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public void createDeadlock() {
        // Luồng thứ nhất: giữ resource1 và chờ resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Đã chiếm resource1");
                try { Thread.sleep(50); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("Thread 1: Đang chờ resource2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Đã chiếm resource2");
                }
            }
        });

        // Luồng thứ hai: giữ resource2 và chờ resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Đã chiếm resource2");
                try { Thread.sleep(50); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("Thread 2: Đang chờ resource1");
                synchronized (resource1) {
                    System.out.println("Thread 2: Đã chiếm resource1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        DeadLock deadlock = new DeadLock();
        deadlock.createDeadlock();
    }
}