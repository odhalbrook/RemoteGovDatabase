import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.util.*;
public class TicketMaker {

	static Scanner uI = new Scanner (System.in);
	static String name;
	public static void newIdea()
	{
		
		System.out.println("Please enter a name for the idea you would like to add");
		name = uI.nextLine();
		createFile();
	}

	public static void addIt() throws IOException
	{
		Scanner file = new Scanner( new File( name ) );
	      // The name of the file to open.
	      String fileName = name;
	      
	      new PrintWriter(name).close();

	      try {
	          // Assume default encoding.
	          FileWriter fileWriter = new FileWriter(fileName, true);

	          // Always wrap FileWriter in BufferedWriter.
	          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	          
	          
	      }
	      catch(Exception e) 
	      	{
	          System.out.println("Error writing to file '" + fileName + "'");
	          // Or we could just do this:
	          // ex.printStackTrace();
	      	}

	          // Note that write() does not automatically
	          // append a newline character.
	}
	public static void createFile (){
	  {
	    try {
	      File myObj = new File(name+".txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	}

}
