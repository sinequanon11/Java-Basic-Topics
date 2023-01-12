package ReverseAString;

public class ReverseString0 {
    public static void main(String[] args) {

        String str="Automation";

        StringBuilder sb=new StringBuilder(str);

        StringBuilder rev=sb.reverse();
        System.out.println("reverse = " + rev);

    }
}
