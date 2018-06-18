package Imp;

import abstraction.EmployeeList;
import concrete.Worker;
import interfacezs.EmployeeListImp;

public class WorkerList  extends EmployeeList<Worker>{

	public WorkerList(EmployeeListImp<Worker> data) 
	{
		super.data = data;
	}
	@Override
	public void load() {
		Worker  worker = new Worker();
		worker.setId("WK001");
		worker.setName("Amelia");
		worker.setAmountOfUnits(50);
		super.data.add(worker);
		
		worker = new Worker();
		worker.setId("WK002");
		worker.setName("Olivia");
		worker.setAmountOfUnits(72);
		super.data.add(worker);
		
		worker = new Worker();
		worker.setId("WK003");
		worker.setName("Poppy");
		worker.setAmountOfUnits(82);
		super.data.add(worker);
		
		worker = new Worker();
		worker.setId("WK004");
		worker.setName("Scarlett");
		worker.setAmountOfUnits(88);
		super.data.add(worker);
		
		worker = new Worker();
		worker.setId("WK005");
		worker.setName("Chloe");
		worker.setAmountOfUnits(93);
		super.data.add(worker);
	}

}
