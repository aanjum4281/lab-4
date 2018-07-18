import java.util.Scanner; 

public class SquaresAndCubes {
	
//Amna Anjum 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String input = "y"; 
		
		System.out.println("Learn your squares and cubes!");
	
		do {
	
			System.out.println("Enter an integer:");
		int integer = scnr.nextInt(); 
		
		
		System.out.println("Number" +"  "+ "Squared" +"  "+ "Cubed");
		System.out.println("======" +"  "+ "=======" +"  "+ "=====");
		
		int square = 0;
		int cube = 0; 
		
		String row = ""; 
		
		for (int i = 1; i <= integer; i++ ) {
			
			square = i * i;
			cube = i * i * i;
			
		row =      i + "       " + square + "        " + cube;
		System.out.println(row);
		}
		System.out.println("would you like to continue? (y/n)");
		scnr.nextLine();
		input = scnr.nextLine();
		
		} while (input.equals("y"));
		
		System.out.println("Goodbye");
		
		
	scnr.close();	
	}

}
