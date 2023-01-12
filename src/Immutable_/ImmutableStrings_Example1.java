package Immutable_;

public class ImmutableStrings_Example1 {
    public static void main(String[] args) {

        // STRING IMMUTABLE; STRINGBUILDER ISE MUTABLE , DEĞİŞTİRİLEMEDİĞİ İÇİN GÜVENLİ

        // primitive türlerde (mesela int)  == kullanırız, String'de kullanmayız, equals kullanırız

        String s="Hello"; // pointer ile heap'e gitti ve bir object oluşturdu
        s="Bye";           // pointer ile "Bye" yeni bir object oluşturur, "Hello" garbage collector'a gitti
                            // çünkü String immutable/değiştirilemez

        String a="Ali";                     // bu String pool'da - bu ve alttaki equals'dır, diğerleri değil
        String b="Ali";                     // bu String pool'da
        String c=b +"";                     // burda yeni object oluşturuldu
        String d=new String("Ali");  // burda yeni object oluşturuldu


    }
}
