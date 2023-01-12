package ForLoop;

public class StarPatternPyramid {

    public static void main(String[] args) {

        for (int i=1; i<=5; i++){           // 5 satır demek

            for (int s=1; s<=5-i; s++){     // soldaki boşluk sayısı 4'ten başladı azalmaya
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1;j++){ // yıldız sayısı artıyor
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


