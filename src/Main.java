import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] grades = new double[10];
        double total = 0;

        //User input student grades
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
            total += grades[i];
        }
        //Calculate student average grade
        double average = total / grades.length;

        // Find Max Grade and Min Grade for students
        double max = grades[0];
        double min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                }
                if (grades[i] < min) {
                    min = grades[i];
                }
            }
        //Print results
        System.out.println("Total Added Grades: " + total);
        System.out.println("Average Grade: %" + total/grades.length);
        System.out.println("Maximum Grade: %" + max);
        System.out.println("Minimum Grade: %" + min);
    }

       }

