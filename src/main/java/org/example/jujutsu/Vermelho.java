package org.example.jujutsu;

public abstract class Vermelho {
    protected int dano;

    public Vermelho() {
        this.dano = 500;
    }

    public void usarAtaqueVermelho(Sorcerer oponente) {
        System.out.println("Ataue vemelho causando " + dano + " de dano!");

        oponente.receberDano(dano);
    }

    public abstract TipoAtaque getTipoAtaque();
}
