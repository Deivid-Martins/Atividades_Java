package questao_1;

import java.util.Scanner;

public class App {
	/*
	 * Como era algo extremamente simples, fiz com paradigma "Estruturado" mesmo
	 * Se o indice deve ser desconsiderado a posição 0, soma() = 78
	 * Se o indice deve ser considerado a posição 0, soma () = 91
	 * neste caso, desconsiderei o 0 então deu 78
	*/
	public static int soma () {
		Scanner input = new Scanner(System.in);
		
		int k = 0;
		int soma = 0;
		
		System.out.println("Defina o indice: ");
		int index = input.nextInt() - 1;
		while(k < index) {
			k += 1;
			soma += k;
		}
		input.close();
		return soma;
	}
	
	public static void main(String[] args) {
		System.out.println(soma());
	}
}
