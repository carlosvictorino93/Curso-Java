package com.company;

public class Quadrado extends Area {

    public Quadrado(int height, int base) {
        super(height, base);
    }

    public int getArea() {
        return getBase() * getHeight();
    }

    public void printArea() {
        System.out.println("A área é " + getArea());
    }
}
