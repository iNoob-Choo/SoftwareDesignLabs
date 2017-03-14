package workshopapp.GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import workshopapp.domain.*;


@SuppressWarnings("serial")
public class WorkshopAppGUI extends JFrame implements ActionListener {

	//Controller Object
	private Controller controller;
	
	//GUI Components
	//Labels
	private JLabel lblWorkshopname;
	private JLabel lblParticipantname;
	private JLabel lblWorkshopdate;
	private JLabel lblParticipantIC;
	private JLabel lblWorkshopSelected;
	private JLabel lblTheWorkshopSelected;
	
	//Text Fields for Workshop
	private JTextField txtWorkshopname;
	private JTextField txtWorkshopdate;
	
	//Text Fields for Participant
	private JTextField txtParticipantname;
	private JTextField txtParticipantIC;
	
	//Buttons
	private JButton btnRegisterParticipant;
	private JButton btnAddWorkshop;
	private JButton btnSearchWorkshop;
	private JButton btnSelectWorkshop;
	
	//Combo Box
	private JComboBox<String> WorkshopComboBox;
	
	public WorkshopAppGUI(){
		//Set up controller;
		controller=new Controller();
		
		//Set up the GUI
		lblWorkshopname=new JLabel("Workshop Name: ");
		lblWorkshopdate=new JLabel("Workshop Date: ");
		lblParticipantname=new JLabel("Participant Name: ");
		lblParticipantIC=new JLabel("Participant IC No : ");
		lblWorkshopSelected=new JLabel("Workshop Selected: ");
		
		txtWorkshopname=new JTextField(20);
		txtWorkshopdate=new JTextField(10);
		txtParticipantname=new JTextField(30);
		txtParticipantIC=new JTextField(15);
		
		btnRegisterParticipant=new JButton("Register Participant");
		btnAddWorkshop=new JButton("Add Workshop");
		btnSearchWorkshop=new JButton("Search Workshop");
		btnSelectWorkshop=new JButton("Select Workshop");
		
		WorkshopComboBox=new JComboBox<String>();
		
		//Layout of the components
		JPanel content=new JPanel();
		GroupLayout layout=new GroupLayout(content);
		
		content.setLayout(layout);
		
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		//horizontal grouping
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(
						GroupLayout.Alignment.LEADING)
				 .addComponent(lblWorkshopname)
				 .addComponent(lblWorkshopdate)
				 .addComponent(lblWorkshopSelected)
				 .addComponent(lblParticipantname)
				 .addComponent(lblParticipantIC)
						)//
			
				 .addGroup(layout.createParallelGroup(
				 GroupLayout.Alignment.LEADING)
				 .addComponent(txtWorkshopname, 200, 200, 200) // min, preferred, max 
				 .addComponent(txtWorkshopdate,200,200,200)
				 .addComponent(btnSearchWorkshop)
				 .addComponent(WorkshopComboBox)
				 .addComponent(txtParticipantname,200,200,200)
				 .addComponent(txtParticipantIC,200,200,200)
						 )//
				 .addGroup(layout.createParallelGroup(
				 GroupLayout.Alignment.LEADING)
				 .addComponent(btnAddWorkshop)
				 .addComponent(btnSelectWorkshop)
				 .addComponent(btnRegisterParticipant))
 
				 );
		
		// Make both buttons same size
		 layout.linkSize(SwingConstants.HORIZONTAL, btnAddWorkshop, btnSearchWorkshop
				 ,btnRegisterParticipant,btnSelectWorkshop); 
		 layout.linkSize(SwingConstants.HORIZONTAL, WorkshopComboBox,txtParticipantname); 
		
		// Make vertical grouping.
		 layout.setVerticalGroup(layout.createSequentialGroup()
		 .addGroup(layout.createParallelGroup(
		 GroupLayout.Alignment.BASELINE)
		 .addComponent(lblWorkshopname)
		 .addComponent(txtWorkshopname)
		 .addComponent(btnAddWorkshop)
		 ) //end of addgroup
		 .addGroup(layout.createParallelGroup(
		 GroupLayout.Alignment.BASELINE)
		 .addComponent(lblWorkshopdate)
		 .addComponent(txtWorkshopdate)
		
				 )//
		 .addComponent(btnSearchWorkshop)
		 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				 .addComponent(lblWorkshopSelected)
				 .addComponent(WorkshopComboBox)
				 .addComponent(btnSelectWorkshop)
				 )	 
		 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(lblParticipantname)
				.addComponent(txtParticipantname)	 
				 .addComponent(btnRegisterParticipant)
				 )//
		 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				 .addComponent(lblParticipantIC)
				 .addComponent(txtParticipantIC)	
				 )
				 
		 ); //end of set vertical
		 
		 
		// Add button listeners for button event handling.
		 btnAddWorkshop.addActionListener(this);
		 btnSearchWorkshop.addActionListener(this);
		 
		// Finalize layout and set window parameters.
		 this.setContentPane(content);
		 this.pack();
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setTitle("Workshop App");
		 this.setResizable(false); // window not resizable

		
		
	}//end of constructor
	

	@Override
	public void actionPerformed(ActionEvent event) {
		
		//Add workshop is clicked
		if(event.getSource()==btnAddWorkshop){
			
			String Workshopname=txtWorkshopname.getText();
			String Workshopdate=txtWorkshopdate.getText();
			if(Workshopname.equals("") && Workshopdate.equals("")){
				JOptionPane.showMessageDialog(this, "Please fill in the date / name of the"
						+ "workshop");
				
			}else{
				Workshop workshop=controller.addWorkshop(Workshopname, Workshopdate);
				JOptionPane.showMessageDialog(this, "Workshop Added");
				WorkshopComboBox.addItem(workshop.getName());
			}
			
			
		}else if (event.getSource()==btnSearchWorkshop){
			String WorkshopnametoSearch=txtWorkshopname.getText();
			if(WorkshopnametoSearch!=null){
			Workshop workshop=controller.searchWorkshop(WorkshopnametoSearch);
			
			if(workshop!=null){
				JOptionPane.showMessageDialog(this,"Workshop is on: "+workshop.getDate());
				lblTheWorkshopSelected.setText(workshop.getName());
			}else{
				JOptionPane.showMessageDialog(this,"Workshop doesnt exist yet");
			}
		  }//end of search if
		}else if(event.getSource()==btnSelectWorkshop){
			Workshop selectedWorkshop=(Workshop) WorkshopComboBox.getSelectedItem();
			String ParticipantName=txtParticipantname.getText();
			String ParticipantIC=txtParticipantIC.getText();
				
			if(selectedWorkshop!=null){
				if(ParticipantName.equals("") && ParticipantIC.equals("")){
					JOptionPane.showMessageDialog(this, "Please fill in the name / IC of the participant");
					
				}else{
					controller.registerParticipant(ParticipantName,ParticipantIC);
	
				}
			}else{
				JOptionPane.showMessageDialog(this,"Please Select a Workshop");
			}
		}
		
			
		
	}
	
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
			 public void run() {
			try {
			WorkshopAppGUI frame = new WorkshopAppGUI();
			frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//end of run
		});//end of eventqueue
	} 
	
	
		

}
