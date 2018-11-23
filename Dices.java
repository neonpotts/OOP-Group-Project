package Dice;
import javax.swing.JOptionPane;
public class Dices {

	private int a;
	private int b;
	//private int sum;
	static int count = 0;
	public Dices(){
	//	x++;
	
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		this.a = d1.getDice();
		this.b = d2.getDice();
	
		int s = sum(this.a,this.b);
		display(this.a,this.b,s);
		checkcount(this.a,this.b);
	
	}

	public void checkcount(int a,int b){

		checkdices(a,b);
		if(a==b && count != 3){
		//	checkdices(a,b);
			Dices t = new Dices();
		//	System.out.println("Count = " + count);
			
		}
		
		if (a==b && count == 3){
			//JOptionPane.showMessageDialog(null,"GO TO JAIL!!!","Dices", JOptionPane.PLAIN_MESSAGE);
			System.out.println("xxxxGO TO JAIL!!xxxx");
			count =0;
		}
		
		
		
		
		
	}
	public void display(int a, int b, int sum){
		//JOptionPane.showMessageDialog(null, String.format("First dice roll: %d\nSecond dice roll: %d\nSum = %d", a, b , sum),"Dices", JOptionPane.PLAIN_MESSAGE);
		System.out.println(String.format("First dice roll: %d\nSecond dice roll: %d\nMove: %d",a,b,sum));
	}
	public int sum(int a, int b){
		return a+b;
	}
	public void checkdices(int a, int b){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	checkcount();
		if(a == b){
			count++;
			//Thread.sleep(1000);
			if(count != 3){ System.out.println("Roll again");
			
			}
			else if(count == 3)
			{
				System.out.println("Finished Roll");
				System.out.println("------------------------------");
			}
			//JOptionPane.showMessageDialog(null, "Roll again","Dices",JOptionPane.PLAIN_MESSAGE);
			//count++;
			
		}
		else{
		
			System.out.println("Finished Roll");
			System.out.println("------------------------------");
			//JOptionPane.showMessageDialog(null, "Finished Roll","Dices",JOptionPane.PLAIN_MESSAGE);
			count=0;
		}
	}
}
