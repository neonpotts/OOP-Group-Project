
public abstract class Pink extends Estates{
	public int HousePrice(){
		return 100;
	}
	public String toString(){
		return String.format("Pink: %s [Price = %d$, Rent = %d$, House Price = %d$, Sell = %d$, VAT = %d$]",getname(),BuyPrice(),RentValue(),HousePrice(),SellPrice(),thueValue());
	}

}
