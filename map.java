import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class map extends JFrame{
	JPanel jp = new JPanel();
	JLabel lb = new JLabel();
	
	Color myPink = new Color(243,0,253);
	Color myOrange = new Color(232,114,0);
	Color myBlueLight = new Color(137,211,255);
	Color myBrown = new Color(126,82,1);
	Color myBlue = new Color(4,0,193);
	Color myGreen = new Color(18,152,0);
	
	BufferedImage img;
	public map(){
		setTitle("Monopoly");
		setVisible(true);
		setSize(960,986);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lb.setIcon(new ImageIcon("/home/necopotts/workspace/Monopoly/jail.png"));
		validate();
		jp.add(lb);
		jp.setBounds(50,50, 50, 50);
		add(jp);
	}
	public void paint(Graphics g){
		// North Rectangles
		g.drawRect(128 , 120, 78, 30);
		g.drawRect(284 , 120, 78, 30);
		g.drawRect(518 , 120, 78, 30);
		g.drawRect(674 , 120, 78, 30);
		g.drawRect(752 , 120, 78, 30);
		
		g.setColor(myBrown);
		g.fillRect(128, 120, 78, 30);
		g.fillRect(284, 120, 78, 30);
		g.setColor(myBlueLight);
		g.fillRect(518, 120, 78, 30);
		g.fillRect(674, 120, 78, 30);
		g.fillRect(752, 120, 78, 30);
		g.setColor(Color.black);
		
		for(int i = 0; i < 9 ; i++){
			g.drawRect(128+(78*i), 0, 78, 150);
		}
		g.drawRect(830, 0, 129, 150);
		
//		g.drawRect(0, 150, 128, 78);
		//West Rectangles
		g.drawRect(98, 150, 30, 78);
		g.drawRect(98, 306, 30, 78);
		g.drawRect(98, 540, 30, 78);
		g.drawRect(98, 696, 30, 78);
		g.drawRect(98, 774, 30, 78);
		
		g.setColor(myBlue);
		g.fillRect(98, 150, 30, 78);
		g.fillRect(98, 306, 30, 78);
		g.setColor(myGreen);
		g.fillRect(98, 540, 30, 78);
		g.fillRect(98, 696, 30, 78);
		g.fillRect(98, 774, 30, 78);
		g.setColor(Color.black);
		//
		for(int i = 0; i < 9; i++){
			g.drawRect(0, 150 + (78*i), 128, 78);
		}
		g.drawRect(0, 852, 128,134);
		
		
		//South Rectangles
		g.drawRect(128, 852, 78, 30);
		g.drawRect(284, 852, 78, 30);
		g.drawRect(362, 852, 78, 30);
		g.drawRect(518, 852, 78, 30);
		g.drawRect(596, 852, 78, 30);
		g.drawRect(752, 852, 78, 30);
		
		g.setColor(Color.yellow);
		g.fillRect(128, 852, 78, 30);
		g.fillRect(284, 852, 78, 30);
		g.fillRect(362, 852, 78, 30);
		g.setColor(Color.red);
		g.fillRect(518, 852, 78, 30);
		g.fillRect(596, 852, 78, 30);
		g.fillRect(752, 852, 78, 30);
		g.setColor(Color.black);
		
		for(int i = 0; i < 9; i++){
			g.drawRect(128+(78*i),852,78,134);
		}
		g.drawRect(830,852,129,134);
		
		//East Rectangles
		g.drawRect(830,150,30,78);
		g.drawRect(830,306,30,78);
		g.drawRect(830,384,30,78);
		g.drawRect(830,540,30,78);
		g.drawRect(830,696,30,78);
		g.drawRect(830,774,30,78);
		
		g.setColor(myPink);
		g.fillRect(830, 150, 30, 78);
		g.fillRect(830, 306, 30, 78);
		g.fillRect(830, 384, 30, 78);
		g.setColor(myOrange);
		g.fillRect(830, 540, 30, 78);
		g.fillRect(830, 696, 30, 78);
		g.fillRect(830, 774, 30, 78);
		g.setColor(Color.black);
		
		for(int i = 0 ; i < 9; i++){
			g.drawRect(830,150+(78*i),129,78);
		}
//		g.drawRect(128+78, 0, 78, 150);
//		g.fillRect(128, 0, 79, arg3)
	}
	
	public static void main(String[] args){
		new map();
		
	}
	
}
