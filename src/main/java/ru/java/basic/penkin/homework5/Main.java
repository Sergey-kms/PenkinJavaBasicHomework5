package ru.java.basic.penkin.homework5;          // Ветка с названием "Vetka1" на github

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kot Begemot", 5, 50);
        Dog dog = new Dog("Muhtar", 10, 5, 100);
        Horse horse = new Horse("Udaloy", 40, 3, 150);

        cat.run(10);
        dog.run(40);
        horse.run(90);

        cat.swim(5);
        dog.swim(15);
        horse.swim(30);

        cat.info();
        dog.info();
        horse.info();
    }
}
