
public abstract class Blue extends Estates{
	public int HousePrice(){
		return 200;
	}
	public String toString(){
		return String.format("Blue: %s [Price = %d$, Rent = %d$, House Price = %d$, Sell = %d$, VAT = %d$]",getname(),BuyPrice(),RentValue(),HousePrice(),SellPrice(),thueValue());
	}
}
