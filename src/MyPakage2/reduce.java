package MyPakage2;


import java.util.Arrays;
import java.util.List;

public class reduce {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,4,5);
        int sum = data.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(sum);
    }
}
