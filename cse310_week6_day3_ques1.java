import java.util.Scanner;

public class Student {
    private String name;

    public Student(String name) {
        if (name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameInput = scanner.nextLine().trim();
        Student student1 = new Student(nameInput);
        System.out.println(student1.getName());

        String otherInput = scanner.nextLine().trim();
        Student student2 = new Student(otherInput);
        System.out.println(student2.getName());

        scanner.close();
    }
}
