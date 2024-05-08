package entities;

public class Funcionario {
	public String name;
	public double gross_salary;
	public double tax;
	
	public double liquid_salary() {
		return gross_salary-tax;
	}
	public double percent;
	public double percentage() {
		return (gross_salary/percent)+liquid_salary();
		}
}
