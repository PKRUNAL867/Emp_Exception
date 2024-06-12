
public class Emp {

	private String ename;
	private int salary;
	
	public String getEname() 
	{
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		try {
		if(salary<5000)
		{
			throw new salaryException();
		}
		else
		{
		this.salary = salary;
		}
	}
		catch(salaryException e)
		{
			System.out.println("salary is less than 5000");
		}
	}
		public String toString() {
			return "Emp [ename=" + ename + ", salary=" + salary + "]";
		}
	}


