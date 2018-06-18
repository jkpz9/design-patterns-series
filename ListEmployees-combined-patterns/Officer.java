package concrete;

import abstraction.Employee;

public class Officer extends Employee {
    public static final double VACATION_FINE = 100000;
    private double baseSalary;
    private int vacationDays;

    public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	@Override
    public double calculateSalary() {
       return baseSalary - vacationDays*100000;
    }

	@Override
	public String toString() {
		return "Officer [baseSalary=" + baseSalary + ", vacationDays=" + vacationDays + ", Id=" + Id + ", name=" + name
				+ ", Salary=" + this.calculateSalary() +"]";
	}
    
}
