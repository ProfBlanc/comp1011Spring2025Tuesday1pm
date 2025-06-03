package com.example.comp1011spring2025tuesday1pm;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Participant {

    private String name;
    private Image avatar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public Participant(String name, Image avatar){
        setName(name);
        setAvatar(avatar);
     }

    public static ArrayList<String> getAllAvatars(){

        ArrayList<String> avatars = new ArrayList<>();
        avatars.add("avatar1.png");
        avatars.add("avatar2.png");
        avatars.add("avatar3.png");

        return avatars;
    }
    public static ArrayList<String> getAllNames(){

        ArrayList<String> names = new ArrayList<>();

        names.add("Hungry Tiger");
        names.add("Baby Duck");
        names.add("Baby Chicken");
        names.add("Baby Pig");
        return names;
    }

}
