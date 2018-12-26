
public abstract class Green extends Estates{
	public int HousePrice(){
		return 200;
	}
	public String toString(){
		return String.format("Green: %s [Price = %d$, Rent = %d$, House Price = %d$, Sell = %d$, VAT = %d$]",getname(),BuyPrice(),RentValue(),HousePrice(),SellPrice(),thueValue());
	}

}
