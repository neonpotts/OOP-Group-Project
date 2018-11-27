package DemoMonopoly;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainBoard extends JFrame {
	JLabel labelMain = new JLabel();
	
	public mainBoard() {
		this.setLocation(0, 0);
		this.setTitle("Monopoly Game");
		this.setResizable(false);
		this.setSize(1990, 1100);
		getContentPane().setLayout(null);
		giaodien();
	}
	public void giaodien() {
		labelMain.setBounds(0, 0, 1990, 1100);
		labelMain.setIcon(new ImageIcon(mainBoard.class.getResource("/Image/abcd.png")));
		getContentPane().add(labelMain);	
	}
}
