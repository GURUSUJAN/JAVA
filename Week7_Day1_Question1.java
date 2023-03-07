import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswers = scanner.nextLine().toUpperCase();
        if (correctAnswers.length() != 5 || !correctAnswers.matches("[A-D]+")) {
            System.out.println("Incorrect Input");
            return;
        }
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numStudents; i++) {
            String studentAnswers = scanner.nextLine().toUpperCase();
            if (studentAnswers.length() != 5 || !studentAnswers.matches("[A-DX]+")) {
                System.out.println("Incorrect Input");
                return;
            }
            double marks = 0;
            for (int j = 0; j < 5; j++) {
                if (studentAnswers.charAt(j) == 'X') {
                    continue;
                }  
                if (studentAnswers.charAt(j) == correctAnswers.charAt(j)) {
                    marks += 1;
                } else {
                    marks -= 0.25;
                }
            }
            System.out.print(marks + " ");
        }
        scanner.close();
    }
}
