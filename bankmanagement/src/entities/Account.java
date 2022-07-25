package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	//construtor com 2 argumentos 
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	//construtor com 3 argumentos

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit (initialDeposit);
	}
	
	//numero da conta não pode ser mudado

	public int getNumber() {
		return number;
	}
	
	//nome do titular pode ser mudado

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	//balanço da conta nao pode ser alterado a nao ser por saque - depósito

	public double getBalance() {
		return balance;
	}
	
	//transações bancarias depsito e saque

	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Conta: "
				+ number
				+ " , Titular:  "
				+ holder
				+ " , Saldo: $ "
				+ String.format("%.2f", balance);
	}
	
	
	
	
	

}
