import java.util.ArrayList;


public class Account { 
	private String Name;
	private int Money;
//	private static int no = 0; 
	public int x;
	public int y;
	public Account(String name){
		this.Name = name;
		this.Money = 1500;
	//	no++;
		this.x = x;
		this.y = y;
		
	}
	public String getName() {
		return Name;
	}
	public int getMoney() {
		return Money;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setMoney(int money) {
		Money = money;
	}
	

	public String toString(){
		return String.format("Name: %s\nMoney: %d\n--------------",Name,Money);
	}
	
}
