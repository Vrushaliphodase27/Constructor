package assignment.constructor;

public class SuperMethodCallingSubclass extends SuperMethodCalling  {
	public void display() {
		System.out.println("Child Class Method");
	}
	public void printMsg(){
		super.display();
		
	}

	public static void main(String[] args) {
		
		SuperMethodCallingSubclass s =new SuperMethodCallingSubclass();
		s.printMsg();
	}

}
