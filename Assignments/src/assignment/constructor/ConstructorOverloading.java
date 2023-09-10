package assignment.constructor;

public class ConstructorOverloading {
	private int rollNum;
	 ConstructorOverloading(){
		 rollNum=100; 
	 }
	 ConstructorOverloading(int rNum){
		 this();
		 rollNum=rollNum+rNum;
	 }
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	

}
