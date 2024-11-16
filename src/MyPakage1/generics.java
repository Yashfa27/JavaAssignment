package MyPakage1;

//3. Write a Java generic class Box<T> that has a method printType()
// to print the type of the object stored in the box. Create an instance of Box to
// store a String and another to store an Integer, and call printType() on both instances.

class Box<T>{
    T value;

    public Box(T value) {
        this.value=value;
    }

    public void printType(){
        System.out.println("This is " + value);
    }

}

public class generics {
    public static void main(String[] args) {
        Box<String> obj=new Box<>("Alice");
        obj.printType();
        Box<Integer> obj2=new Box<>(23);
        obj2.printType();

    }
}
