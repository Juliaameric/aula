package metodoAdd;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		a = 10;
		System.out.println("digite um numero");
		b =leia.nextInt();
		try {
			c=a/b;
					System.out.println("valor C:"+c);
			
		}catch (ArithmeticException erro) {
			System.out.println("nao existe divisao po 0");
		}
	}

}
