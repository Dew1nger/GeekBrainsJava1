package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    private static Scanner sc;
    private static Random rand;
    private static char[][] map;

    private static final int MAP_SIZE = 5;

    private static char DOT_EMPTY = '*';
    private static char DOT_X = 'X';
    private static char DOT_0 = '0';

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        rand = new Random();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if(checkWin(DOT_X)){
                System.out.println("Вы победили!");
                break;
            }
            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if(checkWin(DOT_0)){
                System.out.println("Победил компьютер!");
                break;
            }
            if(isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

        public static boolean checkWin(char dot) {
            int diagonalLeft, diagonalRight, x, y;
            for (int i = 0; i < MAP_SIZE; i++) {
                x = 0; y = 0;
                for (int j = 0; j < MAP_SIZE; j++) {
                    if(map[i][j] == dot) {
                        x++;
                    }else{
                        x = 0;
                    }
                    if(map[j][i] == dot) {
                        y++;
                    }else {
                        y = 0;
                    }
                }
                if(x >= MAP_SIZE - 1 || y >= MAP_SIZE - 1){
                    return true; // проверка по горизонтали и вертикали
                }
            }
            diagonalLeft = 0; diagonalRight = 0;
            for (int i = 0; i < MAP_SIZE; i++) {
                if(map[i][i] == dot) {
                    diagonalLeft++;
            }else{
                    diagonalLeft = 0;
                }
                if(map[i][MAP_SIZE - i - 1] == dot) {
                    diagonalRight++;
                }else{
                    diagonalRight = 0;
                }
          }
            if(diagonalLeft >= MAP_SIZE - 1 || diagonalRight >= MAP_SIZE - 1) {
                return true; // проверка по диагоналям
            }

            return false;
        }

    public static boolean isMapFull() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if(map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;

        do {
            x = rand.nextInt(MAP_SIZE);
            y = rand.nextInt(MAP_SIZE);
        } while (!isCellValid(x, y));

        map [x][y] = DOT_0;
        System.out.println("Компьютер походил в точку" + " " + (x + 1) + " " + (y + 1));
    }

    public static void humanTurn() {

        int x, y;

        do {
            System.out.println("Введите координаты хода в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));

        map [x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= MAP_SIZE || y < 0 || y >= MAP_SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= MAP_SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++)  {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }

}
