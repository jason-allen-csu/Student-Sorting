package JavaProgramming;

import java.util.Comparator;

// Comparator to sort by Name.

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}