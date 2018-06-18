package combinationdesingpatterns;

import Imp.ArrayImp;
import Imp.OfficerList;
import Imp.WorkerList;
import abstraction.Employee;
import concrete.Officer;
import concrete.Worker;
import interfacezs.Iterator;

public class Combinationdesingpatterns {

    public static void main(String[] args) {
       
    	OfficerList officelist = new OfficerList(new ArrayImp<Officer>());
    	officelist.load();
    	
    	WorkerList workerlist = new WorkerList(new ArrayImp<Worker>());
    	workerlist.load();
    	
    	Iterator off_iter = officelist.getData().getIterator();
    	System.out.println("OFFICER LIST");
    	for (off_iter.first(); off_iter.isDone() == false; off_iter.next())
        	{
        		Employee emp = (Officer)off_iter.current();
        		System.out.println(emp.toString());
        	}
    	
    	System.out.println("-------------------------------------------");
    	
    	Iterator wk_iter = workerlist.getData().getIterator();
    	System.out.println("WORKER LIST");
    	for (wk_iter.first(); wk_iter.isDone() == false; wk_iter.next())
        	{
        		Employee emp = (Worker)wk_iter.current();
        		System.out.println(emp.toString());
        	}	
    } 
}
