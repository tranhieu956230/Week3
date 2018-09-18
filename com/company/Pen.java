/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;

public class Pen {
    private double length, price;
    private String inkColor;

    public Pen(double length, double price, String inkColor) {
        this.length = length;
        this.price = price;
        this.inkColor = inkColor;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }
}
