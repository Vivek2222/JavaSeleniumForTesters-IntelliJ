package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> s1 = new HashSet<String>();

        //add
        s1.add("Fridge");//0
        s1.add("Veggies");//1
        s1.add("Fridge");//2
        s1.add("Fruits");//3

        //size
        System.out.println(s1.size());

        //remove
        s1.remove("Fridge");

        System.out.println(s1.size());

        Iterator<String> i1= s1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
