package MyPakage2;

import java.util.Arrays;
import java.util.List;

public class count {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 555, 32, 5, 335, 6, 77, 88, 99, 8, 7, 9);
        long count = list.stream().count();
        System.out.println(count);
    }
}