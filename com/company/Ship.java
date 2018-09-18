/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;


public class Ship {
    private double weight, hight, width, length, maxspeed;
    private String color;

    public Ship(double weight, double hight, double width, double length, double maxspeed, String color) {
        this.weight = weight;
        this.hight = hight;
        this.width = width;
        this.length = length;
        this.color = color;
        this.maxspeed = maxspeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxspeed(double maxspeed){
        this.maxspeed = maxspeed;
    }

    public double getMaxspeed() {
        return this.maxspeed;
    }
}
