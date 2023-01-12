package ReverseAString;

public class ReverseString2 {
    public static void main(String[] args) {

        // METHOD 2

        String a="I love Java";
        char [] b=a.toCharArray();
        int c=b.length;

        String r="";
        for (int i=c-1; i>=0; i--){
            r+=a.charAt(i);
        }
        System.out.println(r);

    }
}
