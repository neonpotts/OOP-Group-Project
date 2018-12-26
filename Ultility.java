
public abstract class Ultility extends Property{

	public int GetValue(){
		return 150;
	}
	public String toString(){
		return String.format("Ultility: %s [Price = %d$, Rent = (depends),Sell = %d$, VAT = %d$]",getname(),BuyPrice(),SellPrice(),thueValue());
	}
	public int RentValue(MoneyAmount a){
		if(a.getNoOwnUltility() == 1){
			Dices d = new Dices();
			d.display();
			int r = d.sum()*4;
			System.out.println(a.getName() + " owns " + a.getNoOwnUltility()+ " ultility. The rent price will be equal with 4 times total of dices " + r + "$");
			return r;
 		}
		if(a.getNoOwnUltility()== 2){
			Dices d = new Dices();
			d.display();
			int r = d.sum()*10;
			System.out.println(a.getName() + " owns " + a.getNoOwnUltility()+ " ultilities. The rent price will be equal with 10 times total of dices "+ r + "$");
			return r;
		}
		
		System.out.println(a.getName() + " doesn't own any ultility");
		return 0;
	}
}
