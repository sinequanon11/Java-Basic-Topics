package Exception;

public class TryCatchFinally {

    public static void main(String[] args) {

        try {
            // code that may cause an exception
            int myInt=Integer.parseInt("pants"); // pants ten number elde edilemez
            System.out.println("After parsing pants");

        } catch (NumberFormatException e) { // |ArithmeticException vs ekleme yapabiliriz aynı satıra, e den önce
            // code that we want to execute if this type of exception
            System.out.println("You can't make an int out of that!");
        }
        finally { // whether there was an exception or not / works always // her zaman çalışır ve yazar, override
            System.out.println("in the finally block");

        }
        System.out.println("End here.");

    }
}
