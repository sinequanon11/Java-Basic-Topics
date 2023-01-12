package OOPAbstract;

abstract class Animal {
    public abstract void animalSound(); // abstract does not have a body
    public void sleep(){
        System.out.println("zzz zzz");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("weee wee wee");
    }
}

class Main{
    public static void main(String[] args) {
        Pig myPig=new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}