class BankAccount 
{
	private double balance;

	public double getBalance()
	{
		return balance;
	}

	public void setDeposit(double amount)
	{

		this.balance += amount;
		
	}
	public void setWithdraw(double amount)
	{
		this.balance -= amount;
	}
	
}

class BankAccountDriverClass
{
	public static void main(String[] args) 
	{
		
		BankAccount account=new BankAccount();

		System.out.println("Balance initially:  "+account.getBalance());
		account.setDeposit(1000);
		System.out.println("Balance after deposit:  "+account.getBalance());

		//System.out.println(account.getBalance());

		account.setWithdraw(400);
		System.out.println("Balance after withdraw: "+account.getBalance());

		System.out.println("Available Balance: "+account.getBalance());
	}
}
