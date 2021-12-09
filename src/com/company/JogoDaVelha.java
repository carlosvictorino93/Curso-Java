package com.company;

public class JogoDaVelha {
    String[][] tabuleiro = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
    };
    public void printTabuleiro() {
      for (String[] row: tabuleiro) {
            System.out.printf("%s%n", String.join("|", row));
      }
    }
    public Boolean addMove(int jogador, int posicao) {
        String sign = jogador == 1 ? "X" : "O";
        int k = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                k++;
                if (k == posicao) {
                    if (tabuleiro[i][j] == "-") { tabuleiro[i][j] = sign; return true; }
                }
            }
        }
        System.out.println("Jogada Inválida!");
        return false;
    }
    public int whoWon() {
        for(String[] row : tabuleiro) {
            if (row[0]!= "-" && row[0] == row[1] && row[1] == row[2]) {
                return row[0] == "X" ?  1 : 2;
            }
        }
        for(int i = 0; i < 3; i++) {
            if(tabuleiro[0][i] != "-" && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return tabuleiro[0][i] == "X" ?  1 : 2;
            }
        }
        if (tabuleiro[0][0] != "-" && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return tabuleiro[0][0] == "X" ?  1 : 2;
        }
        if (tabuleiro[0][2] != "-" && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return tabuleiro[0][2] == "X" ?  1 : 2;
        }
        return 0;
    }
}