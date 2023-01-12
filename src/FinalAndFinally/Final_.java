package FinalAndFinally;

public class Final_ {


        final int speed1=60;
        int speed2=75;

        public void drive(){
           // speed1=100; speed1 modifier'i final olduğu için kabul etmiyor // CANNOT BE MODIFIED
              speed2=200;
        }

        public static void main(String[] args) {


    }
}
