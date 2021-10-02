import java.util.Arrays;
import java.util.Scanner;
/*
Name: Narendra Gopalam
Student Number: A00245541

Program Description: Utilization of Methods and Arrays
*/

public class ArrayTools { 

	public static void main (String args[]) //Start of the program	
	{
		String to_be_encrypted="",encrypted_data=""; //decalred two varibles for input value and output value
		int shift_value=0; //shift value used for Caesar cipher
		Scanner sc=new Scanner(System.in); // Used to read input from console
		
		System.out.println("Enter a string to encrypt :"); 
		to_be_encrypted=sc.next(); //reads the string value to be encrypted from console 
		sc.nextLine();
		System.out.println("Enter a value to encrypt with :");
		shift_value=sc.nextInt(); //reads the int value from console
		sc.nextLine();
		encrypted_data=encrypt(to_be_encrypted,shift_value); //calls the method encrypt and returns the output to encrypted data
		System.out.println("The encrypted string is "+encrypted_data); //output will be printed 
		System.out.println("Decrypting "+encrypted_data+" with -"+shift_value+"..."); //decrypting the value
		System.out.println(to_be_encrypted); //decrypted value
		
		System.out.println("\n"); // New Line
		
		int [] grades={44,78,45,77,44,98,67,68,91,54}; //declared int array for multiple grades
		float average=average(grades); //calls the method average and returns the average of the above grades
		System.out.println("Testing methods with "+Arrays.toString(grades)); //prits the grades using Arrays.toString
		System.out.println("The average is "+average); //prints the average of the grades
		
		System.out.println("\n"); // New Line

		System.out.println("Enter a value to search for :");
		int search_value=0;
		search_value=sc.nextInt(); //reads the int value from console
		sc.nextLine();
		boolean validation=search(grades,search_value); //calls the method search and returns boolean value
		
		if(validation) //if the validation is true then the below statement will be executed else it will execute the statement in else block 
			System.out.println("The array contains "+search_value);
		else //for single line statements in if-else there is no need of flower brackets
			System.out.println("The array does not contain "+search_value);
		
		System.out.println("\n");
		
		String reverse=reverse(grades); //calls reverse method and returns a string of grades
		System.out.println("The array reversed is "+reverse); //final statemnt in the program
	}
	
	public static String encrypt(String to_be_encrypted,int shift_value) //method is a string type and contains two parameters which are a string and int types
	{
		String encrypted_data=""; //final out will be stored in this variable
		
		for(int index=0;index<to_be_encrypted.length();index++) //iterates until the end of stirng length
		{
			encrypted_data+=(char) (to_be_encrypted.charAt(index)-shift_value); // charAt used to get char value and shift value is cliculated and return ascii code and is converted to char
		}
		
		return encrypted_data; //returns final output
	}
	public static float average(int [] grades){ //method is a float type and contains one parameter which is a int array contains list of marks
		int total_grades=0;
		
		for(int index=0;index<grades.length;index++) //iterates until the final value of array
		{
			total_grades+=grades[index]; //adding the total values of array into one variable
		
		}
		
		float average=(float)total_grades/grades.length; //caliculates the final result 
		return average;  //returns final output
	}
	public static boolean search(int [] grades,int search_value) //method is a boolean type and contains two parameters on for list of marks and another for search value
	{
		
		boolean validation=false; //boolean value for final result and is initialised with false
		
		for(int index=0;index<grades.length;index++) //iterates until the final value of array
		{
			if(search_value==grades[index]) //if the search value and the value in grades matches then the below line will be executed
			{
				validation=true;
				
			}
		}
					
		return validation; //returns final output
	}
	public static String reverse(int [] grades) //method is a String type and contains one parameter which contains list of marks 
	{
		int [] reverse= new int[grades.length]; //created an array with same length as grades
		for(int index=0,grade_length=grades.length-1;grade_length>=0;grade_length--,index++)  //iterates the array reversely from final value to zero
		{
			reverse[index]=grades[grade_length]; //stores the final value into first value and at next iteration the final value decreses by 1 and first value increases by 1   
		}
		String result=Arrays.toString(reverse);  //converts array to string and stores in result
		
		return result; //returns final output
	}
}
