package ru.geekbrains.lesson6.animals;

public class Cat extends Animal {
    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

        @Override
        public void run(int length) {
        if((length >= 0) && (length <= 200))
            System.out.println(name + " пробежал " + length);
    }

        @Override
        public void swim(int length) {
    }

        @Override
        public String toString(){
        return "Cat:\n   Кличка -> " + name + "\n   Пробежал -> " + run + "\n   Проплыл -> " + " Коты не умеют плавать " + "\n";
    }
}

