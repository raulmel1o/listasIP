import java.util.Scanner;

public class Exec10 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
			System.out.println("Insira um número inteiro de três dígitos:");
			int num1 = myObj.nextInt();
		
		int centena = num1 / 100;
		int restoC = num1 % 100;

		int dezena = restoC / 10;
		int restoD = restoC % 10;

		int inverso = restoD * 100 + dezena * 10 + centena;

		System.out.println(inverso);	
	}		
}
