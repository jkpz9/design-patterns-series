package Imp;

import abstraction.EmployeeList;
import concrete.Officer;
import interfacezs.EmployeeListImp;

public class OfficerList extends EmployeeList<Officer>{

	public OfficerList(EmployeeListImp<Officer> data) 
	{
		super.data = data;
	}
	@Override
	public void load() {
		Officer  officer = new Officer();
		officer.setId("OFF001");
		officer.setName("Hayes");
		officer.setBaseSalary(5000000);
		officer.setVacationDays(3);
		super.data.add(officer);
		
		officer = new Officer();
		officer.setId("OFF002");
		officer.setName("Helen");
		officer.setBaseSalary(6000000);
		officer.setVacationDays(2);
		super.data.add(officer);
		
		officer = new Officer();
		officer.setId("OFF003");
		officer.setName("Hazel");
		officer.setBaseSalary(8000000);
		officer.setVacationDays(5);
		super.data.add(officer);
		
		officer = new Officer();
		officer.setId("OFF004");
		officer.setName("HARRIET");
		officer.setBaseSalary(5000000);
		officer.setVacationDays(0);
		super.data.add(officer);
		
		officer = new Officer();
		officer.setId("OFF005");
		officer.setName("HENRIETTA");
		officer.setBaseSalary(5000000);
		officer.setVacationDays(0);
		super.data.add(officer);
		
		officer = new Officer();
		officer.setId("OFF006");
		officer.setName("HENRIETTA");
		officer.setBaseSalary(5000000);
		officer.setVacationDays(0);
		super.data.add(officer);
		
		officer = new Officer();
		officer.setId("OFF007");
		officer.setName("RACHEL");
		officer.setBaseSalary(6500000);
		officer.setVacationDays(7);
		super.data.add(officer);
		
		
		officer = new Officer();
		officer.setId("OFF008");
		officer.setName("ROXANNE");
		officer.setBaseSalary(9300000);
		officer.setVacationDays(7);
		super.data.add(officer);
		
		
		officer = new Officer();
		officer.setId("OFF009");
		officer.setName("RHIANNA");
		officer.setBaseSalary(7230000);
		officer.setVacationDays(7);
		super.data.add(officer);
		
		
		officer = new Officer();
		officer.setId("OFF0010");
		officer.setName("QUEENIE");
		officer.setBaseSalary(8500000);
		officer.setVacationDays(9);
		super.data.add(officer);
			
	}

}
