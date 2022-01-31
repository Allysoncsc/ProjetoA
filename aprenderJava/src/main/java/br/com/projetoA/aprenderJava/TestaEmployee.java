package br.com.projetoA.aprenderJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.projetoA.aprenderJava.entity.Employee;

public class TestaEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Employee "+ (i+1));
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		sc.close();
	}

}
