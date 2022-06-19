package br.com.projetoA.aprenderJava.entity;

public class SavingsAccount extends Account{

	private Double interrestRate;

	public SavingsAccount(Double interrestRate) {
		super();
		this.interrestRate = interrestRate;
	}

	
	public SavingsAccount(Integer number, String holder, Double balance, Double interrestRate) {
		super(number, holder, balance);
		this.interrestRate = interrestRate;
	}


	public Double getInterrestRate() {
		return interrestRate;
	}

	public void setInterrestRate(Double interrestRate) {
		this.interrestRate = interrestRate;
	}
	
	
	@Override
	public void withdraw(Double amount) {
		balance -= amount;
	}
			
}
