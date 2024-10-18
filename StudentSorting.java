package JavaProgramming;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Main program where the student's details will be received from user.
// Also calls the sorting comparator to sort the student by roll number and name.

public class StudentSorting {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        Scanner scnr = new Scanner(System.in);
        
        // Accepting student detail from user
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            
            // Roll number
            int rollno = 0;
            boolean validRollno = false;
            while (!validRollno) {
                try {
                    System.out.print("Enter roll number (integer): ");
                    rollno = scnr.nextInt();
                    validRollno = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer for the roll number.");
                    scnr.next();  
                }
            }
            
            // Name
            scnr.nextLine();
            System.out.print("Enter name: ");
            String name = scnr.nextLine();
            
            // Address
            System.out.print("Enter address: ");
            String address = scnr.nextLine();

            // Add to Array List
            students.add(new Student(rollno, name, address));
            System.out.print("\n");
        }
        
        // Before sort
        System.out.println("\nBefore sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by Student roll number
        System.out.println("\nSorted by roll number:");
        SelectionSort.selectionSort(students, new RollNoComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by Student name
        System.out.println("\nSorted by name:");
        SelectionSort.selectionSort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        scnr.close();
    }
}
