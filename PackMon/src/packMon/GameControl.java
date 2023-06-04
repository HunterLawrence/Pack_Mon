package packMon;

public class GameControl {
	public Player player;
	public Monster monster;
	public Weapon weapon;
	private ConnectToDatabase connection;

	public int pointScore;
	
	/***
	 * Connects to the database then Initializes the player as well as a random monster
	 */
	public GameControl()
	{
		connection = new ConnectToDatabase();
		connection.connect();
		weapon = new Weapon(10, "Shredder", 00);
		player = new Player(00, "Tento", weapon, 100);
		try {
			monster = connection.retrieveMonster();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
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
		if(player.getHP() == 0)
		{
			return player.getName() + " cannot attack while dead...";
		}
		else
		{
			int damageDelt = player.attack();
	
			String str = "";
	
			if(damageDelt >= monster.getHP()){
				monster.setHealth(0);
				pointScore += 10;
				str = "The " + monster.getName() + " has been defeated! 10 points earned.";
			}else if (damageDelt < monster.getHP()){
				monster.setHealth(monster.getHP() - damageDelt);
				str = player.getName() + " deals " + damageDelt + " to the " + monster.getName() + " using " + weapon.getName() + ".";
			}
	
			return str;
		}
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
		if(player.getHP() == 0)
		{
			return player.getName() + " cannot heal while dead...";
		}
		else
		{
			int potion = 50;
			int playerPreviousHealth = player.getHP();
			player.heal(potion);
			
			int playerHealthRegained = player.getHP() - playerPreviousHealth;
			String str = player.getName() + " regains " + playerHealthRegained + " health.";
			return str;
		}
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
		int monsterDamageDelt = monster.attack();

		String str = "";

		if(monsterDamageDelt >= player.getHP()){
			player.setHealth(0);
			str = player.getName() + " was overwhelmed by the " + monster.getName() + ". " + player.getName() + " died with a score of " + pointScore + ".";
		}else if (monsterDamageDelt < player.getHP()){
			player.setHealth(player.getHP() - monsterDamageDelt);
			str = monster.getName() + " deals " + monsterDamageDelt + " to " + player.getName() + " using " + monster.getAttackName() + ".";
		}

		return str;
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
		try {
			monster = connection.retrieveMonster();
		}
		catch(Exception e)
		{
			
		}

		String str = "The " + monster.getName() + " appears!";

		return str;
	}
	
}
