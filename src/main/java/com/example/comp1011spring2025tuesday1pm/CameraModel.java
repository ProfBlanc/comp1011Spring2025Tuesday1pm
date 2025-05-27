package com.example.comp1011spring2025tuesday1pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CameraModel {

    /*

    Create at least 5 attributes of a Camera
        (Brand, Pixels, Color, memory, etc)

        At least 1 enum
        Create getters and setters for all private attributes
        Create 2 constructors: 1) default 2) 5-args


        Tasks 2:

        For all enums getters: iso returning enum, return String
        For all setters: get a min value. if min value is not met, throw illegalargument exception
        create a method called getAll{enum} example: getAllMemoryOptions
                return an ArrayList of all the enum values

     */
    enum MemoryOptions {GB_32, GB_64, GB_128}  //list of possibilities
    MemoryOptions memory = MemoryOptions.GB_32;

    private String color = "Black";
    enum AvailableBrands {CANON, POLAROID, SONY}
    AvailableBrands brand = AvailableBrands.CANON;

    /** pixels per inch */
    private double resolution;
    /** lens length in millimeters */
    private int lensLength;

    public String getMemory() {
        return memory.toString();
    }

    public void setMemory(MemoryOptions memory) {
        memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] allowedColors = "red,green,black,blue,purple,orange".split(",");

        ArrayList<String> values = new ArrayList<>(); //create a dynamic series of values
        values.add("hi");values.add("bye");
        System.out.println(values.size());
        values.remove("hi");
        values.contains("bye");

        //if(color.length() < 3)
            //throw new IllegalArgumentException("Color must be at least 3 characters");

        if(!Arrays.asList(allowedColors).contains(color.toLowerCase()))
            throw new IllegalArgumentException("Invalid color chosen");

        this.color = color;
    }

    public String getBrand() {
        return brand.toString();
    }

    public void setBrand(AvailableBrands brand) {
        this.brand = brand;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        if(resolution < 1080)
            throw new IllegalArgumentException("Invalid resolution");
        this.resolution = resolution;
    }

    public int getLensLength() {
        return lensLength;
    }

    public void setLensLength(int lensLength) {
        if(lensLength < 10)
            throw new IllegalArgumentException("Invalid Lens Length");
        this.lensLength = lensLength;
    }

    public ArrayList<String> getAllBrands(){
        /*
            create a new ArrayList
                iterate through all values of AvaialbleBrands
                add each value to the ArrayList variable
                return the arraylist variable
                change the signature to ArrayList

                do the same for MemoryOptions


         */
        //return Arrays.asList(Arrays.toString(AvailableBrands.values()));

        ArrayList<String> values = new ArrayList<>();
        for(AvailableBrands b : AvailableBrands.values()){
            values.add(b.toString());
        }
        return values;

    }

    public ArrayList<String> getAllMemoryOptions(){

        //return List.of(Arrays.toString(MemoryOptions.values()));

        ArrayList<String> values = new ArrayList<>();
        for(MemoryOptions mo : MemoryOptions.values()){
            values.add(mo.toString());
        }
        return values;

    }

    public CameraModel(){}

    public CameraModel(MemoryOptions memory, String color, AvailableBrands brand, double resolution, int lensLength) {
//        memory = memory;
//        this.color = color;
//        this.brand = brand;
//        this.resolution = resolution;
//        this.lensLength = lensLength;

        setMemory(memory);
        setColor(color);
        setBrand(brand);
        setResolution(resolution);
        setLensLength(lensLength);
    }

    public String comboBoxDisplay(){

        return String.format("%s %s Camera with %s", color, brand, resolution);
    }

    @Override
    public String toString() {
        return "CameraModel{" +
                "memory=" + memory +
                ", color='" + color + '\'' +
                ", brand=" + brand +
                ", resolution=" + resolution +
                ", lensLength=" + lensLength +
                '}';
    }
}
