import java.util.Random;

public class Generate {
	
	public static String newIdentifier()
	{
		String done = "";
		for (int i = 0; i < 5; i++)
		{
			
			Random r = new Random();
			char c = (char)(r.nextInt(26) + 'A');
			
			String ch = String.valueOf(c);
			
			done = done.concat(ch);
		}
		
		return done;
	}

}
