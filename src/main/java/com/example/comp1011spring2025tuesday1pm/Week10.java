package com.example.comp1011spring2025tuesday1pm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Modifier;

class Person {

    @Expose
    private String name;

    @Expose
    @SerializedName("hero_name")
    private String secretIdentity = "Super Hero";


    private int age;

    @Expose
    private double height;

    protected double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}

public class Week10 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(20);
        person.setHeight(150.5);
        person.setName("Person");

        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.PUBLIC, Modifier.PROTECTED)
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        String json = gson.toJson(person);
        System.out.println(json);

        Person ob = gson.fromJson(json, Person.class);
        System.out.println(ob);
    }
}
