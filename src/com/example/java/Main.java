package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int temperature = 95;
        int usertemp = 0 ;
        Scanner scanner = new Scanner(System.in);


        while (usertemp == 0) {
            System.out.println("what is the temperature?");

            usertemp = scanner.nextInt();

            if (usertemp<97.5) {
                System.out.println( "low" );
            }

            else if (usertemp>99.5) {
                System.out.println("high");
            }
            else {
            System.out.println("normal");
            }
        }


    }
}
