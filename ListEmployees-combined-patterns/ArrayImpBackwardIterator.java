package Imp;

import java.util.List;

import abstraction.Employee;
import interfacezs.Iterator;

public class ArrayImpBackwardIterator implements Iterator {

	private List<Employee> data;
	private int index;
	
	public ArrayImpBackwardIterator(List<Employee> data) {
		super();
		this.data = data;
		first();
	}
	@Override
	public void first() {
		index = data.size() - 1;

	}

	@Override
	public void next() {
		index--;

	}

	@Override
	public boolean isDone() {
		return data.size()>0 && index < 0;
	}
	@Override
	public Object current() {
		return isDone()? null : data.get(index);
	}

}
