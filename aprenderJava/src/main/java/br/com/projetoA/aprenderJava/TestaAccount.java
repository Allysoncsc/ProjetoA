package br.com.projetoA.aprenderJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.projetoA.aprenderJava.entity.Account;
import br.com.projetoA.aprenderJava.entity.BusinessAccount;
import br.com.projetoA.aprenderJava.entity.SavingsAccount;

public class TestaAccount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001,"Ally",500.00, 0.01));
		list.add(new BusinessAccount(1002,"Kel",200.00, 400.00));
		list.add(new SavingsAccount(1003,"goku",300.0,0.01));
		list.add(new BusinessAccount(1004,"vegeta",500.0,500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum +=acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum);
		
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(),acc.getBalance());
		}
		
	}

}
