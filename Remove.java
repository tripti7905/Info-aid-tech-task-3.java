import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Remove extends JFrame implements ActionListener {
	JLabel title, label, namel, rollnol;

	JTextField name, rollno, display;
	JButton remove;

	public Remove() {

		setTitle("REMOVE STUDENT INFO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLayout(null);

		title = new JLabel("REMOVE A STUDENT INFO");
		title.setBounds(80, 30, 500, 30);
		title.setForeground(Color.RED);
		title.setFont(new Font(Font.SERIF, Font.BOLD, 28));
		title.setOpaque(true);
		add(title);

		namel = new JLabel("Enter the name :");
		namel.setBounds(100, 150, 100, 20);
		add(namel);

		name = new JTextField();
		name.setBounds(220, 150, 150, 20);
		add(name);

		label = new JLabel("OR");
		label.setBounds(170, 190, 40, 20);
		add(label);

		rollnol = new JLabel("Enter the roll no. :");
		rollnol.setBounds(100, 220, 100, 20);
		add(rollnol);

		rollno = new JTextField();
		rollno.setBounds(220, 220, 150, 20);
		add(rollno);

		display = new JTextField();
		display.setBounds(50, 290, 350, 90);
		add(display);

		remove = new JButton("REMOVE");
		remove.setBounds(150, 250, 80, 20);
		add(remove);

		remove.addActionListener(this);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {
		String rollNumber = rollno.getText();
		String Name = name.getText();
		String path = "C:\\Users\\Shubhi\\OneDrive\\Desktop\\student mgs\\";
		File f = new File(path + rollNumber + ".txt");

		if (ae.getSource() == remove) {
			try {
				f.delete();
				display.setText("Student record is deleted successfully.");
			} catch (Exception e) {
				display.setText(e.getMessage());
			}
		}
	}
}
