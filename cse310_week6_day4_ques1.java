import java.util.Arrays;

public class AverageMarks {
    public static double[] average_marks(double[][] marks) {
        int n = marks.length; 
        double[] averages = new double[n];

        for (int i = 0; i < n; i++) {
            Arrays.sort(marks[i], 0, 3);
            double sum = marks[i][1] + marks[i][2]; 
            averages[i] = sum / 2; 
        }
        return averages;
    }
    public static void main(String... vamsi) {
        double[][] marks = {
            {10.5, 2.5, 15},
            {5.25, 6.75, 11.25}
        };
        double[] averages = average_marks(marks);

        for (double avg : averages) {
            System.out.print(avg + " ");
        }
    }
}
