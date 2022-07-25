package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Account account;
		
		System.out.print("Digite o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String holder= sc.nextLine();
		System.out.print("Tem depósito inical: (s /n) ");
		char response = sc.next().charAt(0);
		
		if (response == 's') {
			System.out.print("Digite o valor de depósito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit); //sobrecarga
		}
		else {
			account = new Account (number,holder);
		}
		
		System.out.println();
		System.out.print("Dados da conta: ");
		System.out.print("Digite o número da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre o valor de deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.print("Dados Atualizados:  ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre o valor de saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.print("Dados Atualizados:  ");
		System.out.println(account);
		
		
		
		sc.close();
		

	}

}
