package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> studentNames = new HashMap<Integer, String>();

        //add||Put
        studentNames.put(1, "Bliss");
        studentNames.put(2, "Michael");
        studentNames.put(3, "Rock");
        studentNames.put(3, "John");
        studentNames.put(4, "Mike");


        //Remove
        studentNames.remove(2);

        //Contains
        System.out.println(studentNames.containsKey(1));
        System.out.println(studentNames.containsValue("Michael"));  //false

        //get
        System.out.println(studentNames.get(4));

        //Size
        System.out.println(studentNames.size());

        //Remove
//        studentNames.remove(3);
//        //Size
//        System.out.println(studentNames.size());

        //iterator
//        studentNames.keySet().iterator();
//
//        //Value Iterator
//        studentNames.values().iterator();

        Iterator<Integer> i1= studentNames.keySet().iterator();
        while (i1.hasNext()){
            //System.out.println("Keys is: "+i1.next());
            System.out.println("Values is: "+studentNames.get(i1.next()));
        }

        Iterator<String> i2= studentNames.values().iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }
    }
}
