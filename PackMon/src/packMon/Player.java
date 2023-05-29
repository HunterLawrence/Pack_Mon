package packMon;

//Importing the random class for the attack method
import java.util.Random;

/*
 * Player class for the PackMon game
 */
public class Player {

	// Fields
	private int playerID;
	private int health;
	private int maxHealth;
	private String name;
	private String weapon;
	
	/*
	 * Constructor class
	 */
	public Player(int id, String pName, String pWeapon, int hp) {
		playerID = id;
		name = pName;
		weapon = pWeapon;
		health = hp;
		maxHealth = hp;
	}
	
	/*
	 * Attack method that determines how much damage the player will inflict
	 */
	public int attack() {
		Random rand = new Random();
		return rand.nextInt(5,15);
	}
	
	/*
	 * Heal method that recovers the user's health
	 */
	public void heal(int hp) {
		health += hp;
	}
	
	// Getter methods
	public int getID() {
		return playerID;
	}
	public String getPlayerName() {
		return name;
	}
	public String getWeapon() {
		return weapon;
	}
	public int getHP() {
		return health;
	}
	public int getMaxHealth() {
		return maxHealth;
	}
	
	// Setter methods
	public void setID(int newID) {
		playerID = newID;
	}
	public void setPlayerName(String newName) {
		name = newName;
	}
	public void setWeapon(String newWeapon) {
		weapon = newWeapon;
	}
	public void setHealth(int hp) {
		health = hp;
	}
	
	// toString method
	public String toString() {
		return "Player Name: " + getPlayerName() + "\nWeapon: " + getWeapon() +
				"\nPlayer ID: " + getID();
	}
	
}
