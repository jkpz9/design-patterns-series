package concrete;

import abstraction.Employee;

public class Worker extends Employee {
   public static final int UNIT_PRICE = 50000;
    private int amountOfUnits;
    
    public int getAmountOfUnits() {
		return amountOfUnits;
	}
    
	public void setAmountOfUnits(int amountOfUnits) {
		this.amountOfUnits = amountOfUnits;
	}
	
	@Override
    public double calculateSalary() {
        return amountOfUnits*UNIT_PRICE;
    }
	
	@Override
	public String toString() {
		return "Worker [amountOfUnits=" + amountOfUnits + ", Id=" + Id + ", name=" + name + ", Salary=" + this.calculateSalary() +"]";
	}
	
}
