import java.util.Scanner;

public class Game {
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	String playerName;
	String playerWeapon;
	boolean riddleDone;
	boolean monster;
	boolean monsterTwo;
	boolean allMonsters;
	int coin;
	int playerHealth;
	int monsterHealth;
	int monsterHealthTwo;
	int monsterHealthThree;
	int guardHealth;
	int choice;
	
	int globlinHead;
		
	public static void main(String[] args) {

		Game project;
		project = new Game();	
		project.newGame(); 	
		project.braavosGate();
	}
	
	public void newGame(){
		
		coin = 60;
		playerHealth = 100;
		monsterHealth = 50;
		monsterHealthTwo =100;
		monsterHealthThree = 150;
		guardHealth = 150;
		riddleDone = false;
		monster = false;
		monsterTwo = false;
		allMonsters = false;
		
		playerWeapon = "Knife";

		System.out.println("HP: "+ playerHealth);
		System.out.println("Gold coin: "+ coin);
		System.out.println("Weapon: "+ playerWeapon);
		
		System.out.println("Please enter your name:");
		
		playerName = myScanner.nextLine();
		
		System.out.println("Hello " + playerName + ", welcome to the game.");	
		
		
	}	
	
	public void braavosGate(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are at Braavos' Gate.");
		System.out.println("Your main goal is to get inside the City of Braavos.");
		System.out.println("\nThere is a guard in front of the entrance.");
		System.out.println("");
		System.out.println("1: Talk to the guard");
		System.out.println("2: Attack the guard (There is no coming back from this!)");
		System.out.println("3: Leave");
		System.out.println("\n------------------------------------------------------------------\n");
		choice = myScanner.nextInt();
		
		if(choice==1){
			if(globlinHead==1){
				gameEnd();
			}
			else{
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("Guard: Stop right there stranger. So your name is " + playerName + "?"
							+ " We cannot let strangers pass through this gate, \nbut if you prove yourself useful by bringing me the Globin's head from the monster's cave, I'll let you enter.");
				System.out.println("\nPress enter to continue");
				System.out.println("\n------------------------------------------------------------------\n");
				enterScanner.nextLine();
				braavosGate();
			}
			
		}
		else if(choice==2){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Guard: You've made a huge mistake!");
			guardEngagement();
			
		}
		else if(choice==3){
			crossRoad();
		}	
		else{
			braavosGate();
		}
	}
	public void guardCombat(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Your HP: "+ playerHealth);
		System.out.println("Guard HP: " + guardHealth);
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1: Attack");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			guardEngagement();
		
		}
		else{
			guardCombat();
		}
	}
	
	public void guardEngagement(){
		
		int playerDamage = 0;
		
		
		if(playerWeapon.equals("Knife")){
			playerDamage = new java.util.Random().nextInt(15); 
		}
		else if(playerWeapon.equals("Magical Long Sword")){
			playerDamage = new java.util.Random().nextInt(45); 
		}
		
		System.out.println("\nYou attacked the guard, causing " + playerDamage + " damage!");
		
		guardHealth = guardHealth - playerDamage;
		
		
		if(guardHealth<1){ gameEndTwo(); } else if(guardHealth>0){
			int guardDamage =0;
			
			guardDamage = new java.util.Random().nextInt(35);
			
			System.out.println("The guard attacked you, causing " + guardDamage + " damage!");
			
			playerHealth = playerHealth - guardDamage;
			
			
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				guardCombat();
			}
		}
		
		
		
	}
	public void crossRoad(){
	
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are at a crossroad.\n");
		System.out.println("1: Go to the Temple");
		System.out.println("2: Go to the strange forest");
		System.out.println("3: Go back to Braavos' Gate");
		System.out.println("4: Go into the Monster's cave");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			temple();
		}
		else if(choice==2){
			forest();
		}
		else if(choice==3){
			braavosGate();
		}
		else if(choice==4){
			monsterCave();
		}
		else{
			crossRoad();
		}
	}
	
	public void temple(){
	
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("There is a priest. You can spend 20 gold coins to fully heal.");
		System.out.println("HP: " + playerHealth);
		System.out.println("Gold coin: " + coin);
		System.out.println("\n1: Spend 20 gold coins");
		System.out.println("2: Go back to the crossroad");
		System.out.println("\n------------------------------------------------------------------\n");
	
		choice = myScanner.nextInt();
		
		if (choice==1) {
			if (coin >= 20) {
			playerHealth = 100;
			coin = coin - 20;
			System.out.println("Your HP is recovered.");
			System.out.println("HP: "+ playerHealth);
			System.out.println("\nPress enter to continue");
			enterScanner.nextLine();
			temple();
			}
			else {
				System.out.println("\nYou do not have enough gold coin.");
				temple();
			}
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			temple();
		}
	}
	
	public void forest(){
		
		if(riddleDone == true) {
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("There is nothing else for you here.");
			System.out.println("1: Return to Crossraod");
			System.out.println("\n------------------------------------------------------------------\n");
				
			choice = myScanner.nextInt();
				
			if(choice==1){
				crossRoad();
			}
			
			else{
				forest();
			}
			
		}
		else {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You walked into a strange forest and discovered the Statue of Riddles!");
		System.out.println("\n1: Go back to the crossroad");
		System.out.println("2: Attempt the riddles");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			crossRoad();
		}
		else if(choice==2){
			riddle();
		}
		else{
			forest();
		}
	}
	}
	
	public void riddle() {
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Statue of Riddles: Answer my three riddles and a powerful weapon shall be yours.");
		System.out.println("\nAlive as you but without breath, as cold in my life as in my death; never a thirst though I always drink, dressed in a mail but never a clink.\n");
		System.out.println("1: Winter");
		System.out.println("2: Fish");
		System.out.println("3: Water");
		System.out.println("4: Specter");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else if(choice==2){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Your answer is satisfactory.");
			riddleTwo();
		}
		else if(choice==3){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else if(choice==4){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else{
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
	}
	
	public void riddleTwo() {
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("\nOf all your possessions, I am the hardest to guard. If you have me, you will want to share me. If you share me, you no longer have me.\n");
		System.out.println("1: Your life");
		System.out.println("2: Good intentions");
		System.out.println("3: A secret");
		System.out.println("4: Hatred");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else if(choice==2){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else if(choice==3){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Your answer is satisfactory.");
			riddleThree();
		}
		else if(choice==4){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else{
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
	}
	public void riddleThree() {
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("\nThey come to witness the night without being called, a sailor's guide and a poet's tears. They are lost to sight each day without the hand of a thief.\n");
		System.out.println("1: Stars");
		System.out.println("2: The gods");
		System.out.println("3: Lovers");
		System.out.println("4: Mourners");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: You have answered true the three riddles.");
			System.out.println("Rewarded are you for the wit of ages.");
			System.out.println("You have obtained the magical long sword.");
			playerWeapon = "Magical Long Sword";
			System.out.println("Your Weapon: "+ playerWeapon);
			riddleDone = true;
			crossRoad();
			}
		else if(choice==2){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else if(choice==3){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else if(choice==4){
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
		else{
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("Statue of Riddles: Your answer is unsatisfactory!");
			System.out.println("The Statue cast a fiery spell from its eyes causing 15 damange!");
			playerHealth = playerHealth - 15;
			System.out.println("Your HP: " + playerHealth);
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				forest();
			}
		}
	}
	public void monsterCave(){
		
		if(monster == false) {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You encounter a Gaint Rat!\n");
		System.out.println("1: Fight");
		System.out.println("2: Run");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			giantRatEngagement();
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			monsterCave();
		}
	}
		else if(monster == true && monsterTwo == false) {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You encounter a Wolf!\n");
		System.out.println("1: Fight");
		System.out.println("2: Run");
		System.out.println("\n------------------------------------------------------------------\n");
			
		choice = myScanner.nextInt();
			
		if(choice==1){
			wolfEngagement();
		}
		else if(choice==2){
				crossRoad();
		}
		else{
			monsterCave();
		}
		}
		else if(monster == true && monsterTwo == true && allMonsters == false) {
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("You encounter the Globin!\n");
			System.out.println("1: Fight");
			System.out.println("2: Run");
			System.out.println("\n------------------------------------------------------------------\n");
				
			choice = myScanner.nextInt();
				
			if(choice==1){
				globinEngagement();
			}
			else if(choice==2){
					crossRoad();
			}
			else{
				monsterCave();
			}
			}
		
		else if(allMonsters == true) {
			
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("There is nothing else for you here.");
			System.out.println("1: Return to Crossraod");
			System.out.println("\n------------------------------------------------------------------\n");
				
			choice = myScanner.nextInt();
				
			if(choice==1){
				crossRoad();
			}
			
			else{
				monsterCave();
			}
			}
	}	
	
	
	public void giantRatEngagement(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Your HP: "+ playerHealth);
		System.out.println("Giant rat HP: " + monsterHealth);
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1: Attack");
		System.out.println("2: Run\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			combat();
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			giantRatEngagement();
		}
	}
	
	public void combat(){
		int playerDamage = 0;
		
		
		if(playerWeapon.equals("Knife")){
			playerDamage = new java.util.Random().nextInt(15); 
		}
		else if(playerWeapon.equals("Magical Long Sword")){
			playerDamage = new java.util.Random().nextInt(45); 
		}
		
		System.out.println("You attacked the giant rat, causing " + playerDamage + " damage!");
		
		monsterHealth = monsterHealth - playerDamage;
		
		System.out.println("Giant Rat HP: " + monsterHealth);
		
		if(monsterHealth<1){ victory(); } else if(monsterHealth>0){
			int monsterDamage =0;
			
			monsterDamage = new java.util.Random().nextInt(10);
			
			System.out.println("The giant rat attacked you, causing " + monsterDamage + " damage!");
			
			playerHealth = playerHealth - monsterDamage;
			
			System.out.println("Player HP: " + playerHealth);
			
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				giantRatEngagement();
			}
		}
		
		
	}
	
	public void wolfEngagement(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Your HP: "+ playerHealth);
		System.out.println("Wolf HP: " + monsterHealthTwo);
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1: Attack");
		System.out.println("2: Run\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			combatTwo();
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			wolfEngagement();
		}
	}
	
	public void combatTwo(){
		int playerDamage = 0;
		
		
		if(playerWeapon.equals("Knife")){
			playerDamage = new java.util.Random().nextInt(15); 
		}
		else if(playerWeapon.equals("Magical Long Sword")){
			playerDamage = new java.util.Random().nextInt(45); 
		}
		
		System.out.println("You attacked the wolf, causing " + playerDamage + " damage!");
		
		monsterHealthTwo = monsterHealthTwo - playerDamage;
		
		System.out.println("Wolf HP: " + monsterHealthTwo);
		
		if(monsterHealthTwo<1){ victoryTwo(); } else if(monsterHealthTwo>0){
			int monsterDamage =0;
			
			monsterDamage = new java.util.Random().nextInt(20);
			
			System.out.println("The wolf attacked you, causing " + monsterDamage + " damage!");
			
			playerHealth = playerHealth - monsterDamage;
			
			System.out.println("Player HP: " + playerHealth);
			
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				wolfEngagement();
			}
		}
		
		
	}
	
	public void globinEngagement(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Your HP: "+ playerHealth);
		System.out.println("Globin HP: " + monsterHealthThree);
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1: Attack");
		System.out.println("2: Run\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			combatThree();
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			globinEngagement();
		}
	}
	
	public void combatThree(){
		int playerDamage = 0;
		
		
		if(playerWeapon.equals("Knife")){
			playerDamage = new java.util.Random().nextInt(15); 
		}
		else if(playerWeapon.equals("Magical Long Sword")){
			playerDamage = new java.util.Random().nextInt(45); 
		}
		
		System.out.println("You attacked the globin, causing " + playerDamage + " damage!");
		
		monsterHealthThree = monsterHealthThree - playerDamage;
		
		System.out.println("Globin HP: " + monsterHealthThree);
		
		if(monsterHealthThree<1){ victoryThree(); } else if(monsterHealthThree>0){
			int monsterDamage =0;
			
			monsterDamage = new java.util.Random().nextInt(40);
			
			System.out.println("The globin attacked you, causing " + monsterDamage + " damage!");
			
			playerHealth = playerHealth - monsterDamage;
			
			System.out.println("Player HP: " + playerHealth);
			
			if(playerHealth<1){ death(); } else if(playerHealth>0){
				globinEngagement();
			}
		}
		
		
	}
	public void death(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You have been slain!");
		System.out.println("\nGAME OVER");
		System.out.println("\nThank you for playing!");
		System.out.println("\n------------------------------------------------------------------\n");
		
	}
	
	public void victory(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the Gaint Rat!");
		System.out.println("Item obtained: 10 gold coins");
		coin = coin + 10;
		System.out.println("Gold coin: " + coin);
		System.out.println("\n1: Venture deeper into the cave");
		System.out.println("2: Return to the Crossroad");
		System.out.println("\n------------------------------------------------------------------\n");
		
		monster = true;
		
		choice = myScanner.nextInt();
		if(choice==1){
			System.out.println("You encounter a Wolf!");
			wolfEngagement();
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			crossRoad();
		}
		
	}
	
	public void victoryTwo(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the Wolf!");
		System.out.println("Item obtained: 10 gold coins");
		coin = coin + 10;
		System.out.println("Gold coin: " + coin);
		System.out.println("\n1: Venture deeper into the cave");
		System.out.println("2: Return to the Crossroad");
		System.out.println("\n------------------------------------------------------------------\n");
		
		monsterTwo = true;
		
		choice = myScanner.nextInt();
		if(choice==1){
			System.out.println("You encounter the Globin!");
			globinEngagement();
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			crossRoad();
		}
		
	}

	public void victoryThree(){
	
	System.out.println("\n------------------------------------------------------------------\n");
	System.out.println("You killed the Globin!");
	System.out.println("Item obtained: Globin's Head");
	globlinHead = 1;
	System.out.println("\n1: Return to the Crossroad");
	System.out.println("\n------------------------------------------------------------------\n");
	
	allMonsters = true;
	
	choice = myScanner.nextInt();
	if(choice==1){
		crossRoad();
	}
	else{
		crossRoad();
	}
	
}
	
	public void gameEnd(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Guard: Is that the head of the Globin?!");
		System.out.println("Guard: We need more heroic man like you! Welcome to the City of Braavos!");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
	
	public void gameEndTwo(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the guard.");
		System.out.println("The guard dropped a key for Braavos' Gate!");
		System.out.println("You can now freely enter the City of Braavos!");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
		
	}
}
