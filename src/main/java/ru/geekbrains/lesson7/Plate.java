package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food < amount) {
            increaseFood();
        } else {
            this.food -= amount;
        }
    }

    boolean checkFood(int amount) {
        return (food - amount) >= 0;
    }

    public void increaseFood() {
        this.food += 30;
        System.out.println("\n" + "Еды мало! В тарелку добавили 30 корма\n");
    }
    public int getFood() {
        return food;
    }

    public void info() {
        System.out.printf("\nВ тарелке находится [ %d ] корма \n" + "\n", food);
    }
}
