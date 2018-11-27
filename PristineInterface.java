package DemoMonopoly;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

@SuppressWarnings("serial")
public class PristineInterface extends JFrame implements ActionListener {

	private JPanel contentPane;

	
	JDesktopPane desPane = new JDesktopPane();
	JMenuBar menuBar = new JMenuBar();
	JMenu menuFile = new JMenu("File");
	JMenu menuHelp = new JMenu("Help");
	JMenuItem itemNew = new JMenuItem("New", 'N');
	JMenuItem itemExit = new JMenuItem("Exit", 'E');
	JMenuItem itemHelp = new JMenuItem("Help");

	JLabel backGround = new JLabel();
	JButton newGame = new JButton("New Game");
	JButton instruction = new JButton("Instruction");

	JLabel desLabel = new JLabel();
	JLabel lblNewLabel = new JLabel("WELCOME TO MONOPOLY");

	@SuppressWarnings("unchecked")
	public PristineInterface() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Monopoly");
		this.setSize(1990, 1100);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		menuFile.add(itemNew);
		menuFile.addSeparator();
		menuFile.add(itemExit);
		menuHelp.add(itemHelp);
		menuBar.add(menuFile);
		menuBar.add(menuHelp);
		this.setJMenuBar(menuBar);
		this.getContentPane().setLayout(null);
		newGame.setBackground(new Color(127, 255, 0));
		newGame.setIcon(new ImageIcon(PristineInterface.class.getResource("/Image/play1.png")));
		newGame.setBounds(1204, 667, 240, 67);
		this.getContentPane().add(newGame);
		instruction.setBackground(new Color(127, 255, 0));
		instruction.setIcon(new ImageIcon(PristineInterface.class.getResource("/Image/instruction1.png")));

		instruction.setBounds(1204, 746, 240, 67);
		this.getContentPane().add(instruction);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 52));
		lblNewLabel.setBounds(946, 471, 750, 128);

		this.getContentPane().add(lblNewLabel);
		backGround.setIcon(new ImageIcon(PristineInterface.class.getResource("/Image/sellBuying.png")));
		backGround.setBounds(0, 0, 1934, 1040);

		this.getContentPane().add(backGround);
		newGame.addActionListener(this);
		instruction.addActionListener(this);
		itemNew.addActionListener(this);
		itemExit.addActionListener(this);
		itemHelp.addActionListener(this);
	}

	public static void main(String[] args) {
		PristineInterface frame = new PristineInterface();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Instruction instruct = new Instruction();
		Object source = e.getSource();
		if(source.equals(instruction) || source.equals(itemHelp)) {
			instruct.setVisible(true);
		}
		if(source.equals(newGame) || source.equals(itemNew)) {
			LoginForm dn = new LoginForm();//////**
			dn.setVisible(true);
		}
	}
}
