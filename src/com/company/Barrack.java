package com.company;

import java.util.Random;
import java.util.Scanner;

public class Barrack {


    public void shoot() {
        Scanner input = new Scanner(System.in);
        String[] soldier = new String[15];
        int[] m = new int[15];
        for (int i = 0; i < 15; i++) {
            for (int m = 0; m < 15; m++) {
                Random random = new Random();
                int [m] =random.nextInt(10);
                System.out.println("round(1)");
                System.out.println("inter the soldier's code : .... ");
                soldier[i] = input.next();
                System.out.println("shooting points : " + x1);
                System.out.println(b);
            }
        }
        String[] soldier1 = new String[15];
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int x2 = random.nextInt(10);
            System.out.println("round(2)");
            System.out.println("inter the soldier's code ; ....");
            soldier1[i] = input.next();
            System.out.println("shooting points : " + x2);

        }
        String[] soldier2 = new String[15];
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int x3 = random.nextInt(10);
            System.out.println("round(3)");
            System.out.println("inter the soldier's code ; ....");
            soldier2[i] = input.next();
            System.out.println("shooting points : " + x3);

        }
        String[] soldier3 = new String[15];
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int x4 = random.nextInt(10);
            System.out.println("round(4)");
            System.out.println("inter the soldier's code ; ....");
            soldier3[i] = input.next();
            System.out.println("shooting points : " + x4);

        }

        String[] finale = new String[4];
        for (int i = 0; i < 4; i++) {
//         int total = {int x1 + int x2 + int x3 +int x4} ;
        }


    }
}
