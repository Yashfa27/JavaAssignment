package MyPakage2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Create a static method that accepts a list of integers and
// returns a stream that filters even numbers, squares them, and collects them into a new list.
public class practice {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(12,3,65,88,2,7);
//        List<Integer> result = new ArrayList<Integer>();
//        result=list.stream()
//                .filter(num -> num%2==0)
//                .map(num ->num*num)
//                .collect(Collectors.toList());
//        System.out.println(result);


        //Write a static method that takes a list of integers and uses reduce()
        // to calculate the sum of all numbers in the list.

//        List<Integer> list = Arrays.asList(23,54,66,7,88);
//        int sum=list.stream().reduce(0,(a,b) -> a+b);
//        System.out.println(sum);

       // Create a static method that accepts a list of strings and
        // filters out any string that contains more than 5 characters,
        // then returns the remaining strings in sorted order.

        List<String> list = Arrays.asList("Alice", "roy","jackSparrow","Linda");
        list.stream().filter(num->num.length() > 5)
                .forEach(System.out::println);    // Print each name that matches the condition
    }
}
