package JavaProgramming;

// Student Class containing the Student's name, roll number and address.
// Also has getter and method to display the details.

public class Student {
	private int RollNo;
	private String Name;
	private String Address;
	
	// Parameterized Constructor 
	public Student (int RollNo, String Name, String Address) {
		this.RollNo = RollNo;
		this.Name = Name;
		this.Address = Address;
	}

	// Getter
	public int getRollNo() {
		return RollNo;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getAddress() {
		return Address;
	}

	@Override
	public String toString() {
		return "Roll No: " +RollNo +", Name: " +Name +", Address: " +Address;
	}
}