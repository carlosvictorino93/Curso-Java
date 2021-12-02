package com.company;

public class Triangulo extends Area {

    public Triangulo(int height, int base) {
        super(height, base);
    }

    public float getArea() {
        return (getBase() * getHeight())/2f;
    }

    public void printArea() {
        System.out.println("A área é " + getArea());
    }
}
