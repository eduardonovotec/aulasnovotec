package aulasNovotec;
import java.util.Scanner;
public class exer12 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int celsius = 0;
	System.out.print("digite quantos graus em são paulo: ");
	celsius = sc.nextInt();
	float f = (9 * (celsius) / 5) + 32;
	System.out.println("temperatura em Fahrenheit: " + (f));
	}
}
