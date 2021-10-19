package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[][] map = new int[10][10];

        for (int i = 0; i < 10; i++) {
            int xCord = random.nextInt(10);
            int yCord = random.nextInt(10);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
