package metodoAdd;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a=0, b=0;
		try {
			System.out.println("informe o primeiro valor");
			a = ler.nextInt();
			System.out.println("informe o segundo valor");
			b = ler.nextInt();
	
		
		System.out.println("resultados");
		System.out.println("soma: "+(a+b));
		System.out.println("subtraçao: "+(a-b));
		System.out.println("multiplicaçao"+(a*b));
		System.out.println("divisao inteira"+(a%b));
		System.out.println("divisao exata: "+((double)a/b));
		
	}
		catch(Exception erro) {
			System.out.println("informe um valor inteiro");
			
		}
		ler.close();
	}
}
