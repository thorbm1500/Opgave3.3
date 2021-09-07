package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    System.out.println("Skriv et sekundtal:");
    Scanner scanner = new Scanner(System.in);
    int Input;
    double hours;
    double minutes;
    double seconds;
    Input =scanner.nextInt();
    hours = Input/3600;
    minutes = (Input % 3600)/60;
    seconds = (Input % 3600)%60;

    int hours_int;
    hours_int = (int) hours;
    int minutes_int;
    minutes_int = (int) minutes;
    int seconds_int;
    seconds_int = (int) seconds;
        System.out.printf("Number of hours: = %d \n",hours_int);
        System.out.printf("Number of hours: = %d \n",minutes_int);
        System.out.printf("Number of hours: = %d \n",seconds_int);
    }
}
