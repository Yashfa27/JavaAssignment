package MyPakage2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class employees{
    int id;
    String name;
    double salary;

    public employees(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

}


public class StreamFilterMapWithClass {
    public static void main(String[] args) {
        List<employees> data = new ArrayList<>(); // Use mutable ArrayList
        List<String> names = new ArrayList<>();

        data.add(new employees(1, "Alice", 30000.0));
        data.add(new employees(2, "Jack", 40000.0)); // Updated IDs
        data.add(new employees(3, "Linda", 50000.0));

      names=data.stream().filter(result->result.salary>1000.0)
                .map(result->result.name).collect(Collectors.toList());
        System.out.println(names);
    }
}
