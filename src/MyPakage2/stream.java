package MyPakage2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class stream {
    public static void main(String[] args) {
      List<String> object= Arrays.asList("Alice","Roy","Fredick","Mike Tyson");
        object.stream().filter(str->str.length() >0).forEach(System.out::println);

    }
}


//ArrayList<String> data = new ArrayList<>();
//        data.add("Alice");
//        data.add("Roy");
//        data.add("JackSparrow");
//
//Stream<String> obj2 = data.stream();
////obj2.forEach(System.out::println);
//        obj2.filter(name -> name.startsWith("J"))
//        .forEach(System.out::println);