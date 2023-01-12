package Constructor.Constructor_Example2;

public class Car {

    public Car (String renk){
     System.out.println(renk +" araba üretildi");
    }

    public Car(int yil){
        System.out.println(yil+ " model araba üretildi");
    }

    public Car(int yil, String renk){
        System.out.println(yil+" model, " + renk+
                " renginde araba üretildi.");

    }

}
