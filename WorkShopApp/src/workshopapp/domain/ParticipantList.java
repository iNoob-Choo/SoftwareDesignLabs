package workshopapp.domain;

import java.util.ArrayList;

public class ParticipantList {
	
	private ArrayList<Participant> participantlist;
	
	public ParticipantList(){
		participantlist=new ArrayList<Participant>();
	}
	
	public void addParticipanttoList(Participant participant){
		participantlist.add(participant);
		
	}
	
	public int getParticipantListSize(){
		int size=participantlist.size();
		return size;
	}
	
	public Participant getParticipant(int i){
		Participant participant=participantlist.get(i);
		return participant;
	}
	
}
