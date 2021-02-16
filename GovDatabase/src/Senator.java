
public abstract class Senator extends PublicOffcial{
	
	protected int numTermsServed;

	public final int getNumOfTermsServed()
	{
		return numTermsServed;
	}
	public void makeSureISaidIt()
	{
		super.sayMyProfession();
	}
}
