package questao_3;

public class App {
	public static void main (String[] args) {
		Faturamento fat = new Faturamento();
		fat.definirValores(fat.faturamentos.length);
		//Menor
		System.out.println("Menor: " + fat.menorValor());
		//Maior
		System.out.println("Maior: " + fat.maiorValor());
		//Media
		System.out.println("Dias acima da media: " + fat.acimaDaMedia() + "\nMedia: " + fat.mediaSalarial);
	}
}
