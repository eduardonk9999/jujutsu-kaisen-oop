package org.example.jujutsu;

public abstract class Sorcerer {
    protected String nome;
    protected String tecnicaDominante;
    protected int vida;

    public Sorcerer(int vida) {
        this.vida = vida;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        System.out.println("Sorcerer receberDano " + dano + " de dano "
        + this.vida);
    }
}
