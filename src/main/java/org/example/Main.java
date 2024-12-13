package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilot bimsara = new Pilot("acde070d-8c4c-4f0d-9d8a-162843c10333","Bimsara", 21 );
        Pilot yashasshree = new Pilot("aod89s0d-23as-fa12-sd32-1o0o9si8ue73","Yashasshree", 21);

        System.out.println(bimsara.getId());
        System.out.println(bimsara.getName());
        System.out.println(bimsara.getAge());
    }
}