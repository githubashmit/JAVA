public class T9_avg {
    public static void main(String[] args) {
        String name = args[0];
        double marks1 = Double.parseDouble(args[1]);
        double marks2 = Double.parseDouble(args[2]);
        double marks3 = Double.parseDouble(args[3]);

        // Calculate total marks
        double totalMarks = marks1 + marks2 + marks3;

        // Calculate average marks
        double averageMarks = totalMarks / 3;

        // Print the total and average marks
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}
