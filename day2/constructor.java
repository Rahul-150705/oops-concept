package oopsprogram;

public class Constructor {

	public static void main(String[] args) {
		Bank cons=new Bank();
		System.out.println("Name:" + cons.AccountHolder + "\tNumber:" + cons.accountNumber+"\tBalance:"+ cons.balance);
		Bank cons1=new Bank("Ranbir",2,100000);
		System.out.println("Name:" + cons1.AccountHolder + "\tNumber:" + cons1.accountNumber+"\tBalance:"+ cons1.balance);
	}

}
