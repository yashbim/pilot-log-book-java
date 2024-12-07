package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pilotID = null;
        String flightRegistration = null;
        int flightTime = 0;

//        Function to add flights
        flightTime=addFlight(pilotID, flightRegistration, flightTime);

        System.out.println("Flight time in minutes : " + flightTime);
    }

    private static int addFlight(String pilotID, String flightRegistration, int flightTime) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter Pilot ID");
        pilotID = myscanner.nextLine();
        System.out.println("Enter Flight Registration");
        flightRegistration = myscanner.nextLine();
        System.out.println("Enter Flight Time (Minutes)");
        flightTime = myscanner.nextInt();

//        // print input
//        System.out.println(
//                "Pilot ID : " + pilotID + "\n" +
//                        "Flight Registration : " + flightRegistration + "\n" +
//                        "Flight Time : " + flightTime);
//        System.out.println("Done");

        return flightTime;


    }

}