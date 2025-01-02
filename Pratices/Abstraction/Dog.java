package Pratices.Abstraction;

public class Dog extends Animal {

    public Dog(String ten, String eat) {
        super(ten, eat);
    }

    @Override
    public void makeSound() {
        System.out.println("Quau Quau");
    };

}
