package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TurnListIntoSet {

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("Selenium");
        list.add("Testing");
        list.add("Cucumber");
        list.add("Cucumber");

        System.out.println( "This value from List: "+ list); // Cumcumber'i 2 kere yazdırdı

        Set<String> set=new HashSet<String>(list);

        System.out.println("This value from Set: " + set); // Set'te tekrar olmaz, 1 kere yazdırdı




    }
}
