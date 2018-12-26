
public abstract class Brown extends Estates{
	public int HousePrice(){
		return 50;
	}
	public String toString(){
		return String.format("Brown: %s [Price = %d$, Rent = %d$, House Price = %d$ ,Sell = %d$, VAT = %d$]",getname(),BuyPrice(),RentValue(),HousePrice(),SellPrice(),thueValue());
	}

}
