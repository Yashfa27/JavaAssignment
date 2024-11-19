package MyPakage2;
import  java.lang.Thread;

class Mythread extends Thread {
    public void run() {
        int i = 40;
        while (i > 0) {
            System.out.println("This thread 1 is running");
            i--;
        }
    }
}

class thread2 extends Thread {
    public void run() {
        int i = 40;
        while (i > 0) {
            System.out.println("This thread 2 is running");
            i--;
        }
    }
}

class thread3 extends Thread{
    public void run() {
        int i = 40;
        while (i > 0) {
            System.out.println("This thread 3 is running");
            i--;
        }
    }
}

public class threadClass {
    public static void main(String[] args) {
        thread2 threadobject2 = new thread2();
        thread3 threadobject3 = new thread3();
        threadobject2.start(); // Start thread
        threadobject3.start(); // Start thread
        threadobject2.setName("Thread 2");
        System.out.println(threadobject2.getName());
        threadobject3.setName("Thread 3");
        System.out.println(threadobject3.getName());

    }

}
