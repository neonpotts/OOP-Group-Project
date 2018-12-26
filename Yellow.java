
public abstract class Yellow extends Estates{
	public int HousePrice(){
		return 150;
	}
	public String toString(){
		return String.format("Yellow: %s [Price = %d$, Rent = %d$, House Price = %d$, Sell = %d$, VAT = %d$]",getname(),BuyPrice(),RentValue(),HousePrice(),SellPrice(),thueValue());
	}

}
