
/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;

//Animal class
public class Animal {
    private double weight, height;
    private String name, habitat;

    //Animal constructor
    public Animal(double weight, double height, String name, String habitat) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.habitat = habitat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }


    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
