package exer_aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".#");
		
		
		float nota = 0;
		
	
			
		for(int i =1; i <=4; i++) {
			System.out.print("Digite nota: " + i + " : " );
			nota += sc.nextFloat();
			
			
			
		}
		System.out.println("A média final é: " + df.format(nota / 4));
		
		

	}

}
