import java.util.Scanner;

class Person {
     String name;
     int age;

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
     int rollNumber;

    @Override
    public void getInfo() {
        super.getInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getInfo();
        student.displayInfo();
    }
}
