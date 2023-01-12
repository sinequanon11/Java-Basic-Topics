package Immutable_;

public class ImmuntableStrings_Example2 {
    public static void main(String[] args) {

        // IMMUTABLE (DEĞİŞTİRİLEMEYEN) STRING ELIMINATES THE SECURITY RISKS

        String name="John";             // String pool'a atıyor
        String anotherName="John";      // Bunu da yukardaki poola atıyor, aynı hafızayı kullanıyor.

        String aThirdName=new String("John"); // new olduğu için pooldakine gitmeyecek new object yaratacak

        System.out.println(name==anotherName); // true
        System.out.println(name==aThirdName);  // false

        addMoneyToAccount(name,500);

    }
    public static void addMoneyToAccount (String accountholder, int moneyToAdd){
        // validation
        // ...

    }
}
