package Petshop;

public class Animal {
	private String nome;
    private String tipo;

    public Animal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void fazerSom() {
        System.out.println(nome + " está fazendo som.");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
	
}
