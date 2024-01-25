import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee information
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter employee position: ");
        String employeePosition = scanner.nextLine();

        Employee employee = new Employee(employeeId, employeeName, employeePosition);

        // Input salary
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        // Input deduction
        System.out.print("Enter deduction: ");
        double deduction = scanner.nextDouble();

        SalaryCalculator calculator = new SalaryCalculator(salary, new double[]{}, new double[]{deduction});

        double netPay = calculator.calculateNetPay();

        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Position: " + employee.getPosition());
        System.out.println("Salary: " + salary);
        System.out.println("Net Pay (Salary with Deduction): " + netPay);

        // Create an instance of EmploymentHistory with the same deduction calculation as net pay
        EmploymentHistory history = new EmploymentHistory(employee, new Date(), new Date(), employee.getPosition(), salary - deduction);

        System.out.println("Employment Start Date: " + history.getStartDate());
        System.out.println("Employment End Date: " + history.getEndDate());
        System.out.println("Employee Position: " + history.getPosition());

        scanner.close(); // Close the scanner when done.
    }
}
