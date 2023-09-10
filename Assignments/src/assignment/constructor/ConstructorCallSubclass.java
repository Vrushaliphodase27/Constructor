package assignment.constructor;

public class ConstructorCallSubclass extends ConstructorCallParent {
	 ConstructorCallSubclass(){
		System.out.println("Constructor of Subclass");
	}
	 ConstructorCallSubclass(int num) {
		System.out.println("Constructor with arg");
	}
	void display() {
		System.out.println("Hello");
	}
	

	public static void main(String[] args) {
	ConstructorCallSubclass s=new ConstructorCallSubclass();
	s.display();
	ConstructorCallSubclass s1=new ConstructorCallSubclass(10);
	s1.display();
	}

}
