package Prefab1;

import java.util.Random;
import java.util.Scanner;

public class dialogue {
	

	public void Move() {
		
		System.out.println("");
		System.out.println("   1. East  (X++)   2. West  (X--)      13/31. EN/NE   14/41. ES/SE ");
		System.out.println("   3. North (Y++)   4. South (Y--)      23/32. WN/NW   24/42. WS/SW "     );
		System.out.println("   5. Camp          6. Show Stats");
		System.out.println("   7. Menu          8. Exit");
		
		
	}
	
	public void soldier(int X, int Y, int z) {
		System.out.println("You meet a band of soldiers. ");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println("Soldier: Stay on your guard citizen! The roads are dangerous.");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println("You: Can you tell me anything about this place?");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		
		if(X >  -35 && X < -15 && Y > -5 && Y < 13) {
			System.out.println("Soldier: You are in the muslim occupied india. The Sultan of Sindh and the");
			System.out.println("         Emir of Multan have joined forces to fight against the heathens. If");
			System.out.println("         you are a devoted musluim, you should join the holly army and fight");
			System.out.println("         In the name of Allah and the true prophet.");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			
			if(z == 3) {
				System.out.println(" You: In shah allah, I will my friend.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("( The soldier smiles )");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" Soldier: Good! hope to see you beside me on the battlefield someday. Allah Hafez.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" You: Allah Hafez.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
			}
			else {
				System.out.println(" You: I am afraid I am not a muslim my friend.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("Soldier: Be gone then, Heathen!");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
			}
		}
		
		else if(X > -35 && X < -15 && Y > -15 && Y < -5) {
			System.out.println(" Soldier: You are in Gujrat. It is the last Jain Kingdom in the world. The hindus and muslims");
			System.out.println("          and budhists have have misguided the people. Now they all worship those new gods ");
			System.out.println("          instead of the old gods of the past. If you are a true jain, join us and fight to");
			System.out.println("          restore the old ways!");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			
			if(z == 4) {
				System.out.println(" You: Yes, old ways were the best.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("( The soldier smiles )");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" Soldier: Good! hope to see you beside me on the battlefield someday. Divine's blessings to you.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" You: Divine's blessing to you too friend.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				
			}
			else {
				System.out.println(" You: I am afraid I am not a Jain my friend.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("Soldier: Then we have nothing more to talk about!");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
			}
		}
		else if(X > 15 && X < 35 && Y > 0 && Y < 20) {
			System.out.println(" Soldier: You are in Pala Kingdom of the great King Dharmapala the Conqueror. He is a");
			System.out.println("          charismatic leader who fights to bring the buddha's peace to this world. Also, ");
			System.out.println("          Pala kingdom is currently the strongest kingdom in all of Bharat. A true buddhist");
			System.out.println("          will definitely fight for the pala kingdom to extend it's golden age.");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			
			if(z == 2) {
				System.out.println(" You: Yes, buddha shall guide us all one day.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("( The soldier smiles )");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" Soldier: Good! hope to see you beside me on the battlefield someday. May buddha guide us.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" You: May buddha guide us.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				
			}
			else {
				System.out.println(" You: I am afraid I am not a Buddhist my friend.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("Soldier: You have not seen the light yet. Hope we don't meet in the battleld. because if we do,");
				System.out.println("         I will not show buddha's mercy!");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
			}
		}
		else if(X > 0 && X < 15 && Y > 5 && Y < 20) {
			System.out.println(" Soldier: You are in the ancient kingdom of Ayutha! the kingdom of Legends, the kingdom which was");
			System.out.println("          ruled by God Ram himself. Our history is rich and our army is Zealous. We conquer our");
			System.out.println("          enemies and we bow before none. Join us and help us fight the heathens and the hindus");
			System.out.println("          who does not recognize us as the true masters of Bharat!");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			
			if(z == 1) {
				System.out.println(" You: Yes, one day I might join the army of God King Ram.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("( The soldier smiles )");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" Soldier: Good! hope to see you beside me on the battlefield someday. Farewell.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" You: Farewell friend.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				
			}
			else {
				System.out.println(" You: I am afraid I am not a Hindu my friend.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("Soldier: Then get out of my sight!");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
			}
		}
		else if(X > -15 && X < 15 && Y > -15 && Y < 5) {
			System.out.println(" Soldier: You are in the kingdom of Rashtrakuta! the kingdom in the legends of Mahavarat once");
			System.out.println("          ruled by Pandavs. Our history is rich and our army is Zealous. We are devoted followers");
			System.out.println("          of Lord Krishna the Madhusudan. Join us and help us fight the heathens and the hindus");
			System.out.println("          who does not recognize us as the true masters of Bharat!");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			
			if(z == 1) {
				System.out.println(" You: Yes, one day I might join the legendary kingdom of Rashtrakuta.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("( The soldier smiles )");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" Soldier: Good! hope to see you beside me on the battlefield someday. Jay shree Krishna.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println(" You: Jay shree Krishna.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				
			}
			else {
				System.out.println(" You: I am afraid I am not a Hindu my friend.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				System.out.println("Soldier: ..... Fine, more meat to slice in the battlefields i suppose.");
				System.out.println("");
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
			}
		}
		else {
			System.out.println(" Soldier: I don't have time to chat. Go away!");
			System.out.println("");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println(" You: Hmm... I guess I have to find out for myself.");
			
		}
	}
	
	public void stranger() {
		Random  randst = new Random();
		int loc = randst.nextInt(2);
		
		System.out.println("You: Hello stranger, are you traveling?");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		
		if(loc == 1) {
			System.out.println("");
			System.out.println("stranger: No sir, I live in a village not far from here.");
			System.out.println("");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			
			System.out.println(" You: Ok, you may go then.");
		}
		else {
			int location = randst.nextInt(11);
			if(location == 1) {
				System.out.println("stranger: I come from Dhaka sir, it is a very prosperous city. (X:30, Y:3)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 2) {
				System.out.println("starnger: I come from Bhopal sir, it is a very prosperous city. (X:0, Y:0)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 3) {
				System.out.println("stranger: I come from Patliputra, the formal capital of Magadh. (X:25, Y:7)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 4) {
				System.out.println("stranger: I come from Ayudha, the ancient city of Mahavarat. (X:5, Y:13)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 5) {
				System.out.println("stranger: I come from Delhi sir, it is a very prosperous city. (X:-12, Y:12)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 6) {
				System.out.println("stranger: I come from Roruka, the muslim stronghold in India. (X:-30, Y:2)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 7) {
				System.out.println("stranger: I come from Bhatinda fortress, The biggest trade station in india. (X:-25, Y:15)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 8) {
				System.out.println("stranger: I come from Rajkot sir, it is a very prosperous city. (X:-10, Y:-2)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 9) {
				System.out.println("stranger: I come from Surat sir, it is a very prosperous city. (X:-3, Y:-8)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 10) {
				System.out.println("stranger: I come from Manyakheta, the city of kings. (X:10, Y:-10)");
				System.out.println("");
				System.out.println("You: Ok, thank you");
			}
			else if(location == 11) {
				System.out.println("stranger: I come from Sri Jayawardhana Kotti, known as the city of demons! (X:20, Y:-15)");
				System.out.println("");
				System.out.println("You: Ok...., Thank you.....");
			}
			else {
				System.out.println("(The stranger runs away)");
				System.out.println("");
				System.out.println("You: hmm, odd guy. Guess i should keep moving.");
			}
			
		}
		
	}
	//public abstract void city();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	public void endgame() {
		System.out.println("");
		System.out.println("Your journey ends here. ");
		System.out.println("");
	}
	
	public void notEnoughMoney() {
		System.out.println("Not enough money!");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
	}
	
	public void purchase() {
		System.out.println("Purchase complete!");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
	}
	
	
	
	
	
	
	
	
	
		    			    
	public void factionpblm(String s) {
		System.out.println("");
    	System.out.println("Local "+s+": You already fight for another religious faction. You must abandon your faction in order.");
    	System.out.println("            to serve Allah! ");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		
		System.out.println("You: I can not do that. (Holly fury DLC required)");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
	}
	
	
		    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void palace_Guard() {
		System.out.println("");
		System.out.println(" Palace Guard: Halt! Where are you going stranger?");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" You: I want to join the army. Where do I sign up?");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" Palace Guard: Look at you! Do you even know how to use a sword? Get out of here peseant!");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println("                            (Gain 200 glory to join a faction)                           ");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		
	}
	
	public void palace_Guard2() {
		System.out.println("");
		System.out.println(" Palace Guard: Halt! Where are you going stranger?");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" You: I am here to join the army. Where do I sign up?");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" Palace Guard: Well, You look like a capable warrior. Alright, But first, you have to take");
		System.out.println("               your voes as a soldier. Are you ready?");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println("");
		System.out.println(" 1. I was born ready for this!");
		System.out.println(" 2. Actually, I want to enjoy my freedom a little bit more.");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		
	}
	
	public void noTNX() {
		System.out.println("");
		System.out.println(" Palace Guard: No need to rush. Come back when you are ready bro!'");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
	}
	
	public void vowSldr(String kingdom) {
		System.out.println("");
		System.out.println(" Palace Guard: Verry well. I will take you to the captain. Follow me.");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println("            (The Guard takes you inside the barrack.)           ");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" Palace Guard: Sir, We have a new blood here.");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" Captain: So, you wish to join our army. Verry well, we need all the capable men we can get. ");
		System.out.println("          From now on, you serve the kingdom of "+kingdom+". Take the oath and I shall name you");
		System.out.println("          a soldier.");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println("");
		System.out.println(" 1. I swear to be a loyal soldier of "+kingdom+" and fight those who oppose us!");
		System.out.println(" 2. Count me out Yo!");
		
	}
	
	public void joke() {
		System.out.println("");
		System.out.println(" Captain: You think this is a joke? Come back when you are ready.");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
	}
	
	public void join(String kdm) {
		System.out.println("");
		System.out.println(" Captain: Then I declare you a bad ass soldier in this bad ass kingdom. Now fu*k off.");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println("");
		System.out.println("                             (You have joined the kingdom of "+kdm+")                       ");
		System.out.println("");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
	}
	
	
	
	
}
