package com.company;
import java.util.Random;
import java.util.Scanner;

public class Soldier {
    private String militaryRank;
    private String code;

    public Soldier() {

    }

    public Soldier(String militaryRank, String code) {
        this.militaryRank = militaryRank;
        this.code = code;
    }

    public String getmilitaryRank() {
        return militaryRank;
    }

    public void setName(String militaryRank) {
        this.militaryRank = militaryRank;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void shoot(){
        Scanner input = new Scanner(System.in);
        String [] soldier = new String[15];
        for (int i = 0 ; i < 15 ; i++) {
            Random random = new Random();
            int x = random.nextInt(100);
            System.out.println("inter the soldier's code ; ....");
            soldier [i] = input.next();
            System.out.println( "shooting points : " + x );
    }

    }

}
