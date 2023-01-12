package Ternary;

public class TernaryOperator {
    public static void main(String[] args) {

        // SAYI TEK Mİ ÇİFT Mİ

        // ÖNCE IF ELSE İLE

        int num=20;
        if (num%2==0){ System.out.println("Sayı çifttir");}
        else { System.out.println("Sayı tektir");}

    // TERNARY İLE

        int number=15;
        System.out.println(number%2==0 ? "Sayı  çifttir" : "Sayı tektir");

        // SORU

        int x=5;
        System.out.println(x>2 ? x<4 ? 10 : 8 : 7); // Ne yazdırır?
        // önce x>2 ? ... : 7 yapmak lazım. 7 elendi. Geriye x<4 ? 10 : 8 kaldı , sonuç 8

}

}
