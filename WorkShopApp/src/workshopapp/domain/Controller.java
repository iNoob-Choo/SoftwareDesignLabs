package workshopapp.domain;

public class Controller {
	
	private WorkshopList workshoplist;
	private ParticipantList participantlist;
	
	public Controller(){
		workshoplist=new WorkshopList();
		participantlist=new ParticipantList();
	}
	
	public void addWorkshop(String name,String date){
		Workshop workshop=new Workshop(name,date);
		workshoplist.addWorkshoptoList(workshop);
		
	}
	
	public Workshop searchWorkshop(String name){
		return workshoplist.searchWorkshop(name);
	}
	
	public void registerParticipant(String name,String IcNo){
		Participant participant=new Participant(name,IcNo);
		participantlist.addParticipanttoList(participant);
	}
	
	


}
