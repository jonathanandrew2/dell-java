import java.util.Scanner;

public class calc {





	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Pick two numbers");
		    int input1 = Integer.parseInt(sc.next());
		    int input2 = Integer.parseInt(sc.next());
		    System.out.print(subtraction(input1, input2));
		    System.out.print(addition(input1, input2));
		  
		  
		  
		  
	    
	
		
		

	}
	
	public static int addition(int x, int y) {
			
	int sum = x + y;
	
	return sum;

	}
	
	public static int subtraction(int x, int y) {
		
		int sum = x - y;
		
		return sum;
	}
	
	public static int multiplication(int x, int y) {
		
		int sum = x * y;
		
		return sum;
	}
	
	public static int division(int x, int y) {
		
		int sum = x / y;
		
		return sum;
	}
	
	public static int modulus(int x, int y) {
		int sum = x % y;
		
		return sum;
	}
	
	
	
}

	
	
	

