package Pratices.Abstraction;

abstract public class Animal {

    private String ten;
    private String eat;
    private String sound;

    public Animal(String ten, String eat) {
        this.ten = ten;
        this.eat = eat;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println("Animal is eating.");
    };
}
