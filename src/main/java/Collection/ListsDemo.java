package Collection;

import java.util.*;

public class ListsDemo {

    public static void main(String[] args) {

        List<String> gNames = new ArrayList<String>();


        //Add
        gNames.add("Vivek");//0
        gNames.add("OD");//1
        gNames.add("AB");//2
        gNames.add("SK");//3

        //Remove
        gNames.remove("OD");

        //Size
        System.out.println(gNames.size());

        //Fetch item based on index position
        System.out.println(gNames.get(2));

        //Contains
        if (gNames.contains("AB")) {
            System.out.println("AB exist in the list");
        }else {
            System.out.println("AB does not exits in the list");
        }
        //Add Element
        gNames.add("OD");

        //Find Position
        System.out.println(gNames.indexOf("OD"));

        Iterator<String> i1= gNames.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

        Collections.sort(gNames);
        System.out.println(gNames);

        //Array in java
        String[] names = {"AB", "JP", "AK"};
        Arrays.sort(names);
        System.out.println("Sorting Array");
        //System.out.println(names);

        for (String s : names){
            System.out.println(s);
        }
    }
}
