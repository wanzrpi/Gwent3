package card;

public class leader implements leadercard{

		private String cardname;
		private int effect;
		private String cardid;
		public leader()
		{
			cardname="";
			effect=0;
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
		public int compareTo(leadercard arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
	}