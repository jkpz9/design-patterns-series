package Imp;

import java.util.List;

import abstraction.Employee;
import interfacezs.Iterator;

public class ArrayImplForwardIterator implements Iterator {	
	private List<Employee> data;
	private int index;

	public ArrayImplForwardIterator(List<Employee> data) {
		super();
		this.data = data;
		first();
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		index++;
	}

	@Override
	public boolean isDone() {
		return data.size() > 0 && index >= data.size();
	}

	@Override
	public Object current() {
		return isDone()? null : data.get(index);
	}
	

}
