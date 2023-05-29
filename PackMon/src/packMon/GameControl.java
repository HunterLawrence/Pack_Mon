package packMon;

public class GameControl {
	public Player player;
	public Monster monster;
	ConnectToDatabase connection;
	
	/***
	 * Connects to the database then Initializes the player as well as a random monster
	 */
	public GameControl()
	{
		
	}
	
	/***
	 * Method to handle a player attack
	 * @return A message of what occurred during the attack
	 */
	public String playerAttack()
	{
		/* 
		 * Should return a string detailing how much damage the player did to the monster
		 * or if the player missed (if that is a thing we want to do).
		 * 
		 * return format (playerName + " deals " + damageDelt + " to the " + monsterName + " using " + playerWeaponName + ".")
		 * 
		 * 
		 * As well as what happens if the monster is defeated
		 * 
		 *	return format ("The " + monsterName + " has been defeated! " + scoreToAdd + " points earned.")
		*/
		return "";
	}
	
	/***
	 * Method to handle the player healing
	 * @return A message detailing the health that was recovered.
	 */
	public String playerHeal()
	{
		/*
		 * Should return a string detailing how much health the player restores
		 * 
		 * return format (playerName + " regains + " + healthRestored + " health.")
		 */
		
		return "";
	}
	
	/***
	 * Method to handle a monster attack
	 * @return A message of what occurred durring the attack
	 */
	public String monsterAttack()
	{
		/*
		 * Should return a string detailing how much damage the player receives from the attack
		 * (or if the monster misses if that is something we want to do)
		 * 
		 * return format (monsterName + " deals " + damageDelt + " to " + playerName + " using " + monsterAttackName + ".")
		 * 
		 * 
		 * As well as what happens if the player is defeated
		 * 
		 * return format (playerName + " was overcome by The " + monsterName + ". " + playerName + " died with a score of " + playerScore + ".")
		 */
		return "";
	}
	
	/***
	 * A method to retrieve a new (random) monster from the database
	 * @return A string saying that a new monster appears
	 */
	public String newMonster()
	{
		/*
		 * set monster to a new monster
		 * 
		 * return format ("The " + monsterName + " appears!")
		 */
		
		return "";
	}
	
}
