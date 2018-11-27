package DemoMonopoly;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import codeNguoiChoi.Player;

public class LoginForm extends JFrame implements ActionListener {

	JPanel mainPane = new JPanel();
	JPanel northPane = new JPanel();
	JPanel southPane = new JPanel();
	JPanel westPane = new JPanel();
	JPanel centerPane = new JPanel();

	JLabel northLabel = new JLabel("Login");

	JButton loginButton = new JButton("Login");
	JButton exitButton = new JButton("Exit");

	JLabel userLabel = new JLabel("User name");
	JLabel passLabel = new JLabel("Password");
	JTextField usertext = new JTextField(15);
	JPasswordField passtext = new JPasswordField(15);

	ImageIcon image = new ImageIcon(PristineInterface.class.getResource("/Image/keylogin.png"));
	ImageIcon imagelogin = new ImageIcon(PristineInterface.class.getResource("/Image/login.png"));
	ImageIcon imageexit = new ImageIcon(PristineInterface.class.getResource("/Image/exit.png"));
	JLabel imagelabel = new JLabel();
	JLabel labellogin = new JLabel();
	JLabel labelexit = new JLabel();
	WriteReadPlayer record = new WriteReadPlayer();
	PristineInterface pi = new PristineInterface();
	mainBoard mb = new mainBoard();
	public static String name;
	public static int songuoichoi;

	public LoginForm() {

		mainPane.setLayout(new BorderLayout());

		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setTitle("Login ");
		northLabel.setForeground(Color.BLUE);
		northLabel.setFont(new Font("artial", Font.BOLD, 20));
		Border linenorth = BorderFactory.createLineBorder(Color.GREEN);
		//
		northPane.setBorder(new TitledBorder(linenorth, ""));
		northPane.add(northLabel);
		mainPane.add(northPane, BorderLayout.NORTH);

		// west
		Border westline = BorderFactory.createLineBorder(Color.GREEN);
		westPane.setBorder(new TitledBorder(westline));

		imagelabel.setIcon(image);
		imagelabel.setOpaque(true);
		westPane.add(imagelabel);
		mainPane.add(westPane, BorderLayout.WEST);

		// south
		loginButton.setIcon(imagelogin);
		exitButton.setIcon(imageexit);
		southPane.setLayout(new FlowLayout());
		southPane.add(loginButton);
		southPane.add(exitButton);
		mainPane.add(southPane, BorderLayout.SOUTH);
		// center

		centerPane.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		centerPane.add(userLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		centerPane.add(usertext, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		centerPane.add(passLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		centerPane.add(passtext, gbc);
		Border centerline = BorderFactory.createLineBorder(Color.GREEN);
		centerPane.setBorder(new TitledBorder(centerline));
		mainPane.add(centerPane, BorderLayout.CENTER);
		this.getContentPane().add(mainPane);
		// dang nhap
		loginButton.addActionListener(this);
		exitButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source.equals(exitButton)) {
			System.exit(0);
		} else if (source.equals(loginButton)) {
			String userText = usertext.getText();
			char[] def = passtext.getPassword();
			char[] correctpass = { '1' };//
			if (userText.equalsIgnoreCase("a") && Arrays.equals(def, correctpass)) { //
				int confirm = JOptionPane.showConfirmDialog(null, "Access complete", "Congrats",
						JOptionPane.YES_OPTION);
				usertext.setText("");
				passtext.setText("");
				if (confirm == JOptionPane.YES_OPTION) {
					// DangNhap dn = new DangNhap();
					this.setVisible(false);
					int g = 1;
					do {
						try {
							String songuoi = JOptionPane.showInputDialog(null, "Input number of Players (2->4):",
									"Number of PLayers", JOptionPane.OK_CANCEL_OPTION);
							songuoichoi = Integer.parseInt(songuoi);
							if (songuoichoi < 2 || songuoichoi > 4) {
								songuoi = JOptionPane.showInputDialog("Enter number of players again", "(2->4)");
							} else if (songuoichoi >= 2 && songuoichoi <= 4) {
								if (songuoi.equals(JOptionPane.CANCEL_OPTION)) {
									JOptionPane.showConfirmDialog(null, "Login again!");
								} else {
									for (int i = 0; i < songuoichoi; i++) {
										name = JOptionPane.showInputDialog(null, "Name of Player " + (i + 1),
												"Information", JOptionPane.OK_OPTION);
										record.ghithongtin();

									}
									// Try to check the name inputted with privious name ....are you the
									// same....you're replaced.

//								for (int h = 0; h < ghi.data.size(); h++) {
//									for (int j = 0; j < ghi.data.size(); j++) {
//										if (ghi.data.get(h).getName() == ghi.data.get(j).getName()) {
//											String changeName = JOptionPane.showInputDialog(null,
//													"Player"+(h+1)+" and Player "+(j+1)+" has same name. Enter another name: ", "Comfirm",
//													JOptionPane.OK_OPTION);
//											changeName = ghi.data.get(h).getName();
//											ghi.data.get(h).setName(ghi.data.get(j).getName());
//											ghi.data.get(j).setName(changeName);
//										}
//									}
//								}
									g += 2;
									pi.setVisible(false);
									mb.setVisible(true);
								}
							}

						} catch (NumberFormatException ex) {
							JOptionPane.showConfirmDialog(null, "Input a number, Please! \nLogin again!");
						}
					} while (g <= 1);

				} else {
					int a = JOptionPane.showConfirmDialog(null, "Are you sure that you want to exit.");
					if (a == JOptionPane.YES_OPTION) {
						System.exit(0);
					}

				}
			} else {
				JOptionPane.showMessageDialog(null, "Wrong user name or password!", "Warming",
						JOptionPane.INFORMATION_MESSAGE);
				usertext.setText("");
				passtext.setText("");
			}
		}
		
		
		
		
	}

}
