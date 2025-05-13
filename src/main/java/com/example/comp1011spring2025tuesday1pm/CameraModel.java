package com.example.comp1011spring2025tuesday1pm;

public class CameraModel {

    /*

    Create at least 5 attributes of a Camera
        (Brand, Pixels, Color, Memory, etc)

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
    MemoryOptions Memory = MemoryOptions.GB_32;

    private String Color = "Black";
    enum AvailableBrands {CANON, POLAROID, SONY}
    AvailableBrands Brand = AvailableBrands.CANON;

    /** pixels per inch */
    private double resolution;
    /** lens length in millimeters */
    private int lensLength;

    public MemoryOptions getMemory() {
        return Memory;
    }

    public void setMemory(MemoryOptions memory) {
        Memory = memory;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public AvailableBrands getBrand() {
        return Brand;
    }

    public void setBrand(AvailableBrands brand) {
        Brand = brand;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public int getLensLength() {
        return lensLength;
    }

    public void setLensLength(int lensLength) {
        this.lensLength = lensLength;
    }
}
