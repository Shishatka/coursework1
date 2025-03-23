//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

    employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
    employees[1] = new Employee("Иванов Иван Иванович", 1, 50000);
    employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 70000);
    employees[3] = new Employee("Кузнецова Анна Владимировна", 3, 55000);
    employees[4] = new Employee("Смирнов Алексей Николаевич", 3, 80000);
    employees[5] = new Employee("Васильева Ольга Сергеевна", 1, 45000);
    employees[6] = new Employee("Николаев Николай Николаевич", 2, 90000);
    employees[7] = new Employee("Алексеева Екатерина Андреевна", 3, 75000);
    employees[8] = new Employee("Дмитриев Дмитрий Дмитриевич", 4, 65000);
    employees[9] = new Employee("Федорова Мария Ивановна", 5, 85000);

    printAll();
    calculateAll();
    findMinimumSalary();
    findMaximumSalary();
    calculateMean();
    printNames();
    //indexAllSalaries(150);
    printAll();

    findMinSalaryInDepartment(3);
    findMaxSalaryInDepartment(3);
    findMeanInDepartment(3);

    indexInDepartment(5, 150);
    printAllInDepartment(5);
        System.out.println();
    printAllLessThan(90_000);
        System.out.println();
    printAllMoreThan(50_000);
        System.out.println(employees[0].equals(employees[1]));






    EmployeeBook book = new EmployeeBook();
        book.addNewEmployee(employees[0]);
        book.addNewEmployee(employees[0]);
        book.addNewEmployee(employees[0]);
        book.printAll();

}

        public static void printAll() {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }

        public static void calculateAll() {
            double totalAmount = 0;
            for (int i = 0; i < employees.length; i++) {
                totalAmount = totalAmount + employees[i].getSalary();
            }
            System.out.println("Сумма ЗП в месяц - " + totalAmount);
        }

        public static void findMinimumSalary() {
            double min = Integer.MAX_VALUE;
            for (int i = 0; i < employees.length; i++) {
                if (min > employees[i].getSalary())
                    min = employees[i].getSalary();
            }
            System.out.println("Минимальная ЗП в месяц - " + min);
        }

        public static void findMaximumSalary() {
            double min = Integer.MIN_VALUE;
            for (int i = 0; i < employees.length; i++) {
                if (min < employees[i].getSalary())
                    min = employees[i].getSalary();
            }
            System.out.println("Максимальная ЗП в месяц - " + min);
        }

        public static void calculateMean() {
            double totalAmount = 0;
            for (int i = 0; i < employees.length; i++) {
                totalAmount = totalAmount + employees[i].getSalary();
            }
            System.out.println("Средняя ЗП в месяц - " + totalAmount / employees.length);
        }

        public static void printNames() {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getName());
            }
        }

        public static void indexAllSalaries(double percent) {
            for (int i = 0; i < employees.length; i++) {
                employees[i].setSalary(employees[i].getSalary() * (percent / 100));
            }
        }

        public static void findMinSalaryInDepartment(int department){
            if (department < 0) {
                throw new IllegalArgumentException();
            }
            double min = Integer.MAX_VALUE;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department)
                {
                    if (min > employees[i].getSalary()) {
                        min = employees[i].getSalary();
                    }
                }
            }
            System.out.println(min);
        }

        public static void findMaxSalaryInDepartment(int department){
            if (department < 0) {
                throw new IllegalArgumentException();
            }
            double min = Integer.MIN_VALUE;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department)
                {
                    if (min < employees[i].getSalary()) {
                        min = employees[i].getSalary();
                    }
                }
            }
            System.out.println(min);
        }

        public static void findMeanInDepartment(int department) {
            if (department < 0) {
                throw new IllegalArgumentException();
            }
            double totalAmount = 0;
            int j = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    j++;
                    totalAmount += employees[i].getSalary();
                }
            }
            System.out.println(totalAmount/j);
        }

        public static void indexInDepartment(int department, double percent) {
            if (department < 0) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    employees[i].setSalary(employees[i].getSalary() * (percent / 100));
                }
            }
        }

        public static void printAllInDepartment(int department) {
            if (department < 0) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    System.out.println(employees[i]);
                }
            }
        }

        public static void printAllLessThan(double salary) {
            if (salary < 0) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getSalary() < salary) {
                    System.out.println(employees[i]);
                }
            }
        }

        public static void printAllMoreThan(double salary) {
            if (salary < 0) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getSalary() >= salary) {
                    System.out.println(employees[i]);
                }
            }
        }
    }
