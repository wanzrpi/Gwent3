package card;

public interface unitcard extends Comparable<unitcard> {
	public int get_type();
	public void set_type(int typt);
	public int get_atk();
	public void set_atk(int atk);
	public int get_effect();
	public void set_effect(int effect);
	public String get_cardname();
	public void set_cardname(String cardname);
	public boolean get_ishero();
	public void set_ishero(boolean is_hero);
	public String get_cardid();
	public void set_cardid(String cardid);
}