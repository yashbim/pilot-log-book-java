package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pilotID = null;
        String flightRegistration = null;
        int flightTime = 0;
        addFlight(pilotID, flightRegistration, flightTime);
    }

    private static void addFlight(String pilotID, String flightRegistration, int flightTime) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter Pilot ID");
        pilotID = myscanner.nextLine();
        System.out.println("Enter Flight Registration");
        flightRegistration = myscanner.nextLine();
        System.out.println("Enter Flight Time (Minutes)");
        flightTime = myscanner.nextInt();
//        return pilotID, flightTime, flightRegistration;

        // print input
        System.out.println(
                "Pilot ID : " + pilotID + "\n" +
                        "Flight Registration : " + flightRegistration + "\n" +
                        "Flight Time : " + flightTime);
        System.out.println("Done");

    }

}