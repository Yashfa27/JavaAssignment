package MyPakage2;
//without synchronization


class multithread extends Thread{
    @Override
    public void run() {
        System.out.println("we are entering into run method");
    }
}

public class multithreading {
    public static void main(String[] args) {
        multithread thread1= new multithread();
        multithread thread2= new multithread();
        multithread thread3= new multithread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
