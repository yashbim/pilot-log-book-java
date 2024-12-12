package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilot bimsara = new Pilot();
        Pilot yashasshree = new Pilot();

        bimsara.setId("b#ms@r@");
        bimsara.setName("Bimsara");
        bimsara.setAge(21);
        System.out.printf(bimsara.getId());
    }
}