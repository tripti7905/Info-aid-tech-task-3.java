import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRecords {
	public static void main(String [] args) {
		
		Record obj = new Record();
	}
}

class Record extends JFrame implements ActionListener {
	
	JLabel title, name, rollno, address, phoneno;
	JButton create, remove, display;
	
	public Record () {
		setTitle("STUDENT RECORD MANAGER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setLayout(null);
		
		title = new JLabel("STUDENT RECORD MANAGER ");
		title.setBounds(30,30,500,30);
		title.setForeground(Color.RED);
		title.setFont(new Font(Font.SERIF,Font.BOLD,28));
		title.setOpaque(true);
		add(title);

		
		create = new JButton("ADD A STUDENT ");
		create.setBounds(130,100,200,30);
		add(create);
		create.addActionListener(this);
		
		remove = new JButton("REMOVE A STUDENT ");
		remove.setBounds(130,160,200,30);
		add(remove);
		remove.addActionListener(this);
		
		display = new JButton("DISPLAY STUDENT INFO");
		display.setBounds(130,220,200,30);
		add(display);
		display.addActionListener(this);
	
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == create) {
			Create c = new Create();
			
		}
		else if(ae.getSource() == remove) {
			Remove r = new Remove();
		}
		else if(ae.getSource()== display){
			Display d = new Display();
			
		}
	}
}
