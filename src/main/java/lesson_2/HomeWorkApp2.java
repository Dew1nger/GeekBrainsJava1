package lesson_2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(trueOrFalse(1, 5));
        posNumberOrNegNumber(5);
        System.out.println(isPositive(15));
        printManyTimes("Ha4iko", 5);
        System.out.println(leapYear(100));



    }
    public static boolean trueOrFalse(int a, int b) {
        return (a + b >= 10 && a + b <= 20); //Задание №1
    }
    public static void posNumberOrNegNumber(int a) {   //Задание №2
        if (a >= 0) {
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isPositive(int a) {        //Задание №3
        return a < 0;
    }
    public static void printManyTimes(String text, int a) {  //Задание №4
        for (int i = 0; i < a; i++) {
            System.out.println("Я " + text);
        }
    }

        public static boolean leapYear(int year) {
            return ((year % 400 == 0) || (year % 4 == 0)) && (year % 100 != 0);
        }
    }


