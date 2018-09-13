package Udemy;

/**
 * Created by CianC on 16/10/2017.
 */
public class Main {
    public static void main(String[]args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 10, 2, 4, 1, 20, "Long Silky");
        dog.eat();
        //dog.walk();
        dog.run();
    }
}
