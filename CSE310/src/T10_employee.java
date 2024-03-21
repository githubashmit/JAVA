public class T10_employee {
    public static void main(String[] args) {
        double HR = Double.parseDouble(args[0]);
        double DA = Double.parseDouble(args[1]);
        double basicSalary = Double.parseDouble(args[2]);


        double grossSalary = basicSalary +  HR + DA ;


        System.out.println("Gross Salary: " + grossSalary);
    }
}
