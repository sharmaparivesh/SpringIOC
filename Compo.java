package com.palindrom.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

class Employee
{
	int id;
	String name;
	double salary;
	Employee(){}
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
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
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

}
class myComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee obj1,Employee obj2)
	{
		Employee emp1=(Employee)obj1;
		Employee emp2=(Employee)obj2;
		return emp1.getName().length()-emp2.getName().length();
	}
}


public class Compo {
	public static void main(String args[])
	{
//		TreeMap<Integer,String>hm=new TreeMap<Integer,String>(new myComparator());
//		hm.put(94,"riya");
//		hm.put(85,"amboo");
//		hm.put(5,"pair");
//		
//		System.out.println(hm);
	
		
		Map<Employee,String> map=new TreeMap<Employee,String>(new myComparator());
		Employee emp=new Employee(11,"parivesh",4545);
		Employee emp1=new Employee(151,"sonu",54545);
		Employee emp2=new Employee(114,"moonu",43245);
		Employee emp3=new Employee(411,"kuhuuuuuu",454352);
		map.put(emp,"working for infosys");
		map.put(emp1,"working for hpe");
		map.put(emp2,"working for dainik");
		map.put(emp3,"working for play");
		Set<Employee> ks = map.keySet();
        for(Employee key:ks){
            System.out.println(key+" ==> "+map.get(key));
        }
		
		System.out.println(map);
		
	}

}
