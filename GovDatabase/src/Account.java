

public class Account {
	
	  String username;
	  String realName;
	  String password;
	  String identifier;
	  
	 
	  

	public Account(String u, String rN, String p, String i)
	    {
	    username = u;
	    realName = rN;
	    password = p;
	    identifier = i;
	    }

	  public String getusername()
		{
			return username;
		}

	public void setusername(String username)
		{
			this.username = username;
		}

	public String getrealName()
		{
			return realName;
		}

	public void setrealName(String realName)
		{
			this.realName = realName;
		}

	public String getpassword()
		{
			return password;
		}

	public void setpassword(String password)
		{
			this.password = password;
		}
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	
}
