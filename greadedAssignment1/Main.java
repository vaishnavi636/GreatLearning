package greadedAssignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HrDepartment hrdepartment = new HrDepartment();
		TechDepartment techdepartment = new TechDepartment();
		AdminDepartment admindepartment = new AdminDepartment();
		
		System.out.println("Welcome to "+admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday());
		
		System.out.println("\n\nWelcome to "+hrdepartment.departmentName());
		System.out.println(hrdepartment.doActivity());
        System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday());
		
		System.out.println("\n\nWelcome to "+techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.getTechStackInformation());
		System.out.println(techdepartment.isTodayAHoliday());
		
		
	}

}
