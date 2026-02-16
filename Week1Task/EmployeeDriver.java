package Week1Task;

public class EmployeeDriver {

    public static void main(String[] args) {

        System.out.println("POSITIVE TEST CASES");

        Developer dev = new Developer("Rahul", 101, 10, 60000, 26, 4);
        dev.SalaryDetails();

        Manager mgr = new Manager("Anita", 102, 8, 90000, 28, 5);
        mgr.SalaryDetails();

        Intern intern = new Intern("Ravi", 103, 20000, 20, 3);
        intern.SalaryDetails();


        System.out.println(" NEGATIVE TEST CASES");

        Developer invalidDev = new Developer("Invalid", 104, 5, -50000, 25, 3);
        invalidDev.SalaryDetails();

        Intern invalidIntern = new Intern("Test", 105, 15000, 35, 2);
        invalidIntern.SalaryDetails();

        Manager invalidMgr = new Manager("Test2", 106, 5, 80000, 25, 7);
        invalidMgr.SalaryDetails();
    }
}
