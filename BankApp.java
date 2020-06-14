protected class BankApp 
{
	public static void main(String[] args) 
	{
		Bank bank = null;

		bank = new SBI();
		bank.deposit(2500f);
		bank.withdraw(1250f);
		System.out.println();

		bank = new ICICI();
		bank.deposit(1500f);
		bank.withdraw(1150f);
		System.out.println();

		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
		System.out.println(bank.n);
		//bank.n = 12;//error: cannot assign a value to final variable n
	}
}
