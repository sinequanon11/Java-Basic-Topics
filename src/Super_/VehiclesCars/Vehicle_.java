package Super_.VehiclesCars;

 class Vehicles {

     int maxSpeed = 120;

     public void vroom(){
         System.out.println("Vroom vroom");
     }
     Vehicles (){
         System.out.println("Vehicles constructor");
     }
}
 class Cars extends Vehicles{

     int maxSpeed = 100;

     public void display (){
         System.out.println(super.maxSpeed);
     }

     public void vroom (){
         super.vroom();
     }


     Cars (){

         System.out.println("Cars constructor");

     }
}

class Main {

    public static void main(String[] args) {

        Cars c = new Cars();
        c.display();
        c.vroom();

    }
}