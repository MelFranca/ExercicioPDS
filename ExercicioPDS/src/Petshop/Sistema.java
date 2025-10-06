package Petshop;

public class Sistema {
	public static void main(String[] args) {
        Animal animal = new Animal("Bolt", "Cachorro");
        Dono dono = new Dono("Carlos");
        DoutorVet vet = new DoutorVet("Dra. Ana");

        dono.alimentarAnimal(animal);

        Consulta consulta = new Consulta(animal, vet);
        consulta.iniciar();
        consulta.aplicarVacina();
        consulta.finalizar();
    }

    public void iniciarSistema() {
        System.out.println("Sistema iniciado.");
    }

    public void mostrarMensagem() {
        System.out.println("Bem-vindo ao sistema de pets!");
    }

    public void encerrarSistema() {
        System.out.println("Sistema encerrado.");
    }
//comentario de teste commit
}

