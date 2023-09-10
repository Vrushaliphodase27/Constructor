package assignment.constructor;

public class Constructor {
	public Constructor() {
			System.out.println("Constructor Running=====");
			
		}
	public Constructor(int a) {
		System.out.println("Constructor Running====="+a);
	}
	
		public static void main(String[] args) {
			Constructor cd=new Constructor();
			Constructor cd2=new Constructor(56);
			
	}
		

}
