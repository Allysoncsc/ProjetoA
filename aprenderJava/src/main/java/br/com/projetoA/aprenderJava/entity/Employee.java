package br.com.projetoA.aprenderJava.entity;

public class Employee {

	protected Integer id;
	protected String name;
	protected Double salary;
	protected Integer hours;
	protected Double valuePerHour;
	
	
	
	public Employee() {
		
	}
	
	
	
	
	public Employee(Integer id, String name, Double salary, Integer hours, Double valuePerHour) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage/100;
	}
	
	
	
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	
	
	public double payment() {
		return hours * valuePerHour;
	}
	
	
	
	@Override
	public String toString() {
		return id+ ", " + name +", "+ String.format("%.2f", salary);
	}
	
}
