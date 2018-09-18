/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;

public class Company {
    private double worth, stockPrice;
    private int numberOfEmployers;
    private String name;

    public Company(double worth, double stockPrice, int numberOfEmployers, String name) {
        this.worth = worth;
        this.stockPrice = stockPrice;
        this.numberOfEmployers = numberOfEmployers;
        this.name = name;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(int numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
