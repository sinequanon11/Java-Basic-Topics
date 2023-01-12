package ReverseAString;

public class ReverseString1 {
    public static void main(String[] args) {

        // METHOD 1

        String str="Automation";
        String rev="";
        char ch [] =str.toCharArray();
        for (int i=ch.length-1; i>=0; i--){
            rev+=ch[i];

        }
        System.out.print(rev);
    }
}
