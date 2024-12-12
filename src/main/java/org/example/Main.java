package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilot bimsara = new Pilot();
        Pilot yashasshree = new Pilot();

//        bimsara.setId("b#ms@r@");
        bimsara.setId("acde070d-8c4c-4f0d-9d8a-162843c10333");
        bimsara.setName("Bimsara");
        bimsara.setAge(21);
        System.out.println(bimsara.getId());
        System.out.println(bimsara.getName());
        System.out.println(bimsara.getAge());
    }
}