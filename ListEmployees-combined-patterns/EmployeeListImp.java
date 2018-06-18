package interfacezs;
import abstraction.Employee;

public interface EmployeeListImp<T extends Employee> {
    void add(T item);
    Iterator getIterator();    
}
