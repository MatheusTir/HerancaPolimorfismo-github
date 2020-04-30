package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees:");
		int n = sc.nextInt();
		List<Employee> employee = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("Employee #%d data:\n", i);
			System.out.print("Outsourced (y/n) ?");
			String outsourced = sc.nextLine();
			String name = sc.nextLine();
			int hours = sc.nextInt();
			double valuePerHour = sc.nextDouble();
			if (outsourced.charAt(0) == 'y') {
				System.out.print("Additional charge:");
				double additionalCharge = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employee.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println("PAYMENTS:");
		for (Employee employee0 : employee) {
			System.out.println(employee0.toString());
		}
		sc.close();
	}

}
