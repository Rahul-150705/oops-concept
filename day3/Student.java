package encapsulationn;

public class Student {
	private String Name;
	private int age;
	private double mark;
	
	public String getName()
	{
		return Name;
	}
	public int getage()
	{
		return age;
	}
	public double getmark()
	{
		return mark;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void Setage(int age)
	{
		if(age>0 && age<21) {
			this.age=age;
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}
	public void Setmark(double mark)
	{
		if(mark>0 && mark<100) {
			this.mark=mark;
		}
		else
		{
			System.out.println("Invalid Mark");
		}
	}
	public void displayInfo()
	{
		System.out.println("Name:" + this.Name + "\nAge:" + this.age + "\nMark:" + this.mark);
	}
	

}
