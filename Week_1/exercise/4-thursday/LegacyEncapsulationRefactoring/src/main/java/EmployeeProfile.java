public class EmployeeProfile {
    private String employeeId;
    private String name;
    private double monthlySalary;

    public EmployeeProfile() {

    }
    public EmployeeProfile(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = salary;
    }

    public String getEmployeeId(){
        return this.employeeId = employeeId;
    }

    public String getName(){
        return this.name = name;
    }

    public void setName(String name){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;

    }

    public double getMonthlySalary(){
        return this.monthlySalary;

    }
    public void setMonthlySalary(double salary){

        if (salary<0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.monthlySalary = salary;


    }
}