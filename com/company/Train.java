/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;


public class Train {
    private int weight;
    private double length, maxspeed;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Train(int weight, double length, double maxspeed) {
        this.weight = weight;
        this.length = length;
        this.maxspeed = maxspeed;
    }
}
