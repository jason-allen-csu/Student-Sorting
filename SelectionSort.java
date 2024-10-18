package JavaProgramming;

import java.util.Comparator;
import java.util.ArrayList;

// Class with user defined selection sort to sort the elements using a comparator.

public class SelectionSort {
    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the current element
            if (minIndex != i) {
                Student temp = students.get(i);
                students.set(i, students.get(minIndex));
                students.set(minIndex, temp);
            }
        }
    }
}
