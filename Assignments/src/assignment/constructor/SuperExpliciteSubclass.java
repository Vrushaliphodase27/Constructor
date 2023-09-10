package assignment.constructor;

public class SuperExpliciteSubclass extends SuperExpliciteParent{
	SuperExpliciteSubclass(){
		super();
		System.out.println("Constructor of Subclass");
	}
	void display() {
		System.out.println("Hello");
	}
	

	public static void main(String[] args) {
		SuperExpliciteSubclass obj=new SuperExpliciteSubclass();
		obj.display();
		

	}

}
