package MyPakage2;

class demo{
    String name;
   static void display(){
        System.out.println("This is static method use for memory management");
    }
}

public class staticMethod {
    public static void main(String[] args) {
        demo.display();
    }
}
