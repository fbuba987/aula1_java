package exer_aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		Scanner sal = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		float salario, abono; 
		
		System.out.println("Digite o salário: ");
		salario = sal.nextFloat();
		
		System.out.println("Digite o salário: ");
		abono = sal.nextFloat();
		
		System.out.println("Novo Salário é: " + df.format(salario + abono ));
		
	}

}
