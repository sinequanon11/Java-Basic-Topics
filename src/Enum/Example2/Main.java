package Enum.Example2;

public class Main {

    enum Transport{
        PLANE(600), TRAIN(80), AUTOMOBILE(50);

        int speed;

        Transport (int s){
            speed = s;

        }
    }

    public static void main(String[] args) {

        Transport allTransports[] = Transport.values();

        for (Transport t: allTransports ) {
            System.out.println(t);

                   }
        System.out.println(Transport.AUTOMOBILE.speed);

        }

    }

