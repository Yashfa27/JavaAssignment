package MyPakage2;
class demo2{
static String name;
    static{
        name="Static";
        System.out.println("This is static block" + name);
    }
}


public class staticBlock {
    public static void main(String[] args) {
    demo2 obj=new demo2();
    }
}
