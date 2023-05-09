package com.citiustech.collectionutility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortingUsingEmployeeObject {
	
	public static void main(String[] args){
	
	Employee e1 = new Employee(101,"Yaseen");
	Employee e2 = new Employee(20,"Praveen");
	Employee e3 = new Employee(30,"shahid");
	Employee e4 = new Employee(200,"Ali");
	Employee e5 = new Employee(2002,"sam");
	ArrayList<Employee> emplist = new ArrayList<Employee>();
	emplist.add(e1);
	emplist.add(e2);
	emplist.add(e3);
	emplist.add(e4);
	emplist.add(e5);
	System.out.println(emplist.get(4).toString());	
	//Collections.sort(emplist);
	//System.out.println(emplist);
	Collections.sort(emplist, (o1,o2)->o1.getName().compareTo(o2.getName()));
	System.out.println(emplist);

	}

}
class Employee implements Comparable<Employee>
{  	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int id = (int)o.getId();
				
		return this.getId()-id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}