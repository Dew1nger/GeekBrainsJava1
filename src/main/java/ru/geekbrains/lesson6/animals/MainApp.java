package ru.geekbrains.lesson6.animals;

public class MainApp {
    public static void main(String[] args) {
        int numberOfCats = 0;
        int numberOfDogs = 0;
        int allAnimals = 0;

        Animal[] animals = {
                new Cat("Олеша", 50, 0),
                new Cat("Онотоле", 30, 0),
                new Dog("Борщ", 100, 3),
                new Dog("Валера", 140, 9)
        };

        for(Animal animal : animals) {
            System.out.println(animal);
        }

        for(Animal animals3 : animals) {
            if(animals3 instanceof Cat) {
                numberOfCats++;
            }
        }
        System.out.println(" Кошек " + numberOfCats);

        for(Animal animals3 : animals) {
            if (animals3 instanceof Dog) {
                numberOfDogs++;
            }
        }
        System.out.println(" Собак " + numberOfDogs);

        for(Animal animals3 : animals) {
            allAnimals++;
        }
        System.out.println(" Животных " + allAnimals);
    }
}
