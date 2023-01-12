package Arrays_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOrArrayList {
    public static void main(String[] args) {

        // İKİSİNİN KULLANIMINDA ÇOK FARK YOK ASLINDA
        // LinkedList ve ArrayList Java Collections framework parçası ve List Interface'i implement ediyorlar
        // In ArrayList getting an element is faster, easier, in LinkedList add/remove is faster, easier
        // yapacağımız programda, liste çok değişmeyecekse ve get element yapmak istiyorsak, ArrayList kullanmalıyız
        // yapacağımız programda, listeye ekleme ve çıkarma yapacaksak ve element almayacaksak, LinkedList daha iyi

        LinkedList<String> namesLinkedList=new LinkedList<>(); // STARTS FROM FIRST ELEMENT, 2,3,4 FINDS THE ONE WE WANT
        namesLinkedList.add("John");                            // ADD VE REMOVE DAHA HIZLI
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2)); // "George"u aldık. 3.
        namesLinkedList.add(1,"Jerry"); // "Jerry" ekledik
        System.out.println(namesLinkedList);

        String [] names=new String[4];
        ArrayList<String> namesArrayList=new ArrayList<>(); // FINDS THE ELEMENT WE WANT
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList.get(2));
        namesArrayList.add(1,"Jerry"); // "Jerry" ekledik
        System.out.println(namesArrayList);
    }
}
