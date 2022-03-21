package ru.geekbrains.lesson7;

public class MainApp {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Maks", 5),
                new Cat("Tony Stark", 4),
                new Cat("Pavlik",10),
                new Cat("Onotole", 20),
                new Cat("Oleksei", 18),
        };
        Plate plate = new Plate(8);
        plate.info();

        for (Cat cat : cats) {
            if (cat.isHungry() && cat.getAppetite() <= plate.getFood()) {
                cat.eat(plate);
            }
            if (!plate.checkFood(cat.getAppetite()) && cat.getAppetite() > plate.getFood()){
                plate.increaseFood();
            }
        }

        for (Cat cat2 : cats) {
            if (cat2.getSatiety() == 0) {
                plate.increaseFood();
                cat2.eat(plate);
            }
        }

        for (Cat cat3 : cats) {
            cat3.eat(plate);
        }

        for (Cat cat1 : cats) {
            if (!cat1.isHungry()) {
                System.out.printf("\n%s наелся\n" + "\n", cat1.getName());
            } else {
                System.out.printf("%s остался голодным, ему не хватило %d единиц еды\n",
                        cat1.getName(), cat1.getAppetite() - plate.getFood());
            }
        }

    }
}
