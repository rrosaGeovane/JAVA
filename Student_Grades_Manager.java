import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float highest = 0;
        int highestIndex = 0;
        float lowest = 0;
        int lowestIndex = 0;

        String menu = """
            ===== MENU =====
            1. Show all grades
            2. Show highest grade
            3. Show lowest grade
            4. Exit
            =================
            """;

        System.out.println("Enter the number of students: ");
        int totalStudents = sc.nextInt();

        if (totalStudents == 0) {
            System.exit(0);
        }

        float[] studentGrades = new float[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            System.out.printf("Enter grade for student %d: \n", i + 1);
            studentGrades[i] = sc.nextFloat();

            if (studentGrades[i] > 100) {
                studentGrades[i] = 100;
            }

            if (i == 0) {
                highest = studentGrades[i];
                lowest = studentGrades[i];
                highestIndex = i;
                lowestIndex = i;
            } else {
                if (studentGrades[i] > highest) {
                    highest = studentGrades[i];
                    highestIndex = i;
                }
                if (studentGrades[i] < lowest) {
                    lowest = studentGrades[i];
                    lowestIndex = i;
                }
            }
        }

        while (true) {
            System.out.println(menu);
            System.out.println("Your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < totalStudents; i++) {
                        if (studentGrades[i] >= 90) {
                            System.out.printf("Student %d grade: %.2f: EXCELLENT\n", i + 1, studentGrades[i]);
                        } else if (studentGrades[i] >= 75) {
                            System.out.printf("Student %d grade: %.2f: GOOD\n", i + 1, studentGrades[i]);
                        } else if (studentGrades[i] >= 60) {
                            System.out.printf("Student %d grade: %.2f: AVERAGE\n", i + 1, studentGrades[i]);
                        } else {
                            System.out.printf("Student %d grade: %.2f: FAIL\n", i + 1, studentGrades[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.printf("The highest grade is from student %d: %.2f\n", highestIndex + 1, highest);
                    break;

                case 3:
                    System.out.printf("The lowest grade is from student %d: %.2f\n", lowestIndex + 1, lowest);
                    break;

                case 4:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
