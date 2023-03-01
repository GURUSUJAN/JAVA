import java.util.Scanner;

public class TreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[10]; 
        for (int i = 0; i < 10; i++) {
            heights[i] = sc.nextInt();
        }
        sc.close();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (heights[j] > heights[j+1]) {
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(heights[i] + " ");
        }
    }
}
