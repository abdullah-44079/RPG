package Prefab1;

import java.util.Scanner;

public class New_Game_Dialogue {
	
	static int r1;
	static int c1; 
	public void game_dialogue() {
		arrival();
		culture_ques();
		relig_ques();
		
	}
	
	public static void arrival() {
		System.out.println("**************************************************************************************");
		System.out.println("");
		System.out.println("\n (You wake up from your sleep. Your head hurts. You see an old man staring at you.) ");
		System.out.println("");
		System.out.println("Press enter to continue");
		try{System.in.read();}
		        catch(Exception e){}
		System.out.println("");
		 
		System.out.println("**************************************************************************************");
		System.out.println("");
		System.out.println(" Old Man: Don't wake up. You are still weak. ");
		try{System.in.read();}
	    		catch(Exception e){}
		try{System.in.read();}
				catch(Exception e){}
		System.out.println(" You: Where am I?");
		try{System.in.read();}
				catch(Exception e){}
		try{System.in.read();}
				catch(Exception e){}
		System.out.println(" Old Man: Don't you remember? You were on a cart that was headed for Pala Kingdom.");
		try{System.in.read();}
				catch(Exception e){}
		try{System.in.read();}
				catch(Exception e){}
		System.out.println(" Old Man: The cart was attacked by bandits. You are lucky to be alive Lad. All other");
		System.out.println("          passengers lie dead. Ofcourse, all your stuff has been robbed i suppose. ");
		
		try{System.in.read();}
				catch(Exception e){}
		try{System.in.read();}
				catch(Exception e){}
		System.out.println("\n Old Man: Now, tell me. Do you remember anything? Who are you, Lad? ");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" You: Yes, I remember now.");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println("\n**************************************************************************************");
		System.out.println("  Choose your Background story very carefully, In this game your actions impact the ");
		System.out.println("        World around you. Eatch decision you make has it's consiquences.");
		System.out.println("\n**************************************************************************************");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
	}
	
	public static void culture_ques() {
		System.out.println(" Old Man: where are you from?");
		System.out.println("\n1. I am from here, Bengal.");
		System.out.println("2. I come from Rajputana.");
		System.out.println("3. I am a Marathi.");
		System.out.println("4. The island of Lanka.");
		System.out.println("5. Tamil Kingdoms.");
		System.out.println("6. You should know a Gujrati when you see one.");
		System.out.println("7. Muslim Occupied Punjab and Sindh");
	}
	
	public static void relig_ques() {
		System.out.println(" Old Man: Which god do you serve?");
		System.out.println("\n1. I am a Hindu.");
		System.out.println("2. Buddha has shown me light.");
		System.out.println("3. Allah is the one and only.");
		System.out.println("4. I am a devoted follower of Jain.");
		System.out.println("5. Money and women are the only gods I care about!");
	}
	
	public static void culture_dial(int z1) {
		c1 = z1;
		if(c1 == 1) {
			System.out.println(" Old Man: I see, so you were coming back to home in that cart.");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println("\n You: Yes, I was.");
		}
		else if(c1 == 2) {
			System.out.println(" Old Man: People of Rajputana are not doing well due to muslim invasions.");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println("\n You: Yes, that's why I had to leave");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println("\n Old Man: You are not alone lad. I have seen many others like you. Life is hard there.");
		}
		else if(c1 == 3) {
			System.out.println(" Old Man: Marathi are strong and capable people. I heard your Ruler Maharaja Yudhishtir");
			System.out.println(" 		  was overthrone by Lord Krishna the Userper.");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println("\n You: Yes, It is true. Now a Tamil king rules Marathas.");
		}
		else if(c1 == 4) {
			System.out.println(" Old Man: Some people think your people are Demons. You don't look like a Demon to me lad.");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println("\n You: I am not. It,s a false rumor from Ramayan.");
		}
		else if(c1 == 5) {
			System.out.println(" Old Man: Tamil Kings rule all over south india these days. Too many to count!");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println("\n You: Yes, we are blessed.");
		}
		else if(c1 == 6) {
			System.out.println(" Old Man: You are right, How could I miss that smirk on your face!");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println("\n You: You are forgiven old man.");
		}
		else if(c1 == 7) {
			System.out.println(" Old Man: .....I have no idea what you are doing in the other side of India lad.");
			System.out.println(" 		  I can only prey that you find what you are looking for.");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println("\n You: Thank you.");
		}
		else {
			System.out.println(" | There is no such option. You will not get any cultural Bonus |");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
		}
	}
	
	public static void r_ques(int r) {
		r1 = r;
		if(r1 == 1) {
			System.out.println(" Old Man: A Hindu, I see... But which diety do you serve?");
			System.out.println("\n1. Shiva! The destroyer of worlds");
			System.out.println("2. Vishnu, for we are all a part of him");
			System.out.println("3. Bhramma, The 3 faced");
			System.out.println("4. Ganesh, the patrion of knowledge and wisdome");
			System.out.println("5. Kali, the one who purifies all evil");
			System.out.println("6. Shani, the honest and Just");
			System.out.println("7. Suriya, the lord of Light");
		}
		else if(r1 == 2) {
			System.out.println("Old Man: A Buddhist! I am a buddhist as well. Are you a Bhraman or Khattriaya?");
			System.out.println("\n1. I am A Bhraman.");
			System.out.println("2. I am a Kshattriaya");
		}
		else if(r1 == 3) {
			System.out.println(" ( Awkward Silence! ) ");
			try{System.in.read();}
    			catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println(" Old Man: Soooooooo.... You are a dishonourable Scum bag!");
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			System.out.println(" Old Man: I guess I should have let you die. You must be a mercenary");
			System.out.println("          or a sell sword. I hate your kind!");
			
		}
	}
	
	public static void F_Direction() {
		System.out.println(" Old Man: Well, I have treated to your wounds, so you should be fine. ");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" Old Man: It was nice knowing you lad, i will have to leave now. If you are going to  ");
		System.out.println("          The Pala Kingdom, you should keep going north. The capital is not far from here.  ");
		System.out.println("          Lord Dharmapala is always looking for strong warriors. If you want to go to ");
		System.out.println("          Muslim Kingdoms, you should go west, but it's a long way. You might want to  ");
		System.out.println("          stop at Madhya, Gujrat or Pratihara Kingdom. Kingdom of Kannauj is south from ");
		System.out.println(" 	      here. Lastly, Lord Krishna leads the Kingdom of Rashtrakuta which is south-west");
		System.out.println(" 		  from this place. May buddha guide you.  ");
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		System.out.println(" You: Thank you sir. One day, I will repay your kindness.");
	}
	
	
	
}
