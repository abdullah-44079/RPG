package Prefab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


import java.util.Scanner;

public class play {
	
	static int event;
	static int ds;
	
	private static int X = 25;
	private static int Y = 5;
	private static int ev, faction = 0, Extra_Health = 0, Extra_Cunning = 0, Extra_Damage = 0;
	private static int Health=100, Coins, Hit, Level, Renoun, Prowese, Reputation, Cunning, Glory, Religion, Glory_Cap = 100;
	private static String Dharma, Name;
	private static int Current_Health;
	private static boolean bounty = false, dead = false;
	
	private static boolean alive = true;
	private static boolean Ngame = true;
	private static int exit=0;
	private static String armour = "None", weapon = "None";
	
	public static void St(String name, int health, int coin, int hit, int lev,int renoun, int prowese, int reputation, int cunning, int glory, int religion) {
		Name = name;
		Health = health;
		Coins = coin;
		Hit = hit;
		Level = lev;
		Renoun = renoun;
		Prowese = prowese;
		Reputation = reputation;
		Cunning = cunning;
		Glory = glory;
		Religion = religion;
		Current_Health = Health;
		
		if(Religion == 1) {
			Dharma = "Hindu";
		}
		else if(Religion == 2) {
			Dharma = "Buddhist";
		}
		else if(Religion == 3) {
			Dharma = "Islam";
		}
		else if(Religion == 4) {
			Dharma = "Jain";
		}
		else if(Religion == 5) {
			Dharma = "Unbeliever";
		}
		else{
			Dharma = "Error";
			
		}
		writeToFile();
		
	}
	
	public static void ShowStats() {
		breakln();
		Dharma(Religion);
		System.out.println("");
		System.out.println("   Your Stats: ");
		System.out.println("");
		System.out.println("   Player Name:  "+Name);
		System.out.println("   Health:       "+Current_Health+"/"+Health);
		System.out.println("   Coins:        "+Coins);
		System.out.println("   Hit Power:    "+Hit);
		System.out.println("   Level:        "+Level);
		System.out.println("   Renoun:       "+Renoun);
		System.out.println("   Prowese:      "+Prowese);
		System.out.println("   Reputation:   "+Reputation);
		System.out.println("   Cunning:      "+Cunning);
		System.out.println("   Glory:        "+Glory+"/"+Glory_Cap);
		System.out.println("   Religion:     "+Dharma);
		
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		
	}
	
	public static void Lv_Up(int t) {
		
		Glory = Glory + t;
		
		while(Glory >= Glory_Cap) {
			Glory_Cap = Glory_Cap + (100 * Level);
			Level = Level + 1;
			Health = Health + 10;
			Hit = Hit + 2;
			Renoun = Renoun +2;
			Prowese = Prowese + 2;
			Reputation = Reputation + 2;
			Cunning = Cunning + 2;
			System.out.println("");
			System.out.println("level up!");
			writeToFile();
		}
	}
	
	public static void Grid() {
		System.out.println("");
		System.out.println("X grid: "+X+" and Y grid: "+Y);
	}
	
	public static void ConvertToIslam() {
		Scanner skan = new Scanner(System.in);
		ConvertToRel cr = new ConvertToIslam();
		cr.convert();
		while (!skan.hasNextInt()) {
		      System.out.println("Input is not a number.");
		      skan.nextLine();
		    }
		    int conv1 = skan.nextInt();
		
		    if(conv1 == 1) {
		    	cr.vowRel2();
		    	while (!skan.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      skan.nextLine();
		    	}
		    	int conv2 = skan.nextInt();
		    	if(conv2 == 1) {
		    		cr.cnvRel();
		    		Religion = 3;
		    		Dharma = "Islam";
		    	}
		    	else {
		    		cr.angry();
		    	}
		    }
		    else {
		    	cr.angry();
		    }
	}
	
	public static void ConvertToBuddhism() {
		Scanner skan = new Scanner(System.in);
		ConvertToRel cr = new ConvertToBuddhist();
		cr.vowRel1();
		while (!skan.hasNextInt()) {
		      System.out.println("Input is not a number.");
		      skan.nextLine();
		    }
		    int conv1 = skan.nextInt();
		    
		    if(conv1 == 1) {
		    	cr.cnvRel();
		    	Religion = 2;
		    	Dharma = "Buddhist";
		    }
		    else {
		    	cr.angry();
		    }
		    
	}
	
	public static void ConvertToHindu() {
		Scanner skan = new Scanner(System.in);
		ConvertToRel cr=new ConvertToHindu();
		cr.vowRel1();
		while (!skan.hasNextInt()) {
		      System.out.println("Input is not a number.");
		      skan.nextLine();
		    }
		    int conv1 = skan.nextInt();
		    
		    if(conv1 == 1) {
		    	cr.cnvRel();
		    	Religion = 1;
		    	Dharma = "Hindu";
		    }
		    else {
		    	cr.angry();
		    }
		    
	}
	
	public static void Event_System(int var) {
		
		Scanner scan32 = new Scanner(System.in);
		Random  random = new Random();
		if(var == 0) {
			System.out.println("");
			System.out.println("You meet a stranger.");
			System.out.println("");
			dialogue w = new dialogue();
			w.stranger();
			
		}
		else if(var == 1) {
			int r = 100;
			System.out.println("");
			System.out.println("A robber has come to rob you!");
			System.out.println("");
			while(r > 0 && Current_Health>=0) {
				System.out.println("Your Health: "+Current_Health);
				System.out.println("");
				System.out.println("Robber Health: "+r);
				System.out.println("");
				System.out.println("1. Attack");
				System.out.println("2. Run");
				while (!scan32.hasNextInt() ) {
			     	System.out.println(" ");
			     	scan32.nextLine();
			    }
				int cho = scan32.nextInt();
				
				if(cho == 1) {
					int range = Hit/ 2;
					int sum = random.nextInt(range) + Hit;
					System.out.println("The Robber took "+sum+" damage");
					System.out.println("You took 5 damage");
					r = r - sum;
					Current_Health = Current_Health - 5;
					writeToFile();
					
					if(Current_Health < 0 ) {
						System.out.println("You are dead! ");
						dead = true;
						//break;
						deleteFile();
					}
					else if(r == 0) {
						System.out.println("The Robber escaped!");
					}
					else if(r < 0) {
						Glory = Glory + 25;
						int sgold = random.nextInt(5);
						Coins = Coins + sgold;
						System.out.println("The Robber is dead! You gain glory and "+sgold+" gold.");
						writeToFile();
						Lv_Up(0);
						writeToFile();
						
					}
				}
				else if (cho==2) {
					System.out.println("You decided to run");
					break;
				}
				else {
					System.out.println("You decided to run");
					break;
				}
			}
			
			
		}
		else if(var == 2) {
			int b = 150;
			System.out.println("");
			System.out.println("A Bandit has come to kill you and loot your corps!");
			System.out.println("");
			while(b > 0 && Current_Health>=0) {
				System.out.println("Your Health: "+Current_Health);
				System.out.println("");
				System.out.println("Bandit Health: "+b);
				System.out.println("");
				System.out.println("1. Attack");
				System.out.println("2. Run");
				while (!scan32.hasNextInt() ) {
			     	System.out.println(" ");
			     	scan32.nextLine();
			    }
				int cho = scan32.nextInt();
				
				if(cho == 1) {
					int range = Hit/ 2;
					int sum = random.nextInt(range) + Hit;
					System.out.println("The Bandit took "+sum+" damage");
					System.out.println("You took 10 damage");
					b = b - sum;
					Current_Health = Current_Health - 10;
					writeToFile();
					
					if(Current_Health < 0 ) {
						System.out.println("You are dead! ");
						dead = true;
						writeToFile();
						deleteFile();
						
						}
					else if(b == 0) {
						System.out.println("The Bandit escaped!");
					}
					else if(b < 0) {
						Glory = Glory + 50;
						writeToFile();
						int sgold = random.nextInt(10);
						Coins = Coins + sgold;
						writeToFile();
						System.out.println("The Bandit is dead! You gain glory and "+sgold+" gold.");
						Lv_Up(0);
						writeToFile();
						//break;
					}
					
					
				}else if (cho==2) {
					System.out.println("You decided to run");
					break;
				}
				else {
					System.out.println("You decided to run");
					break;
				}
			}
			
			
		}
		else if(var == 3) {
			int sum = random.nextInt(6);
			System.out.println("You meet a gambler. Would you like to gamble for gold?");
			System.out.println("");
			System.out.println("1. Sure, why not.");
			System.out.println("2. No, thanks.");
			while (!scan32.hasNextInt()) {
		     	System.out.println(" ");
		     	scan32.nextLine();
		    }
			int gamble = scan32.nextInt();
			
			if(gamble == 1 && Coins > 15) {
				if(sum == 0) {
					Coins = Coins + 5;
					System.out.println("You won 5 gold");
					writeToFile();
				}
				else if(sum == 1) {
					Coins = Coins + 10;
					System.out.println("You won 10 gold");
					writeToFile();
				}
				else if(sum == 2) {
					Coins = Coins + 15;
					System.out.println("You won 15 gold");
					writeToFile();
				}
				else if(sum == 3){
					Coins = Coins - 15;
					System.out.println("You lost 15 gol+");
					writeToFile();
				}
				else if(sum == 4) {
					Coins = Coins - 5;
					System.out.println("You lost 5 gold");
					writeToFile();
				}
				else if(sum == 5) {
					Coins = Coins - 10;
					System.out.println("You lost 10 gold");
					writeToFile();
				}
				else {
					System.out.println("Nobody wins. It's a tie.");
				}
			}
			else if(gamble == 1 && Coins < 15) {
				System.out.println("You don't have enough money to gamble");
			}
			else {
				System.out.println("You decide to move on.");
			}
			
		}
		else if(var == 4) {
			System.out.println("The roads are empty.");
		}
		else if(var == 5) {
			dialogue wd = new dialogue();
			wd.soldier(X,Y, Religion);
			
		}
		else if(var == 6) {
			//bounty=true;
			if(bounty) {
				int run=0;
				int as = 150  + (Health/10);
				System.out.println("");
				System.out.println("An assassin has come to kill you.");
				System.out.println("");
				while(as > 0&& run==0) {
					System.out.println("Your Health: "+Current_Health);
					System.out.println("");
					System.out.println("Assassin Health: "+as);
					System.out.println("");
					System.out.println("1. Attack");
					System.out.println("2. Run");
					while (!scan32.hasNextInt()) {
				     	System.out.println(" ");
				     	scan32.nextLine();
				    }
					int cho = scan32.nextInt();
					
					if(cho == 1) {
						int range = Hit/ 2;
						int sum = random.nextInt(range) + Hit;
						System.out.println("The Assassin took "+sum+" damage");
						System.out.println("You took 15 damage");
						as = as - sum;
						Current_Health = Current_Health - 15;
						writeToFile();
						
						if(Current_Health < 0 ) {
							System.out.println("You are dead! ");
							dead = true;
							writeToFile();
							break;
						}
						else if(as == 0) {
							System.out.println("The Assassin escaped!");
						}
						else if(as < 0) {
							Glory = Glory + 50;
							writeToFile();
							int sgold = random.nextInt(25);
							Coins = Coins + sgold;
							writeToFile();
							System.out.println("The Assassin is dead! You gain glory and "+sgold+" gold.");
							
						}
					}
					else if (cho==2) {
						run=1;

						System.out.println("You runned");
					}
					
					
					else {
						run=1;
						System.out.println("You runned");
					}
				}
				
			}
			else {
				System.out.println("");
				System.out.println("You notice a strange man with a sharp look. He looks back at you and scans you head to toe.");
				System.out.println("");
			}

		}
		else if(var == 7) {
			System.out.println("The roads are empty.");
		}
		else if(var == 8) {
			System.out.println("The roads are empty");
		}
		else if(var == 9) {
			System.out.println("The roads are empty");
		}
		else if(var == 10) {
			System.out.println("The roads are empty");
		}
		else {
			System.out.println("The roads are empty");
		}
	}
	
	public static void armory() {
		Scanner sca = new Scanner(System.in);
		
		while(alive) {
			dialogue wb = new dialogue();
			System.out.println("");
			System.out.println("What would you like to buy?          Current armour: "+armour);
			System.out.println("");
			System.out.println("1. leather Armour (Light) ");
			System.out.println("2. Steel Armour (Heavy) ");
			System.out.println("3. Faction Armour (Special) ");
			System.out.println("4. Exit shop");
			while (!sca.hasNextInt()) {
		     	System.out.println(" ");
		     	sca.nextLine();
		    }
			int dis45 = sca.nextInt();
			
			if(dis45 == 1) {
				while(alive) {
					
					System.out.println("");
					System.out.println("1. Hide armour (Health +20, cunning +5)                    cost: 60 coins");
					System.out.println("2. Fur armour  (Health +25, cunning +5)                    cost: 70 coins");
					System.out.println("3. Fine Leather armour (Health +35, cunning +5)            cost: 90 coins");
					System.out.println("4. Thin plate armour (Health +50, cunning +5)              cost: 120 coins");
					System.out.println("5. Back");
					System.out.println("");
					while (!sca.hasNextInt()) {
				     	System.out.println(" ");
				     	sca.nextLine();
				    }
					int dson1 = sca.nextInt();
					
					if(dson1 == 1 && Coins > 59) {
						armour = "Hide armour";
						Health = Health - Extra_Health;
						Cunning = Cunning - Extra_Cunning;
						Extra_Health = 20;
						Extra_Cunning = 5;
						Health = Health + Extra_Health;
						Cunning = Cunning + Extra_Cunning;
						Coins = Coins - 60;
						wb.purchase();
						break;
					}
					else if(dson1 == 1 && Coins < 60) {
						wb.notEnoughMoney();
					}
					else if(dson1 == 2 && Coins > 69) {
						armour = "Fur armour";
						Health = Health - Extra_Health;
						Cunning = Cunning - Extra_Cunning;
						Extra_Health = 25;
						Extra_Cunning = 5;
						Health = Health + Extra_Health;
						Cunning = Cunning + Extra_Cunning;
						Coins = Coins - 70;
						wb.purchase();
						break;
					}
					else if(dson1 == 2 && Coins < 70) {
						wb.notEnoughMoney();
					}
					else if(dson1 == 3 && Coins > 90) {
						armour = "Fine Leather armour";
						Health = Health - Extra_Health;
						Cunning = Cunning - Extra_Cunning;
						Extra_Health = 35;
						Extra_Cunning = 5;
						Health = Health + Extra_Health;
						Cunning = Cunning + Extra_Cunning;
						Coins = Coins - 90;
						wb.purchase();
						break;
					}
					else if(dson1 == 3 && Coins < 89) {
						wb.notEnoughMoney();
					}
					else if(dson1 == 4 && Coins > 120) {
						armour = "Thin plate armour";
						Health = Health - Extra_Health;
						Cunning = Cunning - Extra_Cunning;
						Extra_Health = 50;
						Extra_Cunning = 5;
						Health = Health + Extra_Health;
						Cunning = Cunning + Extra_Cunning;
						Coins = Coins - 120;
						wb.purchase();
						break;
					}
					else if(dson1 == 4 && Coins < 119) {
						wb.notEnoughMoney();
					}
					else if(dson1 == 5) {
						break;
					}
					else{
						System.out.println("Not a valid input");
					}
				}
				
				
			}
			else if(dis45 == 2) {
				while(alive) {
					System.out.println("");
					System.out.println("1. Thick Steel Plate armour (Health +80, cunning -5)       cost: 120 coins");
					System.out.println("2. Reinforced Steel armour (Health +60, cunning -0)        cost: 120 coins");
					System.out.println("3. Mercenary Captain's armour (Health +120, cunning -8)    cost: 150 coins");
					System.out.println("4. Back");
					System.out.println("");
					while (!sca.hasNextInt()) {
				     	System.out.println(" ");
				     	sca.nextLine();
				    }
					int dson2 = sca.nextInt();
					
					if(dson2 == 1 && Coins > 119) {
						armour = "Thick Steel Plate armour";
						Health = Health - Extra_Health;
						Cunning = Cunning - Extra_Cunning;
						Extra_Health = 80;
						Extra_Cunning = -5;
						Health = Health + Extra_Health;
						Cunning = Cunning + Extra_Cunning;
						Coins = Coins - 120;
						wb.purchase();
						break;
					}
					else if(dson2 == 1 && Coins < 120) {
						wb.notEnoughMoney();
					}
					else if(dson2 == 2 && Coins > 119) {
						armour = "Reinforced Steel armour";
						Health = Health - Extra_Health;
						Cunning = Cunning - Extra_Cunning;
						Extra_Health = 60;
						Extra_Cunning = 0;
						Health = Health + Extra_Health;
						Cunning = Cunning + Extra_Cunning;
						Coins = Coins - 120;
						wb.purchase();
						break;
					}
					else if(dson2 == 2 && Coins < 120) {
						wb.notEnoughMoney();
					}
					else if(dson2 == 3 && Coins > 149) {
						armour = "Mercenary Captain's armour";
						Health = Health - Extra_Health;
						Cunning = Cunning - Extra_Cunning;
						Extra_Health = 120;
						Extra_Cunning = -8;
						Health = Health + Extra_Health;
						Cunning = Cunning + Extra_Cunning;
						Coins = Coins - 150;
						wb.purchase();
						break;
					}
					else if(dson2 == 3 && Coins < 150) {
						wb.notEnoughMoney();
					}
					else if(dson2 == 4) {
						break;
					}
					else {
						System.out.println("Not a valid input");
					}
				}
				
				
			}
			else if(dis45 == 3) {
				
				if(faction == 0) {
					System.out.println("You need to join a faction to buy faction armour.");
					try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				}
				else {
					while(alive) {
						System.out.println("");
						System.out.println("1. Recruit's Armour set (Health +80)                       cost: 100 coins");
						if(Glory > 2000) {
							System.out.println("2. Veterian armour set (Health +120)                       cost: 130 coins");
						}
						else {
							System.out.println("2. (Get 2000 glory to unlock)");
						}
						if(Prowese > 49) {
							System.out.println("3. Comander's armour set (Health +180)                     cost: 160 coins");
						}
						else {
							System.out.println("3. (Have atleast 50 prowese to unlock)");
						}
						
						while (!sca.hasNextInt()) {
					     	System.out.println(" ");
					     	sca.nextLine();
					    }
						int dson3 = sca.nextInt();

						if(dson3 == 1 && Coins > 99) {
							armour = "Recruit's Armour set";
							Health = Health - Extra_Health;
							Cunning = Cunning - Extra_Cunning;
							Extra_Health = 80;
							Extra_Cunning = 0;
							Health = Health + Extra_Health;
							Cunning = Cunning + Extra_Cunning;
							Coins = Coins - 100;
							wb.purchase();
							break;
						}
						else if(dson3 == 1 && Coins < 100) {
							wb.notEnoughMoney();
						}
						else if(dson3 == 2 && Coins > 129) {
							armour = "Veterian armour set";
							Health = Health - Extra_Health;
							Cunning = Cunning - Extra_Cunning;
							Extra_Health = 120;
							Extra_Cunning = 0;
							Health = Health + Extra_Health;
							Cunning = Cunning + Extra_Cunning;
							Coins = Coins - 130;
							wb.purchase();
							break;
						}
						else if(dson3 == 2 && Coins < 130) {
							wb.notEnoughMoney();
						}
						else if(dson3 == 3 && Coins > 159) {
							armour = "Comander's armour set";
							Health = Health - Extra_Health;
							Cunning = Cunning - Extra_Cunning;
							Extra_Health = 180;
							Extra_Cunning = 0;
							Health = Health + Extra_Health;
							Cunning = Cunning + Extra_Cunning;
							Coins = Coins - 160;
							wb.purchase();
							break;
						}
						else if(dson3 == 3 && Coins < 160) {
							wb.notEnoughMoney();
						}
						else if(dson3 == 4) {
							break;
						}
						else {
							System.out.println("Not a valid input");
						}
						
					}
					
					
				}
				
				
			}
			else {
				break;
			}
		}
		
	}
	
	public static void weaponSmith() {
		Scanner sca = new Scanner(System.in);
		
		while(alive) {
			
			dialogue wb = new dialogue();
			System.out.println("");
			System.out.println("What would you like to buy?          Current weapon: "+weapon);
			System.out.println("");
			System.out.println("1. Dagger (Damage +5)                                      cost: 30 coins");
			System.out.println("2. Short Sword (Danage +10)                                cost: 65 coins");
			System.out.println("3. Long Sword (Damage +15)                                 cost: 100 coins");
			System.out.println("4. Exit shop");
			while (!sca.hasNextInt()) {
		     	System.out.println(" ");
		     	sca.nextLine();
		    }
			int distil = sca.nextInt();
			
			if(distil == 1 && Coins > 29) {
				weapon = "Dagger";
				Hit = Hit - Extra_Damage;
				Extra_Damage = 5;
				Hit = Hit + Extra_Damage;
				Coins = Coins - 30;
				wb.purchase();
			}
			else if(distil == 1 && Coins < 30) {
				wb.notEnoughMoney();
			}
			else if(distil == 2 && Coins > 64) {
				weapon = "Short Sword";
				Hit = Hit - Extra_Damage;
				Extra_Damage = 10;
				Hit = Hit + Extra_Damage;
				Coins = Coins - 65;
				wb.purchase();
			}
			else if(distil == 2 && Coins < 65) {
				wb.notEnoughMoney();
			}
			else if(distil == 3 && Coins > 99) {
				weapon = "Long Sword";
				Hit = Hit - Extra_Damage;
				Extra_Damage = 15;
				Hit = Hit + Extra_Damage;
				Coins = Coins - 100;
				wb.purchase();
			}
			else if(distil == 3 && Coins < 100) {
				wb.notEnoughMoney();
			}
			else if(distil == 4) {
				break;
			}
			
		}
	}
	
	
	
	
	
	
	
	
	public static void Dharma(int x)          ///monkir
	{
		switch(x) 
		{
		case 1:
			Dharma="Hindu";
			break;
		case 2:
			Dharma="Buddha";
			break;
		case 3:
			Dharma="Islam";
			break;
		case 4:
			Dharma="Jain";
			break;
		case 5:
			Dharma="Unbeliever";
			break;
		default:
			Dharma="error";
		}
	}

	
	static void createFile(){       //monkir
		try {
			File myObj = new File("rpg.txt");
			if (myObj.createNewFile()) {
			//System.out.println(myObj.getName()+ " file is created: " );
			} else {
			//System.out.println("File already exists.");
			}
			} catch (IOException e) {
			System.out.println("An error occurred."+e);
			e.printStackTrace();
			}
		
	}
	static void deleteFile() {
		try {
			File myObj = new File("rpg.txt");
			myObj.delete();
			
		}catch(Exception e) {
			
		}
	}
	static void readFromFile() {            //monkir
		try {
			File myObj = new File("rpg.txt");
			Scanner myReader = new Scanner(myObj);
			Name= myReader.nextLine();
			armour=myReader.nextLine();
			weapon=myReader.nextLine();
			Current_Health= myReader.nextInt();
			Coins= myReader.nextInt();
			Hit = myReader.nextInt();
			Level= myReader.nextInt();
			Renoun= myReader.nextInt();
			Prowese= myReader.nextInt();
			Reputation= myReader.nextInt();
			Cunning=myReader.nextInt();
			Glory=myReader.nextInt();
			Religion=myReader.nextInt();
			X=myReader.nextInt();
			Y=myReader.nextInt();
			ev=myReader.nextInt();
			Health=myReader.nextInt();
			faction=myReader.nextInt();
			
			Extra_Health=myReader.nextInt();
			
			Extra_Damage=myReader.nextInt();
			Extra_Cunning=myReader.nextInt();
			
			
			
			myReader.close();
			} catch (FileNotFoundException e) {
			System.out.println("An error occurred. File not found");
			createFile();
			//e.printStackTrace();
			}
	}
	static void writeToFile() {               //monkir
		try {
			FileWriter myWriter = new FileWriter("rpg.txt");
			myWriter.write( Name+"\n");
			myWriter.write( armour+"\n");
			myWriter.write( weapon+"\n");
			myWriter.write( Current_Health+"\n");
			myWriter.write( Coins+"\n");
			myWriter.write( Hit+"\n");
			myWriter.write( Level+"\n");
			myWriter.write( Renoun+"\n");
			myWriter.write( Prowese+"\n");
			myWriter.write( Reputation+"\n");
			myWriter.write( Cunning+"\n");
			myWriter.write( Glory+"\n");
			myWriter.write( Religion+"\n");
			myWriter.write( X+"\n");
			myWriter.write( Y+"\n");
			myWriter.write( ev+"\n");
			myWriter.write( Health+"\n");
			myWriter.write( faction+"\n");
			
			myWriter.write( Extra_Health+"\n");
			
			myWriter.write( Extra_Damage+"\n");
			myWriter.write( Extra_Cunning+"\n");
			
			myWriter.close();
			//System.out.println("Write function: Successfully wrote to the file.");
			} catch (IOException e) {
			System.out.println("An error occurred."+e);
			e.printStackTrace();
			}
	}
	
	static void wait(int x) {        //wait
		try {
            Thread.sleep(100*x);  // x= 0.1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	static void pressEnter() {          //pressEnter
		try{System.in.read();}
        catch(Exception e){}
System.out.println("");
	}
	public static void run() {         //run the game
		System.out.println("\r\n"
				+ "         ######  ######   ######    \r\n"
				+ "         ##   ## ##   ## ##         \r\n"
				+ "         ######  ######  ##   ##    \r\n"
				+ "         ##   ## ##      ##    ##   \r\n"
				+ "         ##   ## ##       ######    ");
		wait(15);
		System.out.println("   This game is created by");
		wait(4);
		System.out.print("   Shohan");
		wait(4);
		System.out.print(", Abdullah");
		wait(4);
		System.out.println(" & Monkir  \n");
		wait(4);
		System.out.println("   Enter to run the game \n");
		pressEnter();
		menu();
		
	}
	private static void menu() {             //main menu
		
		if (new File("rpg.txt").exists()==false) 
		{
			breakln();
			System.out.println("\r\n"
					+ "            ###### ########  #####  ######  ######## \r\n"
					+ "           ##         ##    ##   ## ##   ##    ##    \r\n"
					+ "            #####     ##    ####### ######     ##    \r\n"
					+ "                ##    ##    ##   ## ##   ##    ##    \r\n"
					+ "           ######     ##    ##   ## ##   ##    ##    \r\n"
					+ "                                          \r\n"
					);
			System.out.println(
					  "   Enter 1 To start OR 0 to exit");
			int i = 0;
			try {
				i=new Scanner(System.in).nextInt();
				switch(i) 
		        {  
		               
		              case 1: start();
		              break;
		              //case 2: cont();
		              //break;  
		              case 0:exit(1);
		              break;
		              default: 
		            	  wrongInput();
		            	  menu();
			}
			}catch (Exception e) {
				System.out.println("             "+e);
				wrongInput();
				menu();
				
			}

			
		}else
		{
			breakln();
			System.out.println("\r\n"
					+ "            ###### ########  #####  ######  ######## \r\n"
					+ "           ##         ##    ##   ## ##   ##    ##    \r\n"
					+ "            #####     ##    ####### ######     ##    \r\n"
					+ "                ##    ##    ##   ## ##   ##    ##    \r\n"
					+ "           ######     ##    ##   ## ##   ##    ##    \r\n"
					+ "                                          \r\n"
					+ "\r\n"
					+ "   #####   #####  ###   ## ######## ## ###   ## ##    ## ####### \r\n"
					+ "  ##   ## ##   ## ####  ##    ##    ## ####  ## ##    ## ##      \r\n"
					+ "  ##      ##   ## ## ## ##    ##    ## ## ## ## ##    ## #####   \r\n"
					+ "  ##   ## ##   ## ##  ####    ##    ## ##  #### ##    ## ##      \r\n"
					+ "   #####   #####  ##   ###    ##    ## ##   ###  ######  ####### \r\n"
					+ "                                                               ");
			System.out.println(
					  "   Enter 1 To start or enter 2 to continue \n"
					+ "               OR 0 to exit");
			int i = 0;
			try {
				Scanner sc=new Scanner(System.in);
				i=sc.nextInt();
				switch(i) 
		        {  
		               
		              case 1: start();
		              break;
		              case 2: cont();
		              break;  
		              case 0:exit(1);
		              break;
		              default: {
		            	  wrongInput();
		            	  menu();
		              }
		            	  
			}
			}catch (Exception e) {
				System.out.println("             "+e);
				wrongInput();
				menu();
				
			}

		}
		
		
		
		 
        
         }
	private static void breakln() {
		System.out.println("");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("");
	}
	
	private static void exit(int x) {      // exit from the game
		try {
			System.out.println("\n      Are you sure to exit this game?\n"
					+ "  1. Yes      2. No");
			
			int i=new Scanner(System.in).nextInt();
			if (i==1){
	            	  breakln();
		  				System.out.println("        Successfully Exited\n");
		  				wait(5);
		  				System.out.println("   Thanks for playing this game");
		  				exit=1;
	              }
	            	  
	  				
			else if (i==2){

				breakln();
	  			System.out.println("Not Exited");
				if (x==1) {
		  			menu();
		  			}
		  	else if (x==2) {
		  			//ShowStats();
		  			//optioin();
		  			conting();
		  			}
	              }
	      else {
	            breakln();
	  			//wrongInput();
	  			//ShowStats();
	  			exit(x);
	  			}
		}catch(Exception e) {
			breakln();
			System.out.println("             "+e);
			//wrongInput();
			//ShowStats();
			exit(x);
		}
				
	}
	private static void toMenu() {
		try {
			System.out.println("     Are you sure to go to menu?\n"
					+ "   1. Yes      2. No");
			
			int i=new Scanner(System.in).nextInt();
			switch(i) {
			case 1: 
				breakln();
				System.out.println("    You decided Yes");
				wait(6);
				menu();
				break;
			case 2: 
				breakln();
				System.out.println("You decided No");
				//ShowStats();
				//optioin();
				conting();
				break;
			default:
				breakln();
				//breakln();
				wrongInput();
				//ShowStats();
				toMenu();
			
			}

		}catch(Exception e) {
			breakln();
			System.out.println("             "+e);
			wrongInput();
			//ShowStats();
			toMenu();
		}
		
	};
	private static void optioin() {      //monkir
		wait(4);
		System.out.println(
				 "      Enter O to exit 1 to leave");
		try {
			int i =new Scanner(System.in).nextInt();
			switch(i) 
			{
			case 0:
				exit(2);
				break;
			case 1:
				toMenu();
				break;
			default:
				breakln();
				wrongInput();
				ShowStats();
				optioin();
			}

		}catch(Exception e){
			breakln();
			System.out.println("             "+e);
			wrongInput();
			ShowStats();
			optioin();
		}
		

	}
	private static void wrongInput() {
		System.out.println("   Wrong Input. Please Try again");
  	  wait(5);
  	  //menu();
		
	}
	
	
	
	private static void start() {            //start the game
		//System.out.print("Enter Name :");
		//Name = new Scanner(System.in).nextLine();
		//Rel();
		createFile();
		deleteFile();
		
		System.out.println("\r\n"
				+ "   ###### ########  #####  ######  ######## ## ###   ##  ######  \r\n"
				+ "  ##         ##    ##   ## ##   ##    ##    ## ####  ## ##       \r\n"
				+ "   #####     ##    ####### ######     ##    ## ## ## ## ##   ##  \r\n"
				+ "       ##    ##    ##   ## ##   ##    ##    ## ##  #### ##    ## \r\n"
				+ "  ######     ##    ##   ## ##   ##    ##    ## ##   ###  ######  \r\n"
				+ "                                                               ");
		wait(6);
		System.out.println("          Started");
		breakln();
		starting();
		//ShowStats();
		//optioin();
		
	}
	private static void cont() {               //continue form previous game data
		
		readFromFile();
		System.out.println("\r\n"
				+ "  ##       #####   #####  ######  ## ###   ##  ######  \r\n"
				+ "  ##      ##   ## ##   ## ##   ## ## ####  ## ##       \r\n"
				+ "  ##      ##   ## ####### ##   ## ## ## ## ## ##   ##  \r\n"
				+ "  ##      ##   ## ##   ## ##   ## ## ##  #### ##    ## \r\n"
				+ "  #######  #####  ##   ## ######  ## ##   ###  ######  \r\n"
				+ "                                                     ");
		wait(6);
		System.out.println("         Continued");
		breakln();
		conting();
		//ShowStats();
		//optioin();
	}
	public static void move(int m)
	{
		if (m==1)
		{
			X = X + 1;
		}
		else if (m==2)
		{
			X = X - 1;
		}
		else if (m==3)
		{
			Y = Y + 1;
		}
		else if (m==4)
		{
			Y = Y - 1;
		}
		else if (m==5)
		{
			Current_Health = Health;
		}
		else if (m==6)
		{
			ShowStats();
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
		}
		else if (m==7)
		{
			toMenu();
		}
		else if (m==8)
		{
			exit(2);
			exit=1;
		}
	}
	public static void move(int m, int n)
	{
		move(m);
		move(n);
		
	}
	public static void conting() {
		while(alive == true && exit ==0) {
			
			breakln();
			
			dialogue dl = new dialogue();
			Grid();
			dl.Move();
			Scanner scan2 = new Scanner(System.in);
			while (!scan2.hasNextInt()) {
		     	System.out.println(" ");
		     	scan2.nextLine();
		    }
			int move = scan2.nextInt();
			if(0<=move && move<=4 ) {
				move(move);
				writeToFile();
				conting2();
			}
			else if(5<=move && move<=8)
			{
				move(move);
			}
			else if (10<move && move<50)
			{
				int i =move%10;
				int j=move/10;
				if (i==1)
				{
					if(j==3)
					{
						move(i,j);
						writeToFile();
						conting2();
					}
					else if(j==4)
					{
						move (i,j);
						writeToFile();
						conting2();
					}
					else {
						System.out.println("Try again ");
					}
				}
				else if (i==2) {
					if(j==3)
					{
						move(i,j);
						writeToFile();
						conting2();
					}
					else if(j==4)
					{
						move (i,j);
						writeToFile();
						conting2();
					}
					else {
						System.out.println("Try again ");
					}
				}
				else if (i==3)
				{
					if(j==1)
					{
						move(i,j);
						writeToFile();
						conting2();
					}
					else if(j==2)
					{
						move (i,j);
						writeToFile();
						conting2();
					}
					else {
						System.out.println("Try again ");
					}
				}
				else if (i==4)
				{
					if(j==1)
					{
						move(i,j);
						writeToFile();
						conting2();
					}
					else if(j==2)
					{
						move (i,j);
						writeToFile();
						conting2();
					}
					else {
						System.out.println("Try again ");
					}
				}
				else {
					System.out.println("Try again ");
				}
				
			}
			else {
				System.out.println("Try again ");
			}
			
			
			
		}
		//conting2();
		
	}
	
	public static void conting2() {
		//conting();
		dialogue dl= new dialogue();
		if( Y > 20) {
			Y = Y - 1;
			System.out.println("You Can not go further North into Tibet.");
			writeToFile();
		}
		else if( Y < -30) {
			Y = Y + 1;
			System.out.println("You Can not go further South into the sea.");
			writeToFile();
		}
		else if( X > 35) {
			X = X - 1;
			System.out.println("You Can not go further East into Burma.");
			writeToFile();
		}
		else if( X < -35) {
			X = X + 1;
			System.out.println("You Can not go further West into Abbasid Caliphate.");
			writeToFile();
		}
		else {
			Grid();
		}
		
		
		event = new Random().nextInt(11);
		Event_System(event);
		
		if(dead ) {
			alive = false;
			dl.endgame();
			pressEnter();
			menu();
			
			
		}
		
		
		if(X == 0 && Y == 0) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				city ct=new Bhopal();
				ct.option();
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {
				    	while(alive) {
				    		ConvertToRel cr=new ConvertToHindu();
				    		cr.relPlace();
				    		while (!in2.hasNextInt()) {
							      System.out.println("Input is not a number.");
							      in2.nextLine();
							    }
							    int mandir = in2.nextInt();
							    
							    if(mandir == 1 && Religion == 1) {
							    	cr.scholarRel();
							    }
							    else if(mandir == 1 && Religion != 1) {
							    	cr.RelInf();
							    }
							    else if(mandir == 2 && Religion == 1) {
							    	cr.pray();
							    }
							    else if(mandir == 2 && Religion != 1) {
							    	cr.RelConv();
						    		while (!in2.hasNextInt()) {
									      System.out.println("Input is not a number.");
									      in2.nextLine();
									    }
									    int mn = in2.nextInt();
									    
									    if(mn == 1 && faction > 0) {
									    	String ss = "Pandit";
									    	dl.factionpblm(ss);
									    }
									    else if(mn == 1 && faction == 0) {
									    	ConvertToHindu();
									    }
							    }
							    else {
							    	break;
							    }
							    
				    	}
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Rashtrakuta";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 3;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
			
		}
		else if(X == 30 && Y == 3) {
			ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				city ct = new Dhaka();
				ct.option();
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {
				    	ConvertToRel cr=new ConvertToBuddhist();
				    	while(alive) {
				    		cr.relPlace();
				    		while (!in2.hasNextInt()) {
							      System.out.println("Input is not a number.");
							      in2.nextLine();
							    }
							    int pagoda = in2.nextInt();
							    
							    if(pagoda == 1 && Religion == 2) {
							    	cr.scholarRel();
							    }
							    else if(pagoda == 1 && Religion != 2) {
							    	cr.RelInf();
							    }
							    else if(pagoda == 2 && Religion == 2) {
							    	cr.pray();
							    }
							    else if(pagoda == 2 && Religion != 2) {
							    	cr.RelConv();
						    		while (!in2.hasNextInt()) {
									      System.out.println("Input is not a number.");
									      in2.nextLine();
									    }
									    int pg = in2.nextInt();
									    
									    if(pg == 1 && faction > 0) {
									    	String ss = "Priest";
									    	dl.factionpblm(ss);
									    }
									    else if(pg == 1 && faction == 0) {
									    	ConvertToBuddhism();
									    }
							    }
							    else {
							    	break;
							    }
							    
				    	}
				    	pressEnter();
				    	
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Pala";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 1;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else if(X == 25 && Y == 7) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				
				city ct = new Patliputra();
				ct.option();
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {

				    	ConvertToRel cr=new ConvertToBuddhist();
				    	while(alive) {
				    		cr.relPlace();
				    		while (!in2.hasNextInt()) {
							      System.out.println("Input is not a number.");
							      in2.nextLine();
							    }
							    int pagoda = in2.nextInt();
							    
							    if(pagoda == 1 && Religion == 2) {
							    	cr.scholarRel();
							    }
							    else if(pagoda == 1 && Religion != 2) {
							    	cr.RelInf();
							    }
							    else if(pagoda == 2 && Religion == 2) {
							    	cr.pray();
							    }
							    else if(pagoda == 2 && Religion != 2) {
							    	cr.RelConv();
						    		while (!in2.hasNextInt()) {
									      System.out.println("Input is not a number.");
									      in2.nextLine();
									    }
									    int pg = in2.nextInt();
									    
									    if(pg == 1 && faction > 0) {
									    	String ss = "Priest";
									    	dl.factionpblm(ss);
									    }
									    else if(pg == 1 && faction == 0) {
									    	ConvertToBuddhism();
									    }
							    }
							    else {
							    	break;
							    }
							    
				    	}
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Pala";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 1;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else if( X == 5 && Y == 13) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				
				city ct= new Ayudha();
				ct.option();
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {

				    	while(alive) {
				    		ConvertToRel cr=new ConvertToHindu();
				    		cr.relPlace();
				    		while (!in2.hasNextInt()) {
							      System.out.println("Input is not a number.");
							      in2.nextLine();
							    }
							    int mandir = in2.nextInt();
							    
							    if(mandir == 1 && Religion == 1) {
							    	cr.scholarRel();
							    }
							    else if(mandir == 1 && Religion != 1) {
							    	cr.RelInf();
							    }
							    else if(mandir == 2 && Religion == 1) {
							    	cr.pray();
							    }
							    else if(mandir == 2 && Religion != 1) {
							    	cr.RelConv();
						    		while (!in2.hasNextInt()) {
									      System.out.println("Input is not a number.");
									      in2.nextLine();
									    }
									    int mn = in2.nextInt();
									    
									    if(mn == 1 && faction > 0) {
									    	String ss = "Pandit";
									    	dl.factionpblm(ss);
									    }
									    else if(mn == 1 && faction == 0) {
									    	ConvertToHindu();
									    }
							    }
							    else {
							    	break;
							    }
							    
				    	}
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Ayutha";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 4;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();
				    }
				    else {
				    	
				    }
			}
		}
		else if( X == -12 && Y == 12) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				city ct= new Delhi();
				ct.option();
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {

				    	while(alive) {
				    		ConvertToRel cr=new ConvertToHindu();
				    		cr.relPlace();
				    		while (!in2.hasNextInt()) {
							      System.out.println("Input is not a number.");
							      in2.nextLine();
							    }
							    int mandir = in2.nextInt();
							    
							    if(mandir == 1 && Religion == 1) {
							    	cr.scholarRel();
							    }
							    else if(mandir == 1 && Religion != 1) {
							    	cr.RelInf();
							    }
							    else if(mandir == 2 && Religion == 1) {
							    	cr.pray();
							    }
							    else if(mandir == 2 && Religion != 1) {
							    	cr.RelConv();
						    		while (!in2.hasNextInt()) {
									      System.out.println("Input is not a number.");
									      in2.nextLine();
									    }
									    int mn = in2.nextInt();
									    
									    if(mn == 1 && faction > 0) {
									    	String ss = "Pandit";
									    	dl.factionpblm(ss);
									    }
									    else if(mn == 1 && faction == 0) {
									    	ConvertToHindu();
									    }
							    }
							    else {
							    	break;
							    }
							    
				    	}
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Ayutha";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 4;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else if( X == -30 && Y == 2) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				city ct = new Roruka();
				ct.option();
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {
				    	while(alive) {
				    		ConvertToRel cr=new ConvertToIslam();
				    		cr.relPlace();
					    	while (!in2.hasNextInt()) {
							      System.out.println("Input is not a number.");
							      in2.nextLine();
							    }
							    int mosque = in2.nextInt();
							    
							    if(mosque == 1 && Religion == 3) {
							    	cr.scholarRel();
							    }
							    else if(mosque == 1 && Religion != 3) {
							    	cr.RelInf();
							    }
							    else if(mosque == 2 && Religion == 3) {
							    	cr.pray();
							    }
							    else if(mosque == 2 && Religion != 3) {
							    	cr.RelConv();
							    	while (!in2.hasNextInt()) {
									      System.out.println("Input is not a number.");
									      in2.nextLine();
									    }
									    int ds907 = in2.nextInt();
									    
									    if(ds907 == 1 && faction > 0) {
									    	String ss = "Imam";
									    	dl.factionpblm(ss);
									    }
									    else if(ds907 == 1 && faction == 0){
									    	ConvertToIslam();
									    }
							    }
							    else {
							    	break;
							    }
							    
				    	}
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Sindh";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 2;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else if( X == -25 && Y == 10) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				
				city ct= new Bhatinda();
				ct.option();
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {
				    	while(alive) {
				    		ConvertToRel cr=new ConvertToIslam();
				    		cr.relPlace();
					    	while (!in2.hasNextInt()) {
							      System.out.println("Input is not a number.");
							      in2.nextLine();
							    }
							    int mosque = in2.nextInt();
							    
							    if(mosque == 1 && Religion == 3) {
							    	cr.scholarRel();
							    }
							    else if(mosque == 1 && Religion != 3) {
							    	cr.RelInf();
							    }
							    else if(mosque == 2 && Religion == 3) {
							    	cr.pray();
							    }
							    else if(mosque == 2 && Religion != 3) {
							    	cr.RelConv();
							    	while (!in2.hasNextInt()) {
									      System.out.println("Input is not a number.");
									      in2.nextLine();
									    }
									    int ds907 = in2.nextInt();
									    
									    if(ds907 == 1 && faction > 0) {
									    	String ss = "Imam";
									    	dl.factionpblm(ss);
									    }
									    else if(ds907 == 1 && faction == 0){
									    	ConvertToIslam();
									    }
							    }
							    else {
							    	break;
							    }
							    
				    	}
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Sindh";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 2;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else if( X == -10 && Y == -2) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				
				city ct= new Rajkot();
				ct.option();
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {
				    	System.out.println("You can not convert to or Join Jain Kingdoms (Holy Fury DLC Required)");
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	System.out.println("You can not convert to or Join Jain Kingdoms (Holy Fury DLC Required)");
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else if( X == -3 && Y == -8) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				
				city ct = new Surat();
				ct.option();
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {
				    	System.out.println("You can not convert to or Join Jain Kingdoms (Holy Fury DLC Required)");
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	System.out.println("You can not convert to or Join Jain Kingdoms (Holy Fury DLC Required)");
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else if( X == 10 && Y == -10) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				
				city ct = new Manyakheta();
				ct.option();
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {
				    	while(alive) {
					    	while(alive) {
					    		ConvertToRel cr=new ConvertToHindu();
					    		cr.relPlace();
					    		while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int mandir = in2.nextInt();
								    
								    if(mandir == 1 && Religion == 1) {
								    	cr.scholarRel();
								    }
								    else if(mandir == 1 && Religion != 1) {
								    	cr.RelInf();
								    }
								    else if(mandir == 2 && Religion == 1) {
								    	cr.pray();
								    }
								    else if(mandir == 2 && Religion != 1) {
								    	cr.RelConv();
							    		while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int mn = in2.nextInt();
										    
										    if(mn == 1 && faction > 0) {
										    	String ss = "Pandit";
										    	dl.factionpblm(ss);
										    }
										    else if(mn == 1 && faction == 0) {
										    	ConvertToHindu();
										    }
								    }
								    else {
								    	break;
								    }
								    
					    	}
					    	pressEnter();
				    }
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Kannuj";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 5;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else if( X == 20 && Y == -15) {
			int ds = 1;
			
			while(ds < 5 && ds > 0) {
				
				
				city ct = new Sinhala();
				ct.option();
				
				
				Scanner in2 = new Scanner(System.in);
				while (!in2.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      in2.nextLine();
				    }
				    int ds1 = in2.nextInt();
				    ds = ds1;
				    
				    if(ds == 1) {
				    	armory();
				    	pressEnter();
				    }
				    else if(ds == 2) {
				    	weaponSmith();
				    	pressEnter();
				    }
				    else if(ds == 3) {

				    	ConvertToRel cr=new ConvertToBuddhist();
				    	while(alive) {
				    		cr.relPlace();
				    		while (!in2.hasNextInt()) {
							      System.out.println("Input is not a number.");
							      in2.nextLine();
							    }
							    int pagoda = in2.nextInt();
							    
							    if(pagoda == 1 && Religion == 2) {
							    	cr.scholarRel();
							    }
							    else if(pagoda == 1 && Religion != 2) {
							    	cr.RelInf();
							    }
							    else if(pagoda == 2 && Religion == 2) {
							    	cr.pray();
							    }
							    else if(pagoda == 2 && Religion != 2) {
							    	cr.RelConv();
						    		while (!in2.hasNextInt()) {
									      System.out.println("Input is not a number.");
									      in2.nextLine();
									    }
									    int pg = in2.nextInt();
									    
									    if(pg == 1 && faction > 0) {
									    	String ss = "Priest";
									    	dl.factionpblm(ss);
									    }
									    else if(pg == 1 && faction == 0) {
									    	ConvertToBuddhism();
									    }
							    }
							    else {
							    	break;
							    }
							    
				    	}
				    	pressEnter();
				    }
				    else if(ds == 4) {
				    	while(alive) {
				    		if(Glory < 200) {
				    			dl.palace_Guard();
				    			break;
				    		}
				    		else if(Glory > 199 && faction == 0) {
				    			dl.palace_Guard2();
				    			while (!in2.hasNextInt()) {
								      System.out.println("Input is not a number.");
								      in2.nextLine();
								    }
								    int sl = in2.nextInt();
								    
								    if(sl == 1) {
								    	String kingdom = "Sinhala";
								    	dl.vowSldr(kingdom);
								    	while (!in2.hasNextInt()) {
										      System.out.println("Input is not a number.");
										      in2.nextLine();
										    }
										    int s2 = in2.nextInt();
										    
										    if(s2 == 1) {
										    	dl.join(kingdom);
										    	faction = 6;
										    	bounty = true;
										    	
										    }
										    else {
										    	dl.joke();
										    	break;
										    }
								    }
								    else {
								    	dl.noTNX();
								    	break;
								    }
				    		}
				    		
				    	}
				    	pressEnter();
				    }
				    else if (ds == 5) {
				    	System.out.println("");
				    	conting();}
				    else {
				    	
				    }
			}
		}
		else {
			
		}
		
		try{System.in.read();}
			catch(Exception e){}
		try{System.in.read();}
			catch(Exception e){}
		if (exit==0) {
			conting();
		}

		
		
	}
	public static void starting() {
		alive=true;
		dead=false;
		System.out.println("");
		System.out.println("Enter Name");
		Name= new Scanner(System.in).nextLine();
		while (Name.length()<4) {
			if (Name.length()==0) {
				Name=new Scanner(System.in).nextLine();
			}
			else {
				System.out.println(
						  "   The Name must be al least 4 characters\n"
						+ "           Please try again.\n");
				System.out.print("Enter Name :");
				Name=new Scanner(System.in).nextLine();
			}
			
		}
		
		
		if(Ngame == true) {
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			Scanner sc4 = new Scanner(System.in);
			//New_Game_Dialogue New_Game_Dialogue = new New_Game_Dialogue();
			New_Game_Dialogue.arrival();
			
			
			System.out.println(" Old Man: What is your name?");
			System.out.println("");
			System.out.println("1. I am "+Name+" (Tell The Truth)");
			System.out.println("2. I am ....  (Tell a lie)");
			System.out.println("3. I would rather not tell you.");
			while (!sc1.hasNextInt()) {
		     	System.out.println(" ");
		     	sc1.nextLine();
		    }
			int dis1 = sc1.nextInt();
			
			if(dis1 == 1) {
				Hit = Hit + 5;
				Reputation = Reputation + 5;
				System.out.println(" Old Man: Good!");
			}else if(dis1 == 2) {
				Hit = Hit + 5;
				Cunning = Cunning + 5;
				System.out.println(" Old Man: Good!");
			}else {
				Hit = Hit + 5;
				Prowese = Prowese + 5;
				System.out.println(" Old Man: I see, you are wise not to trust a stranger");
				System.out.println("          in your current condition.");
			}
			
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			
			New_Game_Dialogue.culture_ques();
			while (!sc2.hasNextInt()) {
		     	System.out.println(" ");
		     	sc2.nextLine();
		    }
		    int culture = sc2.nextInt();
		    
		    if(culture == 1) {
		    	Cunning = Cunning + 5;
		    	New_Game_Dialogue.culture_dial(1);
		    }
		    else if(culture == 2) {
		    	Prowese = Prowese + 5;
		    	New_Game_Dialogue.culture_dial(2);
		    }
		    else if(culture == 3) {
		    	Hit = Hit + 5;
		    	New_Game_Dialogue.culture_dial(3);
		    }
		    else if(culture == 4) {
		    	Renoun = Renoun + 5;
		    	New_Game_Dialogue.culture_dial(4);
		    }
		    else if(culture == 5) {
		    	Reputation = Reputation + 5;
		    	New_Game_Dialogue.culture_dial(5);
		    }
		    else if(culture == 6) {
		    	Health = Health + 40;
		    	New_Game_Dialogue.culture_dial(6);
		    }
		    else if(culture == 7) {
		    	Glory = Glory + 100;
		    	New_Game_Dialogue.culture_dial(7);
		    }
		    else {
		    	New_Game_Dialogue.culture_dial(8);
		    }
			
			try{System.in.read();}
				catch(Exception e){}
			try{System.in.read();}
				catch(Exception e){}
			
			New_Game_Dialogue.relig_ques();
			while (!sc3.hasNextInt()) {
			     	System.out.println(" ");
			     	sc3.nextLine();
			    }
			    Religion = sc3.nextInt();
			
			if(Religion == 1) {
				Prowese = Prowese + 5;
				Scanner sc=new Scanner(System.in);
				
				New_Game_Dialogue.r_ques(1);
				while (!sc.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      sc.nextLine();
				    }
				    int dietyH = sc.nextInt();
				
				if(dietyH == 1) {
					Hit = Hit + 10;
				}
				else if(dietyH == 2) {
					Health = Health + 40;
				}
				else if(dietyH == 3) {
					Cunning = Cunning + 10;
				}
				else if(dietyH == 4) {
					Reputation = Reputation + 5;
				}
				else if(dietyH == 5) {
					Health = Health + 20;
					Hit = Hit + 5;
				}
				else if(dietyH == 6) {
					Renoun = Renoun + 5;
				}
				else {
					Hit = Hit + 5;
					Reputation = Reputation + 5;
					Cunning = Cunning - 5;
				}
				
			}
			else if(Religion == 2) {
				Health = Health + 50;
				
				New_Game_Dialogue.r_ques(2);
				while (! sc4.hasNextInt()) {
				      System.out.println("Input is not a number.");
				      sc4.nextLine();
				    }
				    int dietyB = sc4.nextInt();
				
				    if(dietyB == 1) {
						Renoun = Renoun + 5;
					}
					else{
						Reputation = Reputation + 5;
						Hit = Hit + 5;
					}
				
			}
			else if(Religion == 3) {
				Prowese = Prowese + 5;
				Hit = Hit + 10;
				
				System.out.println(" Old Man: A Muslim! Never thought I would see your kind around here.");
			}
			else if(Religion == 4) {
				Reputation = Reputation + 5; 
				Renoun = Renoun + 5;
				
				System.out.println(" Old Man: Ahh...So you follow the old gods. Verry well.");
			}
			else {
				Health = Health + 100;
				Hit = Hit + 10;
				Coins = Coins + 100;
				Reputation = Reputation - 1000;
				Renoun = Renoun - 1000;
				
				New_Game_Dialogue.r_ques(3);
				try{System.in.read();}
					catch(Exception e){}
				try{System.in.read();}
					catch(Exception e){}
				
			}
			
			
			New_Game_Dialogue.F_Direction();
		}
		
		if(Ngame == true) {
			Player Play = new Player();
			St(Name, Health, Coins, Hit, Level, Renoun, Prowese, Reputation, Cunning, Glory, Religion);
			Lv_Up(10);
			ShowStats();
			Play.start_warning();
			
		}
		conting();
	}


}
