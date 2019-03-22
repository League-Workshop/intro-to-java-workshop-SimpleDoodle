package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		Random gen= new Random();
		int a=gen.nextInt(11);
		int b=gen.nextInt(26);
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth=100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth=100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage=20;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage=40;
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) { 
			String attack=JOptionPane.showInputDialog(null, "Do you want to attack the dragon with a pokeball or shout?");
	if(attack.equals("pokeball")) {
		playerDamage=gen.nextInt(11);
		dragonHealth=dragonHealth-playerDamage;
		JOptionPane.showMessageDialog(null, "Your pokeball delt " +playerDamage+ " damage!");
		JOptionPane.showMessageDialog(null,"The dragon has " +dragonHealth+ " health left.");
	}
	if(attack.equals("shout")) {
		playerDamage=gen.nextInt(26);
		dragonHealth=dragonHealth-playerDamage;
	JOptionPane.showMessageDialog(null, "Your shout delt " +playerDamage+ " damage!");
	JOptionPane.showMessageDialog(null,"The dragon has " +dragonHealth+ " health left.");
	}
	}
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		
		// 9. If they typed in "yell":
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}

