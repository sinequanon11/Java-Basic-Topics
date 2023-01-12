package OOPAbstract.Eample1;

//   interface DogInterface{
//   void poop();
//   }                    // INTERFACE DE SADECE METODSUZ VAR

abstract class Dog{
    public void bark(){
        System.out.println("Dog barked!");  // 1 -- METOD VAR
    }

    public abstract void poop();  // 2 -- METOD YOK     İKİSİ BİRDEN ANCAK ABSTRACT TE OLABİLİR
}
class Chihuahua extends Dog {
    @Override
    public void poop() {
        System.out.println("Dog pooped!");

    }

}

public class AbstractTutorial {

    public static void main(String[] args) {

        Chihuahua c=new Chihuahua();
        c.bark();
        c.poop();

          }
}
