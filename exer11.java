package aulasNovotec;
import java.util.Scanner;	
public class exer11 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int salario, vendas, valorporcarro, toti = 0;
		System.out.print("digite seu salario fixo: ");
		salario = sc.nextInt();
		System.out.println("digite valor total das vendas: ");
		vendas = sc.nextInt();
		System.out.print("digite o valor por carro: ");
		valorporcarro = sc.nextInt();
		System.out.println("digite a quantidade de carros:");
		toti = sc.nextInt();
		float comissao = salario + (valorporcarro * toti) + ((vendas / 100) * 5);
		System.out.println("seu salario final e: " + comissao);

	}


}