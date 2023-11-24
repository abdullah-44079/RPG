package Prefab1;

import java.util.Scanner;

public class Player {

	private String Name;
	
	public void start_warning() {
		System.out.println("**************************************************************************************");
		System.out.println("");
		System.out.println("	Enter which direction you want to travel. Be careful, the rodes are full of 	");
		System.out.println("                     Danger. You may camp any time to rest.");
		System.out.println("");
		System.out.println("**************************************************************************************");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
	}
	
	
	
}
