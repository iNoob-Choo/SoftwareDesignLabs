package workshopapp.domain;

public class Workshop {
	
	private String name;
	private String date;
	private ParticipantList participantlist=new ParticipantList();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Workshop(String name,String date){
		this.name=name;
		this.date=date;
	}
	
	public void addPartipantToThisWorkshop(Participant participant){
		participantlist.addParticipanttoList(participant);
	}
	
	public ParticipantList getParticipantList(){
		return this.participantlist;
	}

}
