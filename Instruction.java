package DemoMonopoly;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Instruction extends JFrame {
	private static final String RULE = "C:\\Users\\USER\\Desktop\\Rule.txt";
	private JTextArea textArea = new JTextArea(7,14);
	JScrollPane scrollpane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	public Instruction() {
		this.setTitle("Instruction: Some rules to play Monopoly");
		this.setSize(900, 650);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		textArea.setFont(new Font("Tahoma", Font.BOLD, 17));
		this.setLayout(new BorderLayout());
		this.getContentPane().add(scrollpane, BorderLayout.CENTER);
		readRule();
	}

	@SuppressWarnings("unchecked")
	public void readRule() {
		try {
			FileReader reader = new FileReader("C:\\Users\\USER\\Desktop\\Rule.txt");
			BufferedReader br = new BufferedReader(reader);
			textArea.read(br, null);
			br.close();
			textArea.requestFocus();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Loi o instruction");
			JOptionPane.showMessageDialog(null, e, "Error ", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			System.out.println("Loi o instruction");
			JOptionPane.showMessageDialog(null, e, "Error ", JOptionPane.ERROR_MESSAGE);
		}
	}
}
