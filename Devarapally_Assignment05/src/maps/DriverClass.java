package maps;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/


import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentMap studentMap = new StudentMap();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student id: ");
            int sID = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student branch: ");
            String branch = sc.nextLine();
            System.out.print("Enter student registered course: ");
            String registeredCourse = sc.nextLine();
            System.out.print("Enter student's school: ");
            String s = sc.nextLine();

            Student student = new Student(sID, name, branch, registeredCourse, s);
            studentMap.insertStudentDetails(student);
        }

        System.out.println("\nStudent Details are:");
        studentMap.printStudentDetails();

        System.out.print("\nEnter any student id to update: ");
        int sIDToUpdate = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter the new registered course: ");
        String newCourse = sc.nextLine();
        studentMap.updateStudentCourse(sIDToUpdate, newCourse);

        System.out.println("\nAfter updating student details are:");
        studentMap.printStudentDetails();

        System.out.print("\nEnter any student id to delete: ");
        int sIDToDelete = sc.nextInt();
        studentMap.deleteStudent(sIDToDelete);

        System.out.println("\nAfter removing student details are:");
        studentMap.printStudentDetails();

        sc.close();
    }
}

