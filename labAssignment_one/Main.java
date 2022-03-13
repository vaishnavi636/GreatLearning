package labAssignment_one;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name ");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name ");
		String lastName = sc.nextLine();

		Employee emp = new Employee(firstName, lastName);

		Credentials newHires = new Credentials();

		System.out.print("Please enter the department from the following");
		System.out.print("\n 1. Technical");
		System.out.print("\n 2. Admin ");
		System.out.print("\n 3. Human Resource");
		System.out.print("\n 4. Legal");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			newHires.showInfo(emp, "tech");
		} else if (depChoice == 2) {
			newHires.showInfo(emp, "admin");
		}

		else if (depChoice == 3) {
			newHires.showInfo(emp, "hr");
		}

		else if (depChoice == 4) {
			newHires.showInfo(emp, "legal");
		}

		else {
			System.out.println("invalid input");
		}
	}

}
