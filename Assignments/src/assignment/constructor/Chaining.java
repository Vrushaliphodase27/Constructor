package assignment.constructor;

public class Chaining {
	public Chaining() {
		System.out.println("Default Constructor");
		}
	public Chaining(String str) {
		this();
		System.out.println("Parameterized Constructor with single parameter");
		}
	public Chaining(String str,int num) {
		this("Hey");
		System.out.println("Parameterized Constructor with two parameter ");
	}

	public static void main(String[] args) {
		 Chaining c =new Chaining("Hii",5);
	}

}
