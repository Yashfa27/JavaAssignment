package MyPakage1;

//1. Write a Java method that takes an array of integers and
// returns the sum of all even numbers in the array.

public class evenNumbers{
    int sum=0;
    int arrayfunc(){
        int [] array={10,20,1,100,200,33};
        for (int i = 0; i< array.length ; i++) {
            if(array[i]%2==0){
                sum=sum+array[i];

            }
        }
        System.out.println("Sum of all even numbers in array:"+sum);
        return sum;
    }

    public static void main(String[] args) {
        evenNumbers evenobject= new evenNumbers();
        evenobject.arrayfunc();

    }

}