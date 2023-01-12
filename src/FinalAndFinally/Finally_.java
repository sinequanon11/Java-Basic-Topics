package FinalAndFinally;

public class Finally_ {

    public static void main(String[] args) {

        try {
            System.out.println("Execute try block");
            throw new Exception();

        } catch (Exception e){
            System.out.println("Error occured");
        }
        finally {
            System.out.println("Execution in finally block"); // he zaman çalışır
        }



    }
}
