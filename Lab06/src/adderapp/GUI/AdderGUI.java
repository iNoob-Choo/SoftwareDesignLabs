package adderapp.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import adderapp.domain.Adder;
@SuppressWarnings("serial")
public class AdderGUI extends JFrame implements ActionListener {

	 // Application logic object
	 private Adder adder;
	
	 // GUI Components
	 private JLabel lblUserInput;
	 private JLabel lblTotal;
	 private JTextField tfdUserInput;
	 private JTextField tfdTotal;
	 private JButton btnAdd;
	 private JButton btnClear;
	
	 // Constructor
 protected AdderGUI() {
		 // Set up the Adder object
		 adder = new Adder();

		 // Set up the components
		 lblUserInput = new JLabel("Input");
		 lblTotal = new JLabel("Total");
		 tfdUserInput = new JTextField(5);
		 tfdTotal = new JTextField(10);
		 btnAdd = new JButton("Add");
		 btnClear = new JButton("Clear");

		 tfdTotal.setText("0");
		 tfdTotal.setEditable(false);

		 // Layout the components.
		 JPanel content = new JPanel();
		 GroupLayout layout = new GroupLayout(content);
		 content.setLayout(layout);
		 layout.setAutoCreateGaps(true);
		 layout.setAutoCreateContainerGaps(true);

		 // Make horizontal grouping.
		 layout.setHorizontalGroup(layout.createSequentialGroup()
		 .addGroup(layout.createParallelGroup(
			 GroupLayout.Alignment.LEADING) // left aligned
			 .addComponent(lblUserInput)
			 .addComponent(lblTotal)
		 )
		 .addGroup(layout.createParallelGroup(
			 GroupLayout.Alignment.LEADING) // left aligned
			
			 .addComponent(tfdUserInput, 50, 50, 50) // min, preferred, max
			 .addComponent(tfdTotal, 70, 70, 70) // min, preferred, max
			 )
		 .addGroup(layout.createParallelGroup(
			 GroupLayout.Alignment.LEADING) // left aligned
			 .addComponent(btnAdd)
			 .addComponent(btnClear)
		 )
		 );
		 // Make both buttons same size.
		 layout.linkSize(SwingConstants.HORIZONTAL, btnAdd, btnClear);
		 // Make vertical grouping.
		 layout.setVerticalGroup(layout.createSequentialGroup()
		 .addGroup(layout.createParallelGroup(
			 GroupLayout.Alignment.BASELINE) // bottom aligned
			 .addComponent(lblUserInput)
			 .addComponent(tfdUserInput)
			 .addComponent(btnAdd))
			 .addGroup(layout.createParallelGroup(
			 GroupLayout.Alignment.BASELINE) // bottom aligned
			 .addComponent(lblTotal)
			 .addComponent(tfdTotal)
			 .addComponent(btnClear))
		 );

		 // Add button listeners for button event handling.
		 btnAdd.addActionListener(this);
		 btnClear.addActionListener(this);

		 // Finalize layout and set window parameters.
		 this.setContentPane(content);
		 this.pack();
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setTitle("Simple Adder");
		 this.setResizable(false); // window not resizable
}//end constructor
 

 // Handle the button click events.
 public void actionPerformed(ActionEvent event) {

	 if (event.getSource() == btnAdd) {
		 // 'Add' button is clicked.
		 String userInput = "";
		 try {
		 userInput = tfdUserInput.getText();
		 adder.addToTotal(Integer.parseInt(userInput));
		 tfdTotal.setText(Integer.toString(adder.getTotal()));
	 } catch (NumberFormatException nfex) {
	 // Display error message in dialog window.
		 JOptionPane.showMessageDialog(this,
		 "Bad input: '" + userInput + "'");
	 }
	 } else {
		 // 'Clear' button is clicked.
		 adder.reset();
		 tfdUserInput.setText("");
		 tfdTotal.setText(Integer.toString(adder.getTotal()));
	 	}
}

	 public static void main(String[] args) {
		 EventQueue.invokeLater(new Runnable() {
			 public void run() {
				 		try {
				 			AdderGUI frame = new AdderGUI();
				 			frame.setVisible(true);
				 		} catch (Exception e) {
				 			e.printStackTrace();
				 		}
	}
	 });
}
}