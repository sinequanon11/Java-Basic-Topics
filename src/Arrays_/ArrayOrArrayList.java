package Arrays_;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOrArrayList {
    public static void main(String[] args) {

        // SONUÇ= ARRAYLIST ÇOK DAHA KULLANIŞLI, EKLEME YAPILABİLİYOR, PRİNT DİREKT, KOLAYLIKLAR VAR
        // Array'de primitive'ler de olabilir
        // ArrayList'te primitive'ler olamaz, String olur ama int olamaz, Integer olur (Integer=one of Wrapper Class)

        // String[] friendsArray = new String[4];   şimdilik kullanmadık  // ARRAY
        // ArrayList<String> friendsArrayList = new ArrayList<>();  // şimdilik kullanmadık  // ARRAYLIST

        // Array Index: [0] [1] [2] [3]

        String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"};

        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        System.out.println(friendsArray2[1]);       // ARRAY GET ELEMENT
        System.out.println(friendsArrayList2.get(1)); // ARRAYLIST GET ELEMENT

        System.out.println(friendsArray2.length);      // ARRAY - LENGTH
        System.out.println(friendsArrayList2.size());  // ARRAYLIST - SIZE

        // ARRAYS have a fixed length, you cannot add, in ArrayList you can do it, like;
        // add an element / you can't do it in Arrays :(
        friendsArrayList2.add("Mitch");
        System.out.println(friendsArrayList2.get(4));

        // set an element
        friendsArray2 [0] = "Carl";             // SET IN ARRAY
        System.out.println(friendsArray2[0]);
        friendsArrayList2.set(0,"Carl");        // SET IN ARRAYLIST
        System.out.println(friendsArrayList2.get(0));

        // remove an element (in ARRAYLIST yes, in ARRAY no)
        friendsArrayList2.remove("Chris");
        System.out.println(friendsArrayList2.get(1));

        // how to print Array and Arraylist

        System.out.println(friendsArray2);      // Array için for loop yapmak lazım
        System.out.println(friendsArrayList2); // ArrayList direkt böyle print edilebiliyor












    }
}
