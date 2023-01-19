import java.security.Identity;

public class Employee {

    public static void main(String[] args) {
        Employee empOne = new Employee("Shinchan");
        empOne.id(10);
        empOne.setSalary(67);
        empOne.designationa("Manager");
        empOne.printEmp();
    }

    String name;
    int salary;
    int id;
    String designationa;

    public Employee(String emp_name) {
        name = emp_name;
    }

    public void setSalary(int emp_salary) {
        salary = emp_salary;
    }

    public void id(int emp_id) {
        id = emp_id;
    }

    public void designationa(String emp_designationa) {
        designationa = emp_designationa;
    }

    public void printEmp() {
        System.out.println("Empolyee id :" + id);
        System.out.println("Employee name  : " + name);
        System.out.println("Employee designationa : " + designationa);
        System.out.println("Employee salary :" + salary);

    }

}
