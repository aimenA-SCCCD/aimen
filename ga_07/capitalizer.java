import java.util.Scanner;

/**
	This program capitalizes the first letter of every sentence
	in the string provided by the user.
*/

public class capitalizer
{
	public static void main(String[] args)
	{
		String sentence; 	// To hold user given input string
		char[] sent_char; 	// To hold characters in the string that user provides
		String sentence_output; //To hold the modified sentence
	
		
		//Create a scanner object for keyboard input
		
		Scanner keyboard =  new Scanner(System.in);

	
		//Get an input of sentences
		
		System.out.println("Enter a string of sentences:: ");
		sentence = keyboard.nextLine();


		//store all the characters in the string in the character array in order
		
		sent_char = sentence.toCharArray();

		// Passes through each character in the array

		for(int i=0; i<sent_char.length; i++)
		{
			// Converts the first character in the array to upper case character
		
			sent_char[0] = Character.toUpperCase(sent_char[0]);			
		
			
			// checks for the character other then letter or a space
			
			if(!Character.isLetter(sent_char[i]) && sent_char[i]!=' ' && i<(sent_char.length-2))
			{
				//if there is a space after the symbol then the letter after the space is converted to upper case else it remains unaltered
			
				if(sent_char[i+1] == ' ')
				{
					sent_char[i+2] = Character.toUpperCase(sent_char[i+2]);
				}
			
			}
		
		}
		
		
		//converts character array to string
		sentence_output = new String(sent_char);

		//Outputs the modified input string
		System.out.println("Modified string:: " + sentence_output);		
		
	}
}