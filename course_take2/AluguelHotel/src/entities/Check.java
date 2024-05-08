package entities;

public class Check {
	private int number;
	private String name;
	private String email;
	private int state;
	private double rent;

	public Check(int number, String name, String email,double rent) {
		this.number=number;
		this.name=name;
		this.email=email;
		this.rent=rent;
	}
	public String getRegister() {
		return "\nNome: "; 
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
