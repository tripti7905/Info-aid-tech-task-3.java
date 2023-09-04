import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Create extends JFrame implements ActionListener {

	JTextField name, rollno, phoneno, address, display;
	JLabel title, namel, rollnol, phonenol, addressl;
	JButton create1;

	public Create() {

		setTitle("ADDING STUDENT INFO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
		setLayout(null);

		title = new JLabel("ADDING A NEW STUDENT");
		title.setBounds(80, 30, 500, 30);
		title.setForeground(Color.BLUE);
		title.setFont(new Font(Font.SERIF, Font.BOLD, 28));
		title.setOpaque(true);
		add(title);

		namel = new JLabel(" NAME     :");
		namel.setBounds(100, 150, 100, 20);
		add(namel);

		name = new JTextField();
		name.setBounds(220, 150, 150, 20);
		add(name);

		rollnol = new JLabel(" ROLL NO  :");
		rollnol.setBounds(100, 200, 100, 20);
		add(rollnol);

		rollno = new JTextField();
		rollno.setBounds(220, 200, 150, 20);
		add(rollno);

		phonenol = new JLabel("PHONE NO.  :");
		phonenol.setBounds(100, 250, 100, 25);
		add(phonenol);

		phoneno = new JTextField();
		phoneno.setBounds(220, 250, 150, 20);
		add(phoneno);

		addressl = new JLabel("ADDRESS    :");
		addressl.setBounds(100, 300, 80, 20);
		add(addressl);

		address = new JTextField();
		address.setBounds(220, 300, 150, 20);
		add(address);

		display = new JTextField();
		display.setBounds(50, 380, 400, 40);
		add(display);

		create1 = new JButton("ADD");
		create1.setBounds(180, 350, 60, 25);
		add(create1);

		create1.addActionListener(this);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {

		String rollNumber = rollno.getText();
		String Name = name.getText();
		String Address = address.getText();
		String phone = phoneno.getText();
		String path = "C:\\Users\\Shubhi\\OneDrive\\Desktop\\student mgs\\";
		File f = new File(path + rollNumber + ".txt");

		if (ae.getSource() == create1) {
			try {
				f.createNewFile();
				f.setWritable(true);
				display.setText("Student record is stored successfully.");

				FileOutputStream fout = new FileOutputStream(f);

				fout.write(("Name : " + Name).getBytes());
				fout.write(("\nRoll Number : " + rollNumber).getBytes());
				fout.write(("\nPhone Number : " + phone).getBytes());
				fout.write(("\nAddress : " + Address).getBytes());
				fout.close();

			} catch (Exception e) {
				display.setText(e.getMessage());

			}

		}

	}
}
