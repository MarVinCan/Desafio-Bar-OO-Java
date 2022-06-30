package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Sexo: ");
		char gender = sc.nextLine().charAt(0);
		while (gender != 'M' && gender != 'F') {
			System.out.print("Valor invalido de intrada, digitar F/M: ");
			gender = sc.nextLine().charAt(0);
		}
		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();

		Bill bill = new Bill(gender, beer, barbecue, softDrink);

		System.out.println();

		System.out.println(bill.toString());

		sc.close();
	}

}
