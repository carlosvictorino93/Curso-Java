package com.company;

public class Avatar {

    private String nome;
    private AvatarElements tipo;

    public Avatar(String nome, AvatarElements tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AvatarElements getTipo() {
        return tipo;
    }

    public void setTipo(AvatarElements tipo) {
        this.tipo = tipo;
    }

    public void printAvatar() {
        System.out.println("Avatar");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
    }
}
