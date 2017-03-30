import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwelveDot11 {

	public static void main(String[] args) {
		// Take in arguments from command line
		String stringToRemove = args[0];
		System.out.println("Remove this string: " + stringToRemove);
		String fileName = args[1];
		System.out.println(fileName);
		
		// Use filename to create a file
		try{
			File file = new File(fileName);
			
			// Initialize a scanner to read the file
			Scanner scanner = new Scanner(file);
			
			// Create a stringbuilder object to hold whole file
			StringBuilder replacedFile = new StringBuilder();
			
			System.out.println("Flag - " + scanner.hasNextLine());
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				System.out.println("Before: " + line);
				line = line.replaceAll("Pablo", " ");
				System.out.println("After replacement: " + line);
				replacedFile.append(line + "\n");
			}
			scanner.close();
			System.out.println(replacedFile);
			
			// Create a Print Writer to write new file
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.print(replacedFile);
			printWriter.close();
		}catch(Exception e){
			System.out.println("The file could not be located." + e.getMessage());
		}

	}

}
