package questao_3;

import java.util.Scanner;

public class Faturamento {
	public Scanner input = new Scanner(System.in);
	
	double faturamentos[];
	double mediaSalarial;
	
	public Faturamento() {
		System.out.println("Defina a quantia de dias que deseja alocar um faturamento");
		int tam = input.nextInt();
		this.faturamentos = new double[tam];
	}
	
	public void definirValores(int tam) {
		for(int i = 0; i < faturamentos.length; i ++) {
			System.out.print("Defina o faturamento do dia" + (i+1) + ": ");
			faturamentos[i] = input.nextDouble();
		}
		System.out.println("Valores definidos!");
		mediaSalarial();
	}
	
	public void mediaSalarial () {
		this.mediaSalarial = 0;
		for(int i = 0; i < faturamentos.length; i ++) {
			this.mediaSalarial += faturamentos[i];
		}
		this.mediaSalarial /= faturamentos.length;
	}
	
	public int acimaDaMedia() {
		int total = 0;
		for(int i = 0; i < faturamentos.length; i ++) {
			if(faturamentos[i] > mediaSalarial) {
				total ++;
			}
		}
		return total;
	}
	
	public double menorValor() {
		double menor = 0;
		for(int i = 0; i < faturamentos.length; i ++) {
			if(i == 0) {
				menor = faturamentos[0];
			} else {
				if(menor > faturamentos[i]) {
					menor = faturamentos[i];
				}
			}
		}
		return menor;
	}
	
	public double maiorValor() {
		double maior = 0;
		for(int i = 0; i < faturamentos.length; i ++) {
			if(faturamentos[i] > maior) {
				maior = faturamentos[i];
			}
		}
		return maior;
	}
}
