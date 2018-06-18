
package Imp;

import java.util.ArrayList;
import java.util.List;

import abstraction.Employee;
import interfacezs.EmployeeListImp;
import interfacezs.Iterator;

public class ArrayImp<T extends Employee> implements EmployeeListImp<T> {
	List<Employee> data = new ArrayList<Employee>();

@Override
public void add(T item) {
	data.add(item);
	
}

@Override
public Iterator getIterator() {
	// return new ArrayImplForwardIterator(data);
	return new ArrayImpBackwardIterator(data);
	
}

}
