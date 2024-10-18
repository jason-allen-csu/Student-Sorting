package JavaProgramming;

import java.util.Comparator;

// Comparator to sort by Roll Number.

public class RollNoComparator implements Comparator<Student> {
    
	@Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}