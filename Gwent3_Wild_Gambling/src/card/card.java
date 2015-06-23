package card;

public interface card extends Comparable<card> {

	public String getname();
	public void setname(String name);
	public int gettype();
	public void settype(int type);
	public int getlocation();
	public void setlocation(int location);
	public String getpicture();
	public void setpicture(String picture);
	public String getfile();
	public void setfile(String file);
	public String getcardid();
	public void setcardid(String cardid);
	public String getcardname();
	public void setcardname(String cardname);
	public unitcard getunit();
	public weathercard getweath();
	public leadercard getlead();
	public void setunit(unitcard unit);
	public void setfaction(String faction);
	public String getfaction();
	public void setweath(weathercard weath);
	public void setlead(leadercard lead);
}