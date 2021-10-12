package ru.geekbrains.lesson6.animals;

public abstract class Animal {
    protected int swim;
    protected int run;
    protected String name;


    public abstract void run(int length);
    public abstract void swim(int length);


    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "\n   Кличка -> " + name + "\n   Пробежал -> " + run + "\n   Проплыл -> " + swim + "\n";
    }
}