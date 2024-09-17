package questao_5;

import java.util.Scanner;

public class InversoString {
	private Scanner input = new Scanner(System.in);
	
	public String string;
	
	public InversoString() {
		System.out.println("String: ");
		this.string = input.nextLine();
	}
	
	public String reverse() {
        char aux;
        char[] stringChar = this.string.toCharArray();
        int length = this.string.length();
        for(int i = 0; i < length / 2; i++) {
            aux = stringChar[i];
            stringChar[i] = stringChar[length - i - 1];
            stringChar[length - i - 1] = aux;
        }
        this.string = new String(stringChar);
        return this.string;
    }
}
