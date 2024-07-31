package metodoAdd;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double x;
		try {
		System.out.println("digite uma nota: ");
		x= ler.nextDouble();
		
		if (x>=6)
			System.out.println("esta aprovado!");
		else if (x<6 && x>=4)
			System.out.println("exame!");
		else 
			System.out.println("reprovado");
	}
	catch (Exception erro) {
		System.out.println("insira uma nota ");
	}
	}
}
