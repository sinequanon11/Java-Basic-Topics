package Polymorphism.DynamicPolyM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // İKİ TÜRK POLYM VARDIR: 1-STATIC, 2-DYNAMIC

        // dynamic polym= after compilations, during runtime

        Scanner scan=new Scanner(System.in);
        Animal animal;
        System.out.println("What animal do you want?");
        System.out.print("1=dog or 2=cat : ");

        int choice= scan.nextInt();

        if (choice==1){
            animal=new Dog();
            animal.speak();

            }

            else if (choice==2) {
                animal=new Cat();
                animal.speak();
        }
            else {
                animal=new Animal();
                System.out.println("This choice is invalid");
                animal.speak();
        }
    }
}
