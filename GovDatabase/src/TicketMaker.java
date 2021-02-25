import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class TicketMaker extends JFrame {

	static Scanner uI = new Scanner (System.in);
	static String name;
	static boolean choice = true;
	static String info;
	private static final long serialVersionUID = 1L;
	static JFrame frame = new JFrame();
	public static void newIdea() throws IOException
	{
		
		System.out.println("Please enter a name for the file that will contain your idea");
		name = uI.nextLine();
		name = name+".txt";
		createFile();
		tagFile();
		while(choice)
		{
			addIt();
		}
		 frame.setVisible(false);
	}

	private static void tagFile() throws IOException {
		Scanner file = new Scanner( new File( name ) );
	      // The name of the file to open.
	      String fileName = name;
	      
	     

	      try {
	          // Assume default encoding.
	          FileWriter fileWriter = new FileWriter(fileName, true);

	          // Always wrap FileWriter in BufferedWriter.
	          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	         
	          bufferedWriter.write(RunConsole.User.getrealName()+" "+RunConsole.User.getIdentifier());
	          bufferedWriter.newLine();
	          bufferedWriter.close();
	      }
	      catch(Exception e) 
	      	{
	          System.out.println("Error writing to file '" + fileName + "'");
	          // Or we could just do this:
	          // ex.printStackTrace();
	      	}
	}

	public static void addIt()  throws IOException
	{
		Scanner file = new Scanner( new File( name ) );
	      // The name of the file to open.
	      String fileName = name;
	      
	   
	      try {
	          // Assume default encoding.
	          FileWriter fileWriter = new FileWriter(fileName, true);

	          // Always wrap FileWriter in BufferedWriter.
	          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	          frame.setVisible(true);
	          info = JOptionPane.showInputDialog("What would you like to write in ticket called "+name); 
	          bufferedWriter.write(info);
	          bufferedWriter.newLine();
	          
	          Object[] options = {"Yes", "No"};
		  		int choice1 = JOptionPane.showOptionDialog( frame, "Would you like to add anything else to "+name+"?",
		  				"Anything Else",
		  				JOptionPane.YES_NO_CANCEL_OPTION,
		  				JOptionPane.QUESTION_MESSAGE,
		  				null, options, options[1]);
		  		
		  		switch(choice1)
		  		{
		  		case 0: choice = true;
		  		break;
		  		case 1: choice = false;
		  		break;
		  		}
		  		
		  		
		  		
		  		 bufferedWriter.close();
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
	      File myObj = new File(name);
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
