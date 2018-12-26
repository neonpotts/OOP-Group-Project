import java.util.ArrayList;


public class Account { 
	private String Name;
	private int Money;
	
	// Account's constructor
	public Account(String name){
		this.Name = name;
		this.Money = 1500;
		
	}
	
	// Getter and Setter
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
	
	// Display the Account
	public String toString(){
		return String.format("Name: %s\nMoney: %d\n--------------",Name,Money);
	}
	
}
