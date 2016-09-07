import java.util.Scanner;

public class MethodBasics {

	public static void main(String[] args) {
		
		float length, width, height;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		//Create scanner class 
		Scanner input = new Scanner(System.in);  
		
		//While loop to continue program if user agrees
		String yes = "Y";
		while(yes.equalsIgnoreCase("y")){
			
			//Prompt user to enter length of classroom
			System.out.println("Enter the length: ");
			length = input.nextFloat();
		
			//Prompt user to enter width of classroom
			System.out.println("Enter the width: ");
			width = input.nextFloat();
		
			//Prompt user to enter height of classroom
			System.out.println("Enter the height: ");
			height = input.nextFloat();
		
			//Prints out the area, perimeter, and volume of classroom based on user input
			System.out.println("Area: " +roomArea(length, width));
			System.out.println("Perimeter: " +roomPerimeter(length, width));
			System.out.println("Volume: " +roomVolume(length, width, height));
			System.out.println();
	
			//Ask user if they want to continue
			System.out.println("Continue? (Y/N)");
			input.nextLine(); //Gets rid of the extra line break
			yes = input.nextLine();	
	
	}
	
}
	//Method that calculates area of room 
	public static float roomArea(float length, float width){
		return length * width;
	}
	
	//Method that calculates perimeter of room
	public static float roomPerimeter(float length, float width){
		return 2 * (length + width);
	}
	
	//Method that calculates volume of room
	public static float roomVolume(float length, float width, float height){
		return length * height * width;
	}
	
}
