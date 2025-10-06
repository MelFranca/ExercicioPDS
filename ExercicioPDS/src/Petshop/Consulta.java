package Petshop;

public class Consulta {
	private Animal animal;
    private DoutorVet doutorVet;

    public Consulta(Animal animal, DoutorVet doutorVet) {
        this.animal = animal;
        this.doutorVet = doutorVet;
    }

    public void iniciar() {
        System.out.println("Consulta iniciada.");
        doutorVet.examinar(animal);
    }

    public void aplicarVacina() {
    	doutorVet.vacinar(animal);
    }

    public void finalizar() {
    	doutorVet.darAlta(animal);
    }
	

}
