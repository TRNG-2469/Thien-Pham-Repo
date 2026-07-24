public class EmployeeProfile {
    private static final double MIN_SALARY = 0.0;
    private static final double MAX_SALARY = 999_999.99;

    private final String employeeId;  // Immutable
    private String name;
    private double monthlySalary;

    public EmployeeProfile(String employeeId, String name, double salary) {
        this.employeeId = validateEmployeeId(employeeId);
        this.name = validateName(name);
        this.monthlySalary = validateSalary(salary);
    }

    // ==================== Getters ====================
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // ==================== Setters ====================
    public void setName(String name) {
        this.name = validateName(name);
    }

    public void setMonthlySalary(double salary) {
        this.monthlySalary = validateSalary(salary);
    }

    // ==================== Validation Methods ====================
    private static String validateEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty");
        }
        return employeeId.trim();
    }

    private static String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return name.trim();
    }

    private static double validateSalary(double salary) {
        if (salary < MIN_SALARY || salary > MAX_SALARY) {
            throw new IllegalArgumentException(
                    String.format("Salary must be between %.2f and %.2f, got %.2f",
                            MIN_SALARY, MAX_SALARY, salary)
            );
        }
        return salary;
    }

    // ==================== Utility Methods ====================
    @Override
    public String toString() {
        return String.format(
                "EmployeeProfile{id='%s', name='%s', salary=%.2f}",
                employeeId, name, monthlySalary
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeProfile)) return false;

        EmployeeProfile that = (EmployeeProfile) o;
        return Double.compare(that.monthlySalary, monthlySalary) == 0
                && employeeId.equals(that.employeeId)
                && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = employeeId.hashCode();
        result = prime * result + name.hashCode();
        result = prime * result + Double.hashCode(monthlySalary);
        return result;
    }
}