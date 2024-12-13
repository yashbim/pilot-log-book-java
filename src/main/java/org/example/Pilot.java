package org.example;

public class Pilot {
    private String id;
    private String name;
    private int age;

    public Pilot(String id, String name, int age) {
//        if (id.length() == 36) {
//            this.id = id;
//        } else {
//            this.id = "invalid";
//        }
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
