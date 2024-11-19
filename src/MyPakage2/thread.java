package MyPakage2;

public class thread {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

    }
}
