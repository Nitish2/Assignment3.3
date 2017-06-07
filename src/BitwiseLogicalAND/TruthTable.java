package BitwiseLogicalAND;

import java.util.Scanner;

public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Input first number: ");  
	    byte x = in.nextByte();
	    	
	    System.out.println("Input first number: ");
	    byte y = in.nextByte();
	    
	    int a=x,b=y;
	    System.out.println(a&b); 
	    System.out.println(a==1 && b==1);

	}

}
