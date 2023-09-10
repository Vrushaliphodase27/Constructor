package assignment.constructor;

public class StudentTestOverloading {

	public static void main(String[] args) {
		Student myobj=new Student();
		System.out.println("Student Id is"+ myobj.getId());
		System.out.println("Student Name is"+myobj.getName());
		System.out.println("Student Age is"+myobj.getAge());
		System.out.println();
		Student myobj1=new Student(11,"Anita",30);
		System.out.println("Student Id is" + myobj1.getId());
		System.out.println("Student Name is" +myobj1.getName());
		System.out.println("Student Age is" +myobj1.getAge());
	}

}
