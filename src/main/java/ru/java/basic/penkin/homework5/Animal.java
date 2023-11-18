package ru.java.basic.penkin.homework5;       // Ветка с названием "Vetka1" на github

public class Animal {
    String name;
    double speedRun;
    double speedSwim;
    int stamina;

    public Animal(String name, double speedRun, double speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }

    public double run(int distance) {
        if (stamina >= distance) {
            double time = distance / speedRun;
            stamina -= distance;
            System.out.println(name + " пробежал " + distance + " метров за " + time + " секунд");
            return time;
        } else {
            System.out.println(name + " устал и не может пробежать " + distance + " метров");
            return -1;
        }
    }

    public double swim(int distance) {
        System.out.println(name + " не умеет плавать");
        return -1;
    }

    public void info() {
        System.out.println(name + ": выносливость - " + stamina);
    }
}

class Cat extends Animal {
    public Cat(String name, double speedRun, int stamina) {
        super(name, speedRun, 0, stamina);
    }
}

class Dog extends Animal {
    public Dog(String name, double speedRun, double speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public double swim(int distance) {
        int staminaRequired = distance * 2;
        if (stamina >= staminaRequired) {
            double time = distance / speedSwim;
            stamina -= staminaRequired;
            System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд");
            return time;
        } else {
            System.out.println(name + " устал и не может проплыть " + distance + " метров");
            return -1;
        }
    }
}

class Horse extends Animal {
    public Horse(String name, double speedRun, double speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public double swim(int distance) {
        int staminaRequired = distance * 4;
        if (stamina >= staminaRequired) {
            double time = distance / speedSwim;
            stamina -= staminaRequired;
            System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд");
            return time;
        } else {
            System.out.println(name + " устал и не может проплыть " + distance + " метров");
            return -1;
        }
    }
}
