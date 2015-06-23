package card;

public class unit implements unitcard{

		private String cardname;
		private int type;
		private int atk;
		private int effect;
		private boolean is_hero;
		private String cardid;
		public unit()
		{
			cardname="";
			type=0;
			atk=0;
			effect=0;
			is_hero=false;
			cardid="";
		}
		public int get_effect(){
			return effect;
		}
		public void set_effect(int effect){
			this.effect=effect;
		}
		public String get_cardname(){
			return cardname;
		}
		public void set_cardname(String cardname){
			this.cardname=cardname;
		}
		public String get_cardid(){
			return cardid;
		}
		public void set_cardid(String cardid){
			this.cardid=cardid;
		}
		public int get_type() {
			return type;
		}
		public void set_type(int type) {
			this.type = type;
		}
		public int get_atk(){
			return atk;
		}
		public void set_atk(int atk){
			this.atk=atk;
		}
		public void set_ishero(boolean is_hero){
			this.is_hero=is_hero;
		}
		public boolean get_ishero(){
			return is_hero;
		}
		public int compareTo(unitcard arg0) {
			// TODO Auto-generated method stub
			return 0;
		}		
	}