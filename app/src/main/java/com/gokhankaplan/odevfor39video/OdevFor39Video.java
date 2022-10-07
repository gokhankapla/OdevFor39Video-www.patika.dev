package com.gokhankaplan.odevfor39video;

import java.util.Scanner;

public class OdevFor39Video {
    public static void main(String[] args) {

        int number, toplam;
        toplam = 0;


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen bir sayı giriniz: ");
            number = input.nextInt();
            if (number % 4 ==0) {
                toplam += number;
            }

        } while(number % 2 ==0);

        System.out.println("Toplam: " + toplam);

    }
}
