package workshopapp.domain;

public class Controller {
	
	private WorkshopList workshoplist;
	
	
	public Controller(){
		workshoplist=new WorkshopList();
	}
	
	public Workshop addWorkshop(String name,String date){
		Workshop workshop=new Workshop(name,date);
		workshoplist.addWorkshoptoList(workshop);
		return workshop;
		
	}
	
	public Workshop searchWorkshop(String name){
		return workshoplist.searchWorkshop(name);
	}
	
	public void registerParticipant(String name,String IcNo,Workshop workshop){
		Participant participant=new Participant(name,IcNo);
		workshop.addPartipantToThisWorkshop(participant);
	}
	
	public ParticipantList getParticipantList(Workshop workshop){
		return workshop.getParticipantList();
	}
	
	public Workshop getWorkshop(int i){
		return workshoplist.getSelectedWorkshop(i);
	}
	


}
