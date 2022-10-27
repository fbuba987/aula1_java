package exer_aula1;

import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1,numero2,numero3,numero4;
		
	
			System.out.println("Informe numero1: ");
			numero1 = sc.nextInt();
			
			System.out.println("Informe numero2: ");
			numero2 = sc.nextInt();
			
			System.out.println("Informe numero3: ");
			numero3 = sc.nextInt();
			
			System.out.println("Informe numero4: ");
			numero4 = sc.nextInt();
			
			System.out.println("diferença : " + ((numero1 * numero2)-(numero3 * numero4)));
		

	}

}
