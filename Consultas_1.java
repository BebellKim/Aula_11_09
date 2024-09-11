package Aula_11_09;

public class Consultas_1 {
	
	public static void main(String[] args) {
	Consulta consunta = new Consulta ("Isabella", 10);
	Consulta consunta2 = new Consulta ("Giovana");
	Consulta consunta3 = new Consulta (10);
	System.out.println(consunta.getNomePaciente());
	System.out.println(consunta.getData());
	System.out.println(consunta2.getNomeDentista());
	System.out.println(consunta3.getData());
	}

}
