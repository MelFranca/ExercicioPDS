package Petshop;

public class Dono {
	private String nome;

    public Dono(String nome) {
        this.nome = nome;
    }

    public void chamarAnimal(Animal animal) {
        System.out.println(nome + " está chamando " + animal);
    }

    public void alimentarAnimal(Animal animal) {
        System.out.println(nome + " está alimentando o animal.");
        animal.comer();
    }

    public void levarAoVeterinario(Animal animal) {
        System.out.println(nome + " está levando o animal ao veterinário.");
    }

}
