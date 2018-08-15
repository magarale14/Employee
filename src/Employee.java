/*This program is for constructing constructors,private class Employee,getters and setters String tostring and interaction between different classes 
 * Author: Reeta
 */
public class Employee {
	
	private String name;
	private int employeeId;
	private double salary;
	private String payRate;
	private String joinDate;
	private String typeOfEmployee;
	private int hours;
	
	Employee(String name,double salary,String payRate, String joinDate,String typeOfEmployee){
	 this.name = name;
	 this.salary = salary;
	 this.payRate = payRate;
	 this.joinDate = joinDate;
	 this.typeOfEmployee  = typeOfEmployee;
	 
	}
	Employee( String name,int employeeId,double salary,String payRate, String joinDate,String typeOfEmployee,int hours){
		this.name = name;
		this.employeeId = employeeId;
		 this.salary = salary;
		 this.payRate = payRate;
		 this.joinDate = joinDate;
		 this.typeOfEmployee  = typeOfEmployee;
		 this.hours = hours;
		
	}
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPayRate() {
		return payRate;
	}
	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}
	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String toString(){
		return ("name: " + this.name + "\n" + "employeeID: " +this.employeeId + "\n" + "salary: " + this.salary + "\n" + "payRate: " + this.payRate + "\n" + "joinDate: " + this.joinDate + "\n" + "typeOfEmployee:" + this.typeOfEmployee + "\n" + "hours: "+ this.hours + "\n");
	}

	
	public static void main(String args[]){
		Employee reeta = new Employee("reeta",22,25,"HOURLY","9-01-2017","FULL TIME",40);
		System.out.println(reeta);
		
		}
	}
	
	 
	 