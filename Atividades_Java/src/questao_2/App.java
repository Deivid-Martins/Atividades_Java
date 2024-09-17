package questao_2;

public class App {
	public static void main(String[] args) {
		Calculo calc = new Calculo();
		
		if (calc.existeEmFibonacci(calc.num))
			System.out.println("Seu número existe em Fibonacci!");
		else
			System.out.println("Número não existe em Fibonacci!");
	}
}
