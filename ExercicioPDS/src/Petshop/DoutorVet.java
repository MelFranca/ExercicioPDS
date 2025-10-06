package Petshop;

public class DoutorVet {
	private String nome;

    public DoutorVet(String nome) {
        this.nome = nome;
    }

    public void examinar(Animal animal) {
        System.out.println("Veterinário " + nome + " está examinando o animal.");
    }

    public void vacinar(Animal animal) {
        System.out.println("Veterinário " + nome + " vacinou o animal.");
    }

    public void darAlta(Animal animal) {
        System.out.println("Animal recebeu alta.");
    }


}
