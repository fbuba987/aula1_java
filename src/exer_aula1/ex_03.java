package exer_aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		
		float salBruto, adicNoturno, horasExtras, desconto;
		
		System.out.print("Digite o salário bruto: ");
		salBruto = sc.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		adicNoturno = sc.nextFloat();
		
		System.out.print("Digite horas extra: ");
		horasExtras = sc.nextFloat();
		
		System.out.print("Digite o disconto: ");
		desconto = sc.nextFloat();
		
		System.out.print("O salário total: " + df.format(salBruto + adicNoturno + (horasExtras*5) - desconto));

	}

}
