package MyPakage2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {
        List<String> object= Arrays.asList("miketyson","john","fredick","linda");
        List<String> finall= new ArrayList<String>();

        finall =object.stream()
                .map(value->value.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(finall);
    }
}
