package DemoMonopoly;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import codeNguoiChoi.Player;

public class WriteReadPlayer {
	protected static ArrayList<Player> data = new ArrayList<Player>();
	private static final String THONG_TIN = "C:\\Users\\USER\\Desktop\\ThongTinNguoiChoi.txt";
	Player ngChoi = new Player();
	LoginForm dn;
	public WriteReadPlayer() {
	}
	@SuppressWarnings("static-access")
	public void ghithongtin() {
		for(int i= 0; i < dn.songuoichoi; i++) {
			ngChoi.setName(dn.name);
			data.add(ngChoi);
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(THONG_TIN);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(data);
				fos.close();
				oos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	@SuppressWarnings("unchecked")
	public void docthongtin() {
		FileInputStream fis;
		try {
			fis = new FileInputStream(THONG_TIN);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Player> data1 = (List<Player>) ois.readObject();
			data = new ArrayList<Player>(data1.size());
			data.addAll(data1);
			
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.getMessage();
		}
		
	}
	public void thayTheTen() {
		for(int i=0; i < data.size(); i++) {
			for(int j = 0; j <data.size(); j++) {
				if(data.get(i).getName()==data.get(j).getName()) {
					String changeName = JOptionPane.showInputDialog(null, "The same name. Enter anather name: ","Comfirm", JOptionPane.OK_OPTION);
					changeName = dn.name;
					dn.name = data.get(j).getName();
					changeName = data.get(j).getName();
			}
			}
		}
	}
}
