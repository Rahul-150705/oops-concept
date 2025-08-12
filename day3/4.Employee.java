package encapsulationn;

public class Employee {
	private String Name;
	private double Salary;
	private double Bonus;
	private double totalSalary;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			Salary = salary;
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public double getBonus() {
		return Bonus;
	}
	public void setBonus(double bonus) {
		if(bonus>0) {
			Bonus = bonus;
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}
	public double getTotalSalary() {
		return totalSalary=this.Salary+this.Bonus;
	}
	public void displayInfo()
	{
		System.out.println("Name:" + this.Name+ "\nSalary:" + this.Salary + "\nBonus:" + this.Bonus + "\nTotal:"+ getTotalSalary());
	}
	
}
