import java.util.Scanner;
import java.util.function.Predicate;

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }


}

public class T41_interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for salary
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();

        // Creating an Employee object and checking salary
        Predicate<Double> emp = (sal)->sal>10000;
        System.out.println(emp.test(salary));
    }
}
