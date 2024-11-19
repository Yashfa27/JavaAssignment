package MyPakage2;

class dummy implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=30; i++){
            System.out.println("This is child thread");
        }
    }
}


public class threadRunnable{
    public static void main(String[] args) {
        dummy obj=new dummy();
        Thread thread=new Thread(obj);
        thread.start();

        for(int i=0; i<=30;i++){
            System.out.println("This thread is main thread");

        }
    }
}
