package MyPakage2;

import java.util.Arrays;
import java.util.List;

public class minMax {
    public static void main(String[] args) {
        //List<Integer> list= Arrays.asList(23,56,77,71,44,7);
       // list.stream().min(Integer::compare).ifPresent(System.out::println);

        List<Integer> list= Arrays.asList(23,56,77,71,44,7);
        list.stream().max(Integer::compare).ifPresent(System.out::println);

    }
}
