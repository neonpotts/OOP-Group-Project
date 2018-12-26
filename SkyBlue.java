
public abstract class SkyBlue extends Estates{
	public int HousePrice(){
		return 50;
	}
	public String toString(){
		return String.format("Sky Blue: %s [Price = %d$, Rent = %d$, House Price = %d$, Sell = %d$, VAT = %d$]",getname(),BuyPrice(),RentValue(),HousePrice(),SellPrice(),thueValue());
	}

}
