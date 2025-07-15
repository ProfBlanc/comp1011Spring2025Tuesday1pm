package com.example.comp1011spring2025tuesday1pm;


public class Player {


    private int id;
    private String first_name;
    private String last_name;
    private String position;

    public String getFirst_name() {
        return first_name;
    }

    public int getId() {
        return id;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPosition() {
        return position;
    }

    public String getFull_name(){
        return first_name + " " + last_name;
    }

}
