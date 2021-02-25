import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class TicketMaker extends JFrame {

	static Scanner uI = new Scanner (System.in);
	static String name;
	static int choice = 0;
	public static void newIdea() throws IOException
	{
		
		System.out.println("Please enter a name for the idea you would like to add");
		name = uI.nextLine();
		createFile();
		while(choice!=1)
		{
			addIt();
		}
		
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
	          String info = JOptionPane.showInputDialog("What would you like to write in ticket called "+name); 
	          bufferedWriter.write(info);
	          bufferedWriter.newLine();
	          
	          Object[] options = {"Yes", "No"};
		  		choice = JOptionPane.showOptionDialog( null, "Would you like to add anything else to "+name+"?",
		  				"Anything Else",
		  				JOptionPane.YES_NO_CANCEL_OPTION,
		  				JOptionPane.QUESTION_MESSAGE,
		  				null, options, options[1]);
	          
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
