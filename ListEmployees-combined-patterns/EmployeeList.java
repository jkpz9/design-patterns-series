package abstraction;

import interfacezs.EmployeeListImp;

public abstract class EmployeeList<T extends Employee> {
	 protected EmployeeListImp<T> data;
	 public EmployeeListImp<T> getData() {
		return data;
	}
	public void setData(EmployeeListImp<T> data) {
		this.data = data;
	}
	public abstract void load();
}
