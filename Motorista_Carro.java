package Aula_11_09;

public class Motorista_Carro {
	public static void main(String[] args) {
		
		Carro motorista = new Carro ("onix", 2356_5151);
		Carro motorista2 = new Carro ("onix");
		Carro motorista3 = new Carro (2356-151);
		
		System.out.println(" Marca: "+ motorista.getPlaca());
		System.out.println(" Placa: "+ motorista.getNumChassi());
		System.out.println(" Marca : " + motorista2.getNumChassi());
		System.out.println(" Placa:" + motorista3.getPlaca());
	}

}
