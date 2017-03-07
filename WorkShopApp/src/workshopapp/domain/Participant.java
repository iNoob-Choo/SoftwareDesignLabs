package workshopapp.domain;

public class Participant {

	private String name;
	private String ICNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getICNo() {
		return ICNo;
	}
	public void setICNo(String iCNo) {
		ICNo = iCNo;
	}
	
	public Participant(String name,String ICNo){
		this.name=name;
		this.ICNo=ICNo;
	}
	
}
