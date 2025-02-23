package multiple_thread_problems;

public class DeadlockResolved {
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public static void main(String[] args){
        DeadlockResolved solution = new DeadlockResolved();
        solution.execute();
    }

    public void execute() {
        // Luồng thứ nhất: lấy resource1 rồi resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Đã chiếm resource1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: Đã chiếm resource2");
                }
            }
        });

        // Luồng thứ hai: cũng lấy resource1 trước, sau đó mới lấy resource2
        Thread thread2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2: Đã chiếm resource1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 2: Đã chiếm resource2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
