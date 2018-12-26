import java.util.*;
public class ListOfProperties extends Lands{
	ArrayList<Property> listofp = new ArrayList<Property>();
	private ListOfAccounts acc;
	public ListOfProperties(ListOfAccounts listofacc){
		this.acc = listofacc;
	}
	public void checkAvailable(Property p){
		int x = checkProperty(p);
		if(x == 1){
			if(p.getAvailable() == 1){
				System.out.println(String.format("Noone is owning %s.", p.toString()));
			}
			else{
				MoneyAmount ma = acc.checkOwners(p);
				System.out.println(String.format("%s is owning %s", ma.toString(),p.toString()));
			}
		}
	}
	
	public void add(Property p){
		listofp.add(p);
	}
	public void removeProperty(Property p){
		listofp.remove(p);
	}
	public void DisplayProperties(){
		for(int i = 0;i < listofp.size(); i++){
			System.out.println(listofp.get(i));
		}
	}
	public void Search(Property p){
		int x = checkProperty(p);
		if(x == 1){
			for(int i = 0; i < listofp.size(); i++){
				Property p1 = listofp.get(i);
				if(p == p1){
					System.out.println(p1);
				}
			}
		}
	}
	public int checkProperty(Property p){
		if(listofp.contains(p)){
			return 1;
		}
		else{
			System.out.println(String.format("%s is not in the list, please add to the list.",p.toString()));
			return 0;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "List of Properties";
	}
}
