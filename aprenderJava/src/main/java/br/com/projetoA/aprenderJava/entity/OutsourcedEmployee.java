package br.com.projetoA.aprenderJava.entity;

public class OutsourcedEmployee extends Employee{

	protected Double additionalCharge;

	
	
	
	
	
	
	
	
	
	
	public OutsourcedEmployee(Integer id, String name, Double salary, Integer hours, Double valuePerHour,
			Double additionalCharge) {
		super(id, name, salary, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge *1.1;
	}
	
	
	
	
}
