package Comparable_Comparators;

public class Employee implements Comparable {
	int id;
	String name;
	String email;
	double salary;
	long phone_no;
	@Override
	public int compareTo(Object o) {
	Employee e1=(Employee) o;
		return  e1.id - this.id ;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", phone_no="
				+ phone_no + "]";
	}
	public Employee(int id, String name, String email, double salary, long phone_no) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.phone_no = phone_no;
	}

}
