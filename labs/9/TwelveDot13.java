import java.io.File;
import java.util.Scanner;

public class TwelveDot13 {

	public static void main(String[] args) {
		String fileName = args[0];
		try{
			// Create a file object with the filename passed via command line
			File file = new File(fileName);
			
			// Initialize counters
			int lineCount = 0;
			int wordCount = 0;
			int characterCount = 0;
			
			// Initialize scanner
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine()){
				// Increment the number of lines
				lineCount ++;
				
				// Increment the number of characters
				String line = scanner.nextLine();
				characterCount += line.length();
				
				if(!line.equals("")){
					// Increment the number of words
					String[] words = line.split(" ");
					wordCount += words.length;
				}
			}
			
			scanner.close();
			// Display results to the user
			System.out.println("The file " + fileName + " contains:");
			System.out.println(lineCount + " lines.");
			System.out.println(wordCount + " words.");
			System.out.println(characterCount + " characters");
		}
		catch(Exception e){
			
		}
	}

}
