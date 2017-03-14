package workshopapp.domain;

import java.util.ArrayList;

public class WorkshopList {
	
	private ArrayList<Workshop> workshoplist;
	
	public WorkshopList(){
		workshoplist=new ArrayList<Workshop>();
	}
	
	public void addWorkshoptoList(Workshop workshop){	
			workshoplist.add(workshop);	
	}
	
	public Workshop searchWorkshop(String name){
		if(workshoplist.size()==0){
			return null;
		}else{
			Workshop workshop=null;
			boolean found=false;
			int i=0;
			while(i<workshoplist.size() && !found){
				
				if(workshoplist.get(i).getName().equals(name)){
					found=true;
					workshop=workshoplist.get(i);
				}
				else
					i++;	
			}
			if(found){
				return workshop;
			}		
		}
		
		
		return null;
	}
	
	public Workshop getSelectedWorkshop(int i){
		return workshoplist.get(i);
	}

}
