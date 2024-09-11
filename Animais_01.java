package Aula_11_09;

public class Animais_01 {

	public static void main(String[] args) {
		Animal animal = new Animal ("preto", 1);
		Animal animal2 = new Animal ("branco");
		Animal animal3 = new Animal (10);
		System.out.println(" Cor:" + animal.getCor());
		System.out.println(" Idade do animal: " + animal.getTamanho());
		System.out.println(" cor do animal2: " + animal2.getCor());
		System.out.println(" Idade do animal2:" + animal3.getTamanho());

	}
}


