package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(188, 244);
        quadrado.printArea();
        Triangulo triangulo = new Triangulo(188, 244);
        triangulo.printArea();
        Notas notas = new Notas(9.5f,5.7f,8f);
        notas.printMean();
        Avatar avatar = new Avatar("X", AvatarElements.FOGO);
        avatar.printAvatar();
    }


}
