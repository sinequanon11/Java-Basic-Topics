package Exception;

public class TryCatchAB {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try {                               // risk oluşturması muhtemel kodların yazıldığı bölün
            System.out.println(a/b);        //
            System.out.println("Kod çalışıyor"); // yazdırmadı, çünkü 8. satırda durdu
            }                               //

        catch (ArithmeticException e){      // risk oluştuğunda ortaya çıkması beklenen exception
            e.printStackTrace();            // türünü ve öngördüğümüz exception'lar oluştuğunda
              e.getMessage();               // yapılacak işlemi belirttiğimiz bölüm

        }
        System.out.println("Kod çalışmaya devam ediyor"); // burayı yazdırdı


    }
}
