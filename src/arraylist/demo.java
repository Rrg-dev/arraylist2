package arraylist;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(1,"max",25000));
		a1.add(new Employee(2,"john",50000));
		a1.add(new Employee(3,"jane",20000));
		a1.add(new Employee(4,"james",25000));	
		a1.remove(2);		
		for(Employee e:a1)
		{
			System.out.println("Id:"+e.id + " Name:" + e.name + " Salary:" + e.salary);
		}
	}

}
