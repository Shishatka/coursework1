import java.util.Objects;

public class Employee {
    private String name;
    private int department;
    private double salary;
    private static int counter = 0;
    private int id;

    public Employee (String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        counter++;
        id = counter;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return (name + " " + department + " " + salary + " " + id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return this.name.equals(employee.name) && this.department == employee.department &&
                this.salary == employee.salary;
    }

    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}
