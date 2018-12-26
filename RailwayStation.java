
public abstract class RailwayStation extends Property{
	Account a;
	public int GetValue(){
		return 200;
	}
	public String toString(){
		return String.format("Station: %s [Price = %d$, Rent = (depends),Sell = %d$, VAT = %d$]",getname(),BuyPrice(),SellPrice(),thueValue());
	}
	public int RentValue(MoneyAmount a){
		if(a.getNoOwnStation() == 1){
			return 25;
		}
		if(a.getNoOwnStation() == 2){
			return 50;
		}
		if(a.getNoOwnStation()== 3){
			return 100;
		}
		if(a.getNoOwnStation() == 4){
			return 200;
		}
		return 0;
	}

}
