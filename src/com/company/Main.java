package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.printTabuleiro();
        int winner = 0;
        int times = 0;
        while (winner == 0) {
            for (int i = 0; i < 2; i++) {
                System.out.printf("Jogador %d, Digite sua Jogada (1 a 9):", i +1 );
                int move = scanner.nextInt();
                if(!jogo.addMove(i + 1, move)) i--; else times++;
                winner = jogo.whoWon();
                System.out.println();
                jogo.printTabuleiro();
                if (winner > 0 || times >= 9) {
                    if (times >= 9 && winner == 0) winner = -1;
                    break;
                }
            }
        }
        String msg = winner == -1 ? "Não houve ganhador!" : "Parabéns, Jogador " + winner + "! Você venceu!!!";
        System.out.println(msg);
    }
}
