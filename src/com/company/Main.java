package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Quadrado quadrado = new Quadrado(188, 244);
//        quadrado.printArea();
//        Triangulo triangulo = new Triangulo(188, 244);
//        triangulo.printArea();
//        Notas notas = new Notas(9.5f,5.7f,8f);
//        notas.printMean();
//        Avatar avatar = new Avatar("X", AvatarElements.FOGO);
//        avatar.printAvatar();

//        String name = "Carlos";
//        int age = 27;
//        float height = 1.7f;
//
//        System.out.printf("My name is %s,%nI am %d and%nI am %.2f tall.", name, age, height);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma quantia em reais: ");
        double reais = scanner.nextDouble();
        double dollars = reais/5.65;
        double euros = reais/6.39;
        System.out.printf("Você possui %.2f USD%n", dollars);
        System.out.printf("Você possui %.2f EUR%n", euros);
    }


}
