
public abstract class Estates extends Property{

	protected int Level = 0;
	public abstract int HousePrice();
	public abstract int RentValue();

	public int SellPrice(){
		int x = checklevel();
		int a = x*HousePrice();
		return (GetValue()+a)/2;
	}
	public int RentHousePrice(){
		int x = checklevel();
		if(x == 1){
			return RentValue()*5;
		}
		if(x == 2){
			return RentValue()*15;
		}
		if(x == 3){
			return RentValue()*35;
		}
		if(x == 4){
			return RentValue()*43;
		}
		if(x == 5){
			return RentValue()*50;
		}
		
		return RentValue();
	}
	public int checklevel(){
		if(Level == 1){
			return 1;
		}
		if(Level == 2){
			return 2;
		}
		if(Level == 3){
			return 3;
		}
		if(Level == 4){
			return 4;
		}
		if(Level >= 5){
			return 5;
		}
		return 0;
	
	}
}
