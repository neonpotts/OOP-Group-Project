import java.util.*;
public abstract class Property extends Lands{
	public abstract int GetValue();
	public abstract String getname();
	public int BuyPrice(){
		return GetValue();
	}
	public int SellPrice(){
		return GetValue()/2;
	}
	public int thueValue(){
		return SellPrice()+(int)(SellPrice()*0.1);
	}

	protected int Available = 1;

	public int getAvailable() {
		return Available;
	}

}
