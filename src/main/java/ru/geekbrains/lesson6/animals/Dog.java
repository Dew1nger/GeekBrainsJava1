package ru.geekbrains.lesson6.animals;

public class Dog extends Animal {

    public Dog (String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void run(int length) {
        if((length >= 0) && (length <= 500))
            System.out.println(name + " пробежал " + length);
    }

    @Override
    public void swim(int length) {
        if((length >= 0) && (length <= 10))
        System.out.println(name + " проплыл " + length);
    }
}