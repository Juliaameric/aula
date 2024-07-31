package metodoAdd;

import java.util.ArrayList;
import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		System.out.println("digite o valor 0 para sair");
		
		int i=1, soma=0;
		while(i!=0) {
			System.out.println("digite o valor para soma :");//carregar dados
			i=ler.nextInt();
			numero.add(ler.nextInt());
		}
		for(int n: numero) {
			soma= soma + n; //somando valores
		}
		System.out.println("lista é :"+numero);//mostra lista
		System.out.println("lista é :"+soma);
		
	}

}
