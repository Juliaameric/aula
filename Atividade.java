package metodoAdd;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<>();
		Scanner ler = new Scanner(System.in);

		int soma,numero1, numero2, numero3, numero4, numero5 ;
		System.out.println("digite o valor 0 para sair");
		numero1 = ler.nextInt();
		
		System.out.println("informe um numero inteiro");
		numero2 = ler.nextInt();
		
		System.out.println("informe um numero inteiro");
		numero3 = ler.nextInt();
		
		System.out.println("informe um numero inteiro");
		numero4 = ler.nextInt();
		
		System.out.println("informe um numero inteiro");
		numero4 = ler.nextInt();
		
		System.out.println("informe um numero inteiro");
		numero5 = ler.nextInt();
		
		
		
		soma =  numero1+numero2+numero3+numero4+numero5;
		
		System.out.println("lista:"+soma);
		ler.close();
	}

}
