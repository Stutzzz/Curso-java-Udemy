package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Employees;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered: ");
		int n = sc.nextInt();

		List<Employees> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("");
			System.out.printf("Employee #%d:%n", i);

			System.out.print("Id: ");
			int numberId = sc.nextInt();

			while (hasId(list, numberId)) {
				System.out.println("Id already taken! Try again: ");
				numberId = sc.nextInt();
			}

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employees employee = new Employees(numberId, name, salary);
			list.add(employee);

		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int increaseId = sc.nextInt();

		Employees emp = list.stream().filter(x -> x.getId() == increaseId).findFirst().orElse(null);

		// Integer pos = possition(list, increaseId);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);

			System.out.println("List of employees:");

			for (Employees x : list) {
				if (x != null) {
					System.out.println(x);
				}
			}
		}

		sc.close();
	}

	public static Integer possition(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}

	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
