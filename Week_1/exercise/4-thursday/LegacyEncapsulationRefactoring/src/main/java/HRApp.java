public class HRApp {
    public static void main(String[] args) {
        try {
            // Valid employee creation
            EmployeeProfile employee = new EmployeeProfile("EMP001", "John Doe", 5000.0);
            System.out.println("Created: " + employee);

            // Update name
            employee.setName("Jane Doe");
            System.out.println("Updated: " + employee);

            // Update salary
            employee.setMonthlySalary(6000.0);
            System.out.println("Updated: " + employee);

            // Print final state
            System.out.println("\nFinal State:");
            System.out.println("ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: $" + employee.getMonthlySalary());

        } catch (IllegalArgumentException e) {
            System.err.println("Validation Error: " + e.getMessage());
        }
    }
}