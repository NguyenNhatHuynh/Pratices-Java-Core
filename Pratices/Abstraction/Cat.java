package Pratices.Abstraction;

public class Cat extends Animal {
    public Cat(String ten, String eat) {
        super(ten, eat);
    }

    @Override
    public void makeSound() {
        System.out.println("Meo Meo");
    }
}
