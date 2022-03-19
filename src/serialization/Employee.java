package serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public int Empno;
	public String Name;
	public String Dept;
	public double salary;
	
	
	public Employee(int empno, String name, String dept, double salary) {
		this.Empno = empno;
		this.Name = name;
		this.Dept = dept;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [Empno=" + Empno + ", Name=" + Name + ", Dept=" + Dept + ", salary=" + salary + "]";
	}
	
	
}
