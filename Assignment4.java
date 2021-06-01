import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeData employee[] = new EmployeeData[100];
		String name;
		String ssn = null;
		double salary;
		double total = 00.00;
		double average = 00.00;
		int count = 0;
		int correct = 0;
		char again = 'y';

		for (int i = 0; i < 100; i++) {
			scan = new Scanner(System.in);
			System.out.print("Enter employee's full name: ");
			name = scan.nextLine();
			System.out.print("Enter employee's salary: ");
			salary = scan.nextDouble();
			scan.nextLine();
			total += salary;
			count++;
			do {
				try {
					System.out.print("Enter employee's ssn: ");
					ssn = scan.nextLine();
					if (ssn.length() != 9) {
						throw new SSNLengthException();
					}
					for (int j = 0; j < 9; j++) {
						if (ssn.charAt(j) < '0' || ssn.charAt(j) > '9') {
							throw new SSNCharacterException();
						}
					}
					correct = 1;
				} catch (SSNLengthException emp) {
					System.out.println(emp.getMessage());
				} catch (SSNCharacterException emp) {
					System.out.println(emp.getMessage());
				}
			} while (correct == 0);

			employee[i] = new EmployeeData(name, ssn, salary);


			System.out.print(
					"If you'd like to enter another employee, click (Y) on keyboard for yes. Otherwise click any other key.");
			again = scan.next().charAt(0);
			if (again != 'y')
				break;
		}
		average = total / count;
		System.out.println("Name\tSocial Security\tSalary\tFinancial Status");
		for (int i = 0; i < count; i++) {
			if (employee[i].getSalary() > average) System.out.println(employee[i] + "This is above average.");
			else if (employee[i].getSalary() < average) System.out.println(employee[i] + "This is below average.");
			else System.out.println(employee[i] + "This is average.");


	}
}
}
