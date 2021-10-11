package ru.geekbrains.lesson5;

public class HomeWorkApp {
    public static void main(String[] args) {
        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Петровский Петр Петрович", "Суецидник",
                "zakazsmerti@yandex.ru", "88005553535",150000, 75);
        workArray[1] = new Worker("Железный Тони Старк", "Железный Человек",
                "tonystark@icloud.com", "+35777777777",777777, 42);
        workArray[2] = new Worker("Иванов Реймонд Баббит", "Человек дождя",
                "nichegonepomny@mail.ru", "89283566545",50000, 84);
        workArray[3] = new Worker("Меладзе Валерий Шотаевич", "Шоумен",
                "prityajenya-net@gmail.com", "89282557878",978452, 56);
        workArray[4] = new Worker("Терпилов Иннакентий Работаевич", "Сантехник",
                "chinyvashunitaz777@mail.ru", "89118887744",21000, 42);

        for (int i = 0; i < workArray.length ; i++) {
            if (workArray[i].getAge() > 40) {
                workArray[i].info();
            }
        }
    }
}
