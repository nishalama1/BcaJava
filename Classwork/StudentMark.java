package Classwork;
public class StudentMark {

    public static int NUM_SUBJECTS = 5; // Constant for the number of subjects

    public static void main(String[] args) {

        int[][] studentMarks = {
                {85, 90, 78, 82, 95},
                {76, 80, 80, 70, 89}, 
                {92, 85, 89, 88, 94} 
        };

        // Loop through each student
        for (int i = 0; i < studentMarks.length; i++) {
            int total = 0;
            for (int mark: studentMarks[i]) { // Enhanced for loop to iterate through marks
                total += mark;
            }

            double average = (double) total / NUM_SUBJECTS; // Cast to double for accurate average

            System.out.println("Student " + (i + 1) + " Total: " + total);
            System.out.println("Student " + (i + 1) + " Average: " + average);

            String status = average > 80? "Passed": "Failed"; // Ternary operator for concise pass/fail
            System.out.println("Student " + (i + 1) + " " + status);
            System.out.println("--------------------"); // Separator for better readability
        }
    }
}