package org.example;

public class Pilot {
    private String id;
    private String name;
    private int age;

    public void setId(String id) {
        if (id.length() == 36) {
            this.id = id;
        } else {
            this.id = "invalid";
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
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
