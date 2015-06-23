package card;

public abstract class general implements card{

		private String cardname;
		private String cardid;
		private int type;
		private int location;
		private String picture;
		private String file;
		private unitcard unit;
		private weathercard weath;
		private leadercard lead;
		private String faction;
		public general(){
			cardname="";
			cardid="";
			type=0;
			location=0;
			picture="";
			file="";
			unit=new unit();
			weath=new weather();
			lead=new leader();
			faction="";
		}
		public unitcard getunit(){
			return unit;
		}
		public void setunit(unitcard unit){
			this.unit.set_atk(unit.get_atk());
			this.unit.set_cardname(unit.get_cardname());
			this.unit.set_effect(unit.get_effect());
			this.unit.set_type(unit.get_type());
			this.unit.set_ishero(unit.get_ishero());
			this.unit.set_cardid(unit.get_cardid());
		}
		public weathercard getmag(){
			return weath;
		}
		public void setmag(weathercard weath){
			this.weath.set_cardname(weath.get_cardname());
			this.weath.set_effect(weath.get_effect());
			this.weath.set_cardid(weath.get_cardid());
		}
		public leadercard getlead(){
			return lead;
		}
		public void settrap(leadercard lead){
			this.lead.set_cardname(lead.get_cardname());
			this.lead.set_effect(lead.get_effect());
			this.lead.set_cardid(lead.get_cardid());
		}
		public int gettype() {
			return type;
		}
		public void settype(int type) {
			this.type = type;
		}
		public int getlocation(){
			return location;
		}
		public void setlocation(int location){
			this.location=location;
		}
		public String getpicture(){
			return picture;			
		}
		public void setpicture(String picture){
			this.picture=picture;
		}
		public String getfaction(){
			return faction;			
		}
		public void setfaction(String faction){
			this.faction=faction;
		}
		public String getcardname(){
			return cardname;			
		}
		public void setcardname(String cardname){
			this.cardname=cardname;
		}
		public String getcardid(){
			return picture;			
		}
		public void setcardid(String cardid){
			this.cardid=cardid;
		}
		public String getfile(){
			return file;
		}
		public void setfile(String file){
			this.file=file;
		}
	}