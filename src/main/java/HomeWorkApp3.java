import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        invertArr(); //#1
        fillArr();  //#2
        changeArr(); //#3
        fillDiagonal(); //#4
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = sc.nextInt();
        System.out.println("Введите значения массива:");
        int initialValue = sc.nextInt();
        returnArray(len,initialValue); //#5
        int[] arr = {-285,54,-93,-123,-12,45,12}; //
        maxMin(arr);

    }

    public static void invertArr() {
        int[] arr = {1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr)); // Задание №1
    }

    public static void fillArr() {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]); //Задание №2
        }
    }

    public static void changeArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr)); //Задание №3
    }
    public static void fillDiagonal(){
        int rowsCols = 4;

        int[][] arr = new int[rowsCols][rowsCols];
        for (int i = 0; i < rowsCols; i++) {
            for (int j = 0; j < rowsCols; j++) {
                arr[i][i] = 1;
                if (arr.length - 1 - i == j){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); //Задание №4
        }
    }

    public static int[] returnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr; //Задание №5;
    }
    public static void maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println("Максимальный элемент массива:" + max);
        System.out.println("Минимальный элемент массивва:" + min);//Задание №6*
    }
}


