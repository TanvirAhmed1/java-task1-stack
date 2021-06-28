package stack;

public class MainClass {
	public static void main(String[] args) { 
		  StringStackArray stack = new StringStackArray(); 
		  stack.push("Tanzil");
		  stack.push("Shahabuddin");
		  stack.push("Tanvir"); 
		  System.out.println("My name is "+ stack.pop());
		  System.out.println("My name is "+ stack.pop());
		  System.out.println("My name is "+ stack.pop());
		  }
}
