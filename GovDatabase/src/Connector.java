import java.util.*;
public class Connector {
	
	static Scanner uI = new Scanner (System.in);
	
	public static void mainMenu1()
	{
		
		System.out.println("Please enter your identifier below");
		String ans = uI.nextLine();
		System.out.println();
		identifierProtocol(ans);
	}
	
	public static void identifierProtocol (String ide)
	{
		if (ide.equals(RunConsole.User.getIdentifier()))
		{
			System.out.println("Welcome Speaker "+ RunConsole.User.getrealName());
			SpeakerOfTheHouse.bangGavel();
			System.out.println();
			//mainMenu1();
		}
	}

}
