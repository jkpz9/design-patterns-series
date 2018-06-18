package abstraction;
public abstract class Employee {
    protected String Id;
    protected String name;

    public abstract double calculateSalary();

    
    @Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + "]";
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}
