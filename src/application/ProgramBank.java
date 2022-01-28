package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramBank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);                                // chamada das váriaveis de sistemas necessarias para uso do ponto nas casas decimais e entrada.
		Scanner sc = new Scanner(System.in);
		Account account;
		

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");                           //váriaveis que seram usadas nos atributos da classe.
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);                                    //captura  de um caractere
		
		
		while (response != 'y' && response != 'n') {
			System.out.println("Invalid option !! Enter (y/n)");                    //laço while para forçar o uso de y ou n pelo usuário.
			response = sc.next().charAt(0);
		}	
		
		if (response == 'y') {
			System.out.println("Enter the initial value: ");
			double initialDeposit = sc.nextDouble();                                    //condição caso haja confirmação do depósito
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);                                                         //aqui estou pedindo para informar o valor do novo deposito e estou armazenando no metodo deposit da entidade account
		System.out.println();
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue); 
		System.out.println();
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
