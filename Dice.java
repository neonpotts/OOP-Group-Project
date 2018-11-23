package Dice;

import java.util.*;

public class Dice {
	Random rand = new Random();
	int n = rand.nextInt(6)+1;
	private int x;
	public Dice(){
		this.x = n;
	}
	public int getDice(){
		return x;
	}
}
