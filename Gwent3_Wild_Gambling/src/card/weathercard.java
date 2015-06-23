package card;

public interface weathercard extends Comparable<weathercard> {
	public int get_effect();
	public void set_effect(int effect);
	public String get_cardname();
	public void set_cardname(String cardname);
	public String get_cardid();
	public void set_cardid(String cardid);
}