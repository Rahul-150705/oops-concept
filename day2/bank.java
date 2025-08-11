package oopsprogram;

public class Bank {
	String AccountHolder;
	int accountNumber;
	double balance;
	Bank(){
		AccountHolder="Rahul";
		accountNumber=1234;
		balance=100000000;
	}
	Bank(String x,int v, double d)
	{
		AccountHolder=x;
		accountNumber=v;
		balance=d;
	}
}
