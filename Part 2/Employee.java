//import java.util.*;
//import java.io.*;
public class Employee{
	private String name;
	private int hours;
	private double rate;
	private Address[] address;

	public Employee(String name,int hours,double rate,Address[] address){
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		this.address = address;

	}
	public String getName(){
		return name;

	}
	public int getHours(){
		return hours;

	}
	public double getRate(){
		return rate;

	}
	public String getAddress(int i){
		return address[i].toString();
	}


}