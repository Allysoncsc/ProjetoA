package br.com.projetoA.aprenderJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.projetoA.aprenderJava.entity.Employee;

public class TestaEmployee {

	public static void main(String[] args) {
		// min33,35
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Employee " + (i + 1));
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
		
		
		System.out.println("Enter the employee id that will have salary increase: ");	
		int idsalary = sc.nextInt();
		
		//tranformando a list em list stream que aceita funções lambida
		Employee e = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
				
		//Integer pos = position(list, idsalary);

		//if (pos == null)
		if (e == null) {
			System.out.println("Id inexistente");
		} else {
			System.out.println("Enter the percentage: ");
			double percente = sc.nextDouble();
			e.increaseSalary(percente);
			//list.get(pos).increaseSalary(percente);

		}
		System.out.println();
		System.out.println("List of employess: ");
		for (Employee emp : list) {
			System.out.println(emp.toString());
		}

		sc.close();
	}

	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		//se emp diferente null retorna true
		return emp !=null;
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}

		return null;
	}

}
