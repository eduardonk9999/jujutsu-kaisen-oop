package org.example.jujutsu;

public class Roxo extends Vermelho implements Azul{
    private int danoRoxo;

    public Roxo() {
        super();
        this.danoRoxo = 1000;
    }

    @Override
    public TipoAtaque getTipoAtaque() {
       return TipoAtaque.ROXO;
    }


    public void usarAtaqueRoxo(Sorcerer oponente) {
        System.out.println("Combinação de Azul e Vermelho, formando Roxo!");
        System.out.println("Ataque Roxo causando " + danoRoxo + " de dano!");
        oponente.receberDano(danoRoxo);
    }

    @Override
    public void usarAtaqueAzul(Sorcerer oponete) {
        System.out.println("Ataque Azul causando 300 de dano!");
        oponete.receberDano(300);
    }


}
