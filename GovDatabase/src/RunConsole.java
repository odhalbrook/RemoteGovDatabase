import java.io.File;
import java.io.IOException;
import java.security.*;
import javax.crypto.*;



import java.util.*;
public class RunConsole {

	static Scanner userinput = new Scanner (System.in);
	static String ident;
	public static Account User = null;
	public static boolean loginSuccess = false;
	public static ArrayList<Account> AccountList = new ArrayList<Account>();
	public static void main(String args[]) throws Exception{
	     
		
		greetUser();
		AccountWorker.fill();
		idCheck();
		mainMenu();
	    
		
	   }

	
	private static void mainMenu() throws IOException{
		
		
		System.out.println("1. Access my Job");
		System.out.println("2. Create File with an Idea for something new");
		System.out.println("3. Exit");
		 Scanner userinput1 = new Scanner (System.in);
		int answer = userinput.nextInt();
		switch(answer) {
		case 1: 
			Connector.mainMenu1();

				mainMenu();
		break;
		case 2:
			
			TicketMaker.newIdea();

				mainMenu();
		break;
		case 3: AccountWorker.writeAccount();
		break;
		}
		
		
	}
	
	

	private static void idCheck() throws IOException {
		
		
		User = null;
		if(AccountList.isEmpty())
		{
			System.out.println("It looks like there are no accounts to choose from, please create a new account");
			System.out.println("What is your full name?");
			String name = userinput.nextLine();
			System.out.println("Please enter a username");
			String username = userinput.nextLine();
			System.out.println("Please create a password (Must include at least 1 Lowercase letter, 1 Uppercase letter, and 1 number)(No special characters and a max of 12 characters)");
			String password = userinput.nextLine();
			System.out.println("You will be assigned a secret identifier that will only be shown to you once, so listen closely");
			System.out.println();
			String identifier = Generate.newIdentifier();
			
			
			AccountList.add(new Account (username, name, password, identifier));
			//User = AccountList.get(0);
			System.out.println("------------------------");
			System.out.println("Account Creation Success");
			System.out.println("------------------------");
			
		}
		
		
		
		System.out.println("Please enter your username or type 'new' to create a new account");
		
		String Username = userinput.nextLine();
		
		if(Username.equals("new") || Username.equals("New")) 
		{
			System.out.println("What is your full name?");
			String name = userinput.nextLine();
			System.out.println("Please enter a username");
			String username1 = userinput.nextLine();
			System.out.println("Please create a password (Must include at least 1 Lowercase letter, 1 Uppercase letter, and 1 number)(No special characters and a max of 12 characters)");
			String password = userinput.nextLine();
			System.out.println("You will be assigned a secret identifier that will only be shown to you once, so listen closely");
			System.out.println();
			String identifier = Generate.newIdentifier();
			
			
			AccountList.add(new Account (username1, name, password, identifier));
			//User = AccountList.get(0);
			System.out.println("------------------------");
			System.out.println("Account Creation Success");
			System.out.println("------------------------");
			Username = username1;
			
		}
		
		for(int i = 0; i < AccountList.size(); i++)
		{
			if(AccountList.get(i).getusername().equals(Username))
			{
				User = AccountList.get(i);
			}
			
		}
		
		if(User == null)
		{
			System.out.println("Sorry, you entered an invalid Username");
			System.out.println("If you want to try logging in again, enter Y, if you would not like to try and login in again, press enter");
			String yn = userinput.nextLine();
			
			if(yn.equals("Y") || yn.equals("y"))
			{
				
				idCheck();
			}
			else
			{
				System.exit(0);
			}
		}
		
		System.out.println("Hello " + User.getrealName() + ", please enter your password.");
		String password = userinput.nextLine();
		password = password.trim();
		if(password.equals(User.getpassword()))
		{
			System.out.println("Welcome "+ User.getrealName());
			System.out.println("");
			System.out.println("Redirecting you to your account");
			try{Thread.sleep(1000);}
			catch(Exception e){}
			
			System.out.println(".");
			
			try{Thread.sleep(1000);}
			catch(Exception e){}
				
			System.out.println(".");
			
			try{Thread.sleep(1000);}
			catch(Exception e){}
			
			System.out.println(".");
			
			try{Thread.sleep(1000);}
			catch(Exception e){}
			loginSuccess = true;
		}
		
		else 
		{
			System.out.println("That was an incorrect password...");
			System.out.println("If you want to try logging in again, enter Y, if you would not like to try and login in again, press enter");
			String yn = userinput.nextLine();
			
			if(yn.equals("Y") || yn.equals("y"))
			{
				User = null;
				idCheck();
			}
			else
			{
				System.exit(0);
			}
		}
	}

	private static void greetUser() {
		System.out.println("Hello and welcome to the PDV (Personal Data Vault) / Responsibility Reminder / New Idea Creator");
		//System.out.println("Please enter your identifier along with your date of birth and your mother's maiden name, all seperated by a period with no spaces and all lowercase.");
		
	}
	

}
