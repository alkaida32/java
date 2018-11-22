import java.util.Scanner;

public class Mercadinho {
	//Criei um vetor chamado VETOR com 100 posições.
	float[] vetor = new float[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciei a classe menu e chamei o menu principal.
		menus a = new menus ();
		
		a.mostraMenu();

		
		

		

	}


	//Aqui o FOR procurará algum vetor que está vazio e em seguida retornar a posição exata do vetor
	//que estará disponível para ser trabalhado.
	float posicaovetor() {
		int valor1 = 0;
		for (int i=2; i < 100; i++) {
			if (vetor[i] == 0.0) {
				valor1 = i;
			}
		}
		
		return valor1;
	}

	
	
}


