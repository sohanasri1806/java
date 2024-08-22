package programs;

class Employee{
	int salary=100000;
}
class Engineer extends Employee{
	int bonus=20000;
}
public class inheritance {

	public static void main(String[] args) {
		Engineer e1=new Engineer();
		System.out.println("Salary: "+e1.salary+"\nBonus: "+e1.bonus);

	}

}
