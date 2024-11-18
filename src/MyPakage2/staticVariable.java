package MyPakage2;
class students{
    int id;
    String name;
    static String institute = "Oxford";

    students(int id, String name){
        this.id=id;
        this.name=name;
    }
    void display(){
         System.out.println(id +" "+ name+" "+ institute);
    }
}


public class staticVariable {
    public static void main(String[] args) {
        students stud=new students(1, "Alice");
        students stud2=new students(2, "John");
        students stud3=new students(3, "Linda");
        stud.display();
        stud2.display();
        stud3.display();
    }
}
