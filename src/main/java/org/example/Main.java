package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter Pilot ID");
        String pilotID = myscanner.nextLine();
        System.out.println("Enter Flight Registration");
        String flightRegistration = myscanner.nextLine();
        System.out.println("Enter Flight Time (Minutes)");
        int flightTime = myscanner.nextInt();

        // print input

        System.out.println(
                "Pilot ID : " + pilotID + "\n" +
                "Flight Registration : " + flightRegistration + "\n" +
                "Flight Time : " + flightTime);
    }
}