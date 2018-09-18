/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;

public class Car {
    private int horsepower, maxspeed;
    private double height, width, length;
    private String color, brand;

    public int getHorsepower() {
        return horsepower;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(int horsepower, int maxspeed, double height, double width, double length, String color, String brand) {
        this.horsepower = horsepower;
        this.maxspeed = maxspeed;
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;
        this.brand = brand;
    }
}
