package MyPakage2;

import java.util.ArrayList;
import java.util.List;

class product{
    int id;
    String name;
    double prize;

    public product(int id, String name, double prize){
        this.id=id;
        this.name=name;
        this.prize=prize;
    }

}


public class filter {
    public static void main(String[] args) {

        List<product> pro= new ArrayList<product>();
        pro.add(new product(1,"HP Laptop", 23000.0));
        pro.add(new product(2,"Dell Laptop", 55000.0));
        pro.add(new product(3,"Huwawe Laptop", 80000.0));

        pro.stream().filter(num->num.prize>23000.0).forEach(pr->System.out.println(pr.prize));

    }
}
