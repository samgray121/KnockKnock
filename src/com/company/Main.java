package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Knock Knock! Guess Who!!");
        String nameGuess = sc.nextLine();

        if(nameGuess.equals("Marty McFly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("...from the future.");
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }

    }
}
