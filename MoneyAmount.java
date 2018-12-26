import java.util.ArrayList;


public class MoneyAmount {
	private Account a;
	private Account b;
	private int debt = 0;
	private int Money = 1500;
	private int totalMoney=1500;
	private static int NoOwnStation = 0;
	private static int NoOwnUltility = 0;
	private int FreeJailCard = 0;
	ArrayList<Property> OwningList = new ArrayList<Property>();
	public MoneyAmount(Account a){
		this.a = a;
	//	Display(a);
	}
	public String getName(){
		return a.toString();
	}
	public ArrayList<Property> getOwningList() {
		return OwningList;
	}

	public void setOwningList(ArrayList<Property> owningList) {
		OwningList = owningList;
	}


	public int getDebt() {
		return debt;
	}

	public int getMoney() {
		return Money;
	}
	public int gettotalMoney(){
		return totalMoney;
	}
	public static int getNoOwnStation() {
		return NoOwnStation;
	}

	public static int getNoOwnUltility() {
		return NoOwnUltility;
	}
	public int getFreeJailCard(){
		return FreeJailCard;
	}

	public void PassGO(GO go){
		Money += go.Salary();
		totalMoney += go.Salary();
		System.out.println(String.format("%s just passed the GO and receive 200$" , a.toString()));
	}

	public void Buy(Property p){
		int c = checkAvailable(p);
		try{
		if(c == 1){
			Money = Money - p.BuyPrice();
			totalMoney -= p.BuyPrice();
			System.out.println(String.format("---> %s just bought %s with %d$",a.toString(),p.toString(),p.GetValue()));
			Display();
			OwningList.add(p);
			p.Available = 0;

		}
		else if(c == 0){
			System.out.println(String.format("---> %s cant buy %s",a.toString(),p.toString()));
		}
		}catch(Exception e){
			System.out.println(String.format("Error %s . Can't buy",e));
		}
	}
	public void Buy(RailwayStation s){
		int c = checkAvailable(s);
		try{
		if(c == 1){
		
			int x = ++NoOwnStation;
			a.x = x;
			Money = Money - s.BuyPrice();
			totalMoney -= s.BuyPrice();
			System.out.println(String.format("---> %s just bought %s with %d$",a.toString(),s.toString(),s.GetValue()));
	
		//	System.out.println("a  " + NoOwnStation + " b  " + x);
			Display();
			OwningList.add(s);
			s.Available = 0;}
		else{
			System.out.println(String.format("---> %s cant buy %s",a.toString(),s.toString()));
			}

		
		}catch(Exception e){
			System.out.println(String.format("Error %s.Can't Buy",e));
		}

		
	}
	public void Buy(Ultility u){
		int c = checkAvailable(u);
		try{
			if(c == 1){
				int y = ++NoOwnUltility;
				a.y = y;
				Money = Money - u.BuyPrice();
				totalMoney -= u.BuyPrice();
				System.out.println(String.format("---> %s just bought %s with %d$",a.toString(),u.toString(),u.GetValue()));
				Display();
				OwningList.add(u);
				u.Available = 0;
				}
			else{
				System.out.println(String.format("---> %s cant buy %s",a.toString(),u.toString()));
				}

			
			}catch(Exception e){
				System.out.println(String.format("Error %s.Can't Buy",e));
			}
	}
	public void Mortgage(Property p){
		int c = checkAvailable(p);
		try{
		if(c == 0){
			Money = Money + p.SellPrice();
			debt += p.thueValue();
			totalMoney -= p.thueValue() - p.SellPrice();
			System.out.println(String.format("--->%s just sell %s to the bank with %d$. Can take it out with %d$",a.toString(),p.toString(),p.SellPrice(),p.thueValue()));
			Display();
			}
		else if(c == 1){
			System.out.println(String.format("--->%s can't sell %s to the bank",a.toString(),p.toString(),p.SellPrice()));
		}
		} catch(Exception e){
			System.out.println(String.format("Error %s.Can't sell to the bank",e));
		}
		
	}
	public void Mortgage(RailwayStation s){
		int c = checkAvailable(s);
		try{
		if(c == 0){
			int x = --NoOwnStation;
			a.x = x;
			Money = Money + s.SellPrice();
			debt -= s.thueValue();
			totalMoney += s.thueValue() - s.SellPrice();
			System.out.println(String.format("--->%s just sell %s to the bank with %d$. Can take it out with %d$",a.toString(),s.toString(),s.SellPrice(),s.thueValue()));
			Display();

		}
		else{
			System.out.println(String.format("--->%s can't sell %s to the bank ",a.toString(),s.toString()));
		}
		}catch(Exception e){
			System.out.println(String.format("Error %s.Can't sell",e));
		}
		
	}
	public void Mortgage(Ultility u){
		int c = checkAvailable(u);
		try{
			if(c == 0){
				int y = --NoOwnUltility;
				a.y = y;
				Money = Money + u.SellPrice();
				debt -= u.thueValue();
				totalMoney += u.thueValue() - u.SellPrice();
				System.out.println(String.format("--->%s just sell %s to the bank with %d$. Can take it out with %d$",a.toString(),u.toString(),u.SellPrice(),u.thueValue()));
			//	System.out.println("a  " + NoOwnStation + " b  " + x);
				Display();
				}
			else{
				System.out.println(String.format("--->%s just sell %s to the bank",a.toString(),u.toString()));
				}
		} catch(Exception e){
			System.out.println(String.format("Error %s.Can't sell",e));
		}
		
	}
	public void PayRent(MoneyAmount b,Estates l){
		int c = checkAvailable(l);
		if(c == 0){
			if(OwningList.contains(l) != true && b.OwningList.contains(l)){
				int x = l.RentHousePrice();
				Money -= x;
				totalMoney -= x;
				b.Money += x;
				b.totalMoney += x;
				System.out.println(String.format("%s is standing in %s have to pay rent for %s with %d$",a.toString(),l.toString(),b.toString(),x));
				Display();
				b.Display();
			}
			else{
				System.out.println(String.format("%s is owning this, don't have to pay rent", a.toString()));
			}
		}
		else{
			System.out.println("Noone owns this, don't have to pay rent");
		}
	}
	public void PayRent(MoneyAmount b, RailwayStation s){
		int c = checkAvailable(s);
		if(c == 0){
			if(OwningList.contains(s) == false && b.OwningList.contains(s)){
				int x = s.RentValue(b);
				Money -= x;
				totalMoney -= x;
				b.Money += x;
				b.totalMoney += x;
				System.out.println(String.format("%s has %d stations, %s is standing in %s have to pay rent for %s with %d$",b.toString(),b.NoOwnStation,a.toString(),s.toString(),b.toString(),x));
				Display();
				b.Display();
			}
			else{
				System.out.println(String.format("%s is owning this, don't have to pay rent", a.toString()));
			}
		}
		else{
			System.out.println("Noone owns this, don't have to pay rent");
		}
				
	}
	public void PayRent(MoneyAmount b ,Ultility u){
		int c = checkAvailable(u);
		if(c == 0){
			if(OwningList.contains(u) != true && b.OwningList.contains(u)){
				int x = u.RentValue(b);
				Money -= x;
				totalMoney -= x;
				b.Money += x;
				b.totalMoney += x;
				
				System.out.println(String.format("%s has %d ultilities, %s is standing in %s have to pay rent for %s with %d$",b.toString(),b.NoOwnUltility,a.toString(),u.toString(),b.toString(),x));
				Display();
				b.Display();
			}
			else{
				System.out.println(String.format("%s is owning this, don't have to pay rent", a.toString()));
			}
		}
		else{
			System.out.println("Noone owns this, don't have to pay rent");
		}
				
	}
	public void UpgradeHouse(Estates l){
		if(l.checklevel() < 5){
			if(OwningList.contains(l)){
				l.checklevel();
				Money = Money - l.HousePrice();
				totalMoney -= l.HousePrice();
				++l.Level;
				System.out.println(String.format("--->%s just upgrade house for %s with %d$\n\t%s is now level %d, rent price =%d$",a.toString(),l.toString(),l.HousePrice(),l.toString(),l.checklevel(),l.RentHousePrice()));

				if(l.checklevel() == 5){
						l.Level++;
						System.out.println(String.format("--->%s has a Hotel now",l.toString()));

					
				}
				Display();
			}
			else{
				System.out.println(String.format("%s is not belong to %s", l.toString() , a.toString()));
			}
		}
		
		else {
			l.checklevel();
			System.out.println(String.format("Cannot upgrade %s more",l.toString()));
		}
	}
	public void PayMortgage(Property p){
		if(OwningList.contains(p)){
			this.Money = Money - p.thueValue();
			debt -= p.thueValue();
			totalMoney -= p.thueValue() - p.SellPrice();
			System.out.println(String.format("--->%s just take back his/her %s from the bank with %d$",a.toString(),p.toString(),p.thueValue()));
			Display();
		}
		else{
			System.out.println(String.format("--->%s is not belong to %s",p.toString(),a.toString()));
		}
	}
	public int checkAvailable(Property p){
		if(p.Available == 0 ){
			return 0;
		}
		if(p.Available == 1){
			return 1;
		}
		return 0;
	
	}
	public void Display(){
		System.out.println(String.format("Account: %s\tCurrent Money= %d$\tDebt= %d$", a.toString(),Money,debt));
	}
	public void DisplayList(){
		System.out.printf("----------%s----------\n",a.toString());
		for(int i = 0; i < OwningList.size();i++){
			System.out.println(OwningList.get(i)); 
		}
	}
	public void JailFee(){
		Money -= 500;
		totalMoney -= 500;
		System.out.println(String.format("%s just paid the jail fee with 500$",a.toString()));
		Display();
	}
	public void payTax(Tax t){
		int x = t.getTax();
		Money -= x;
		totalMoney -= x;
		System.out.println(String.format("%s just paid %s for %d$",a.toString(),t.toString(),t.getTax()));
		Display();
	}
	public void ChestAndChance(int x){
		if(x == 1){
			FreeJailCard++;
		}
		else{
			Money += x;
			totalMoney += 500;
		}
		Display();
		
	}
	public int Bankrupt(){
		if(totalMoney < debt){
			System.out.println(String.format("%s is now bankrupt!!!!!",a.toString()));
			return 1;
		}
		return 0;
	}
	public String toString(){
		return String.format("%s\tCurrent Money = %d$\tTotal Money = %d$\tDebt = %d$",a.getName(),Money,totalMoney,debt);
	}

}
