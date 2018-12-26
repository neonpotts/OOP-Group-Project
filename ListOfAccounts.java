import java.util.*;
public class ListOfAccounts {
	ArrayList<Account> listofacc = new ArrayList<Account>();
	ArrayList<MoneyAmount> listofmm = new ArrayList<MoneyAmount>();
	public ListOfAccounts(){

	}
	public void Add(Account a,MoneyAmount m){
		listofacc.add(a);
		listofmm.add(m);
	}
	public void Remove(Account a,MoneyAmount m){
		listofacc.remove(a);
		listofmm.remove(m);
	}
	public MoneyAmount checkOwners(Property p){
		if(p.Available == 0){
			for(int i = 0; i < listofmm.size();i++){
				MoneyAmount ma = listofmm.get(i);
				if(ma.OwningList.contains(p))
				{
					return ma;
				}
			
			}
		}
		else{
			System.out.println("Noone owning " +p.getname());
		}
		return null;
		
	}
	
	public void DisplayOwningLists(){
		for(int i = 0; i < listofmm.size(); i++){
			MoneyAmount ma = listofmm.get(i);
			ma.DisplayList();
		}
	}
	public void DisplayPlayers(){
		for(int i = 0; i < listofacc.size(); i++){
			System.out.println((i+1)+"\n"+listofacc.get(i));
		}
	}
	public void DisplayPlayingPlayers(){
		CheckBankrupt();
		for(int i = 0; i < listofmm.size(); i++){
			System.out.println((i+1)+"\t"+listofmm.get(i));
		}
	}
	public void CheckBankrupt(){
		for(int i = 0; i < listofmm.size(); i++){
			MoneyAmount ma = listofmm.get(i);
			int x =ma.Bankrupt();
			if(x == 1){
				listofmm.remove(ma);
			}
		}
	}
}
