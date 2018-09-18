/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;

public class Book {
    private double length, width;
    private String color;
    private int pages;

    public Book(double length, double width, String color, int pages) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.pages = pages;
    }

    //return lenght
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //return width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //return color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //return pages
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
