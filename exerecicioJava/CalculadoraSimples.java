package testes;

import java.util.Scanner;

public class Estudo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar) {
			
		System.out.println("==== MENU ====");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("0 - Sair");
		System.out.println("\nEscolha a opção desejada: ");
		
		int opcao = entrada.nextInt();
		System.out.println("Insira o primeiro valor: ");
		int valor1 = entrada.nextInt();
		System.out.println("Insira o segundo valor: ");
		int valor2 = entrada.nextInt();
		
		if (opcao == 1) {
			int soma = (valor1 + valor2);
			System.out.println("O Resultado da soma é: " + soma);
			
		} else if (opcao == 2) {
			int sub = (valor1 - valor2);
			System.out.println("O Resultado da subtração é: " + sub);
			
		} else if (opcao == 3) {
			int mul = valor1 * valor2;
			System.out.println("O Resultado da multiplicação é: " + mul);
		
		} else if (opcao == 4) {
			if (valor2 != 0) {
				int div = valor1 / valor2;
				System.out.println("O Resultado da divisão é: " + div);
			  } else {
				System.out.println("Erro! Não existe divisão por zero.");
			}
		
		} else if (opcao == 0) {
			System.out.println("Encerrrando o programa...");
			System.out.println("Até a próxima!");
			break;
			
		} else {
			System.out.println("Erro! Insira um valor válido.");
		}
		
		 System.out.println();
			
	
}
		entrada.close();
}
}