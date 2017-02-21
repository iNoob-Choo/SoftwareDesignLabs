package studentapp.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import studentapp.domain.*;
@SuppressWarnings("serial")
public class StudentAppGUI extends JFrame implements ActionListener {
	// AppController object
	private AppController controller;

	 // GUI Components
	 private JLabel lblName;
	
	 private JTextField tfdName;
	
	 private JButton btnAdd;
	 private JButton btnSearch;

		 public StudentAppGUI() {
			 // Set up AppController object
			 controller = new AppController();
			 // Set up the components
			 lblName = new JLabel("Name");
		
			 tfdName = new JTextField();
		
			 btnAdd = new JButton("Add");
			 btnSearch = new JButton("Search");
			 // Layout the components.
			 JPanel content = new JPanel();
		
			 GroupLayout layout = new GroupLayout(content);
		
			 content.setLayout(layout);
		
			 layout.setAutoCreateGaps(true);
			 layout.setAutoCreateContainerGaps(true);
		
		 // Make horizontal grouping.
		 layout.setHorizontalGroup(layout.createSequentialGroup()
			 .addComponent(lblName)
			 .addComponent(tfdName, 200, 200, 200) // min, preferred, max
			 .addGroup(layout.createParallelGroup(
			 GroupLayout.Alignment.LEADING)
			 .addComponent(btnAdd)
			.addComponent(btnSearch))
		 );
		 // Make both buttons same size
		 layout.linkSize(SwingConstants.HORIZONTAL, btnAdd, btnSearch);

		 // Make vertical grouping.
		 layout.setVerticalGroup(layout.createSequentialGroup()
			 .addGroup(layout.createParallelGroup(
			 GroupLayout.Alignment.BASELINE)
			 .addComponent(lblName)
			 .addComponent(tfdName)
			 .addComponent(btnAdd)
				 )
			 .addComponent(btnSearch)
		  );
	
		 // Add button listeners for button event handling.
		 btnAdd.addActionListener(this);
		 btnSearch.addActionListener(this);
	
		 // Finalize layout and set window parameters.
		 this.setContentPane(content);
		 this.pack();
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setTitle("Student App");
		 this.setResizable(false); // window not resizable

	}//end constructor

 // Handle the button click events.
 public void actionPerformed(ActionEvent event) {

	 if (event.getSource() == btnAdd) {
	 // 'Add' button is clicked.
	 String nameToAdd = tfdName.getText();
	 controller.addStudent(nameToAdd);
	 } else {
			 // 'Search' button is clicked.
			 String nameToSearch = tfdName.getText();
			 Student student = controller.searchStudent(nameToSearch);
			 // Display search result in dialog window
			 if (student != null) {
			 JOptionPane.showMessageDialog(this,
			 "Student is in the list");
			 } else {
		 JOptionPane.showMessageDialog(this,
		 "Student is not in the list");
		 }
	 }
 }

 public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	 public void run() {
		 try {
			 StudentAppGUI frame = new StudentAppGUI();
			 frame.setVisible(true);
		 } catch (Exception e) {
			 		e.printStackTrace();
		 		}
	 	}
	});
 }
}
