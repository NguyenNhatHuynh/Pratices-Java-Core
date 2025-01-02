package Pratices.Abstraction;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Dog Ben1", "Xuong"),
                new Cat("Cat Ben1", "Xuong")
        };

        for (Animal ani : animals) {
            ani.makeSound();
            ani.eat();
        }
    }
}
