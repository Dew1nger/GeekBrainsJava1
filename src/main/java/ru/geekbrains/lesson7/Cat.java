package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;
        this.isHungry = true;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Cat:\n " + name + ", hungry: " + isHungry);
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if(satiety == 1){
            System.out.println(name + " больше не голоден \n");
        } else if(plate.getFood() >= appetite){
            plate.decreaseFood(appetite);
            setSatiety(1);
            setHungry(false);
            System.out.printf("\n%s съел %d корма\n" + "\n", this.name, this.appetite);
            info();
            plate.info();
        }
    }
}
