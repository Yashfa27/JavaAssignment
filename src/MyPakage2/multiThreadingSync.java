package MyPakage2;

class Multi extends Thread {
    static int available = 1;

    @Override
    public synchronized void run() {
            if (available == 1) {
                available = 0;
                System.out.println(Thread.currentThread().getName() + " is accessing the resource.");
                System.out.println("This is multi threading without conflict");
            } else {
                System.out.println("Only 1 thread can access this resource");
            }
        }
    }

public class multiThreadingSync {
    public static void main(String[] args) {
        Multi multithread1=new Multi();
        Multi multithread2=new Multi();
        Multi multithread3=new Multi();

        multithread1.start();
        multithread2.start();
        multithread3.start();
    }
}
