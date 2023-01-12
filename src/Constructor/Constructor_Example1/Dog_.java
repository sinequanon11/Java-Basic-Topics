package Constructor.Constructor_Example1;

public class Dog_ {

    String name;
    int age;

    public Dog_(){

    }

    public Dog_(String name){
        this.name=name;
    }

    public Dog_(int age){
        this.age=age;
    }

    public Dog_(String name, int age){
        this.name=name;
        this.age=age;
    }
}
