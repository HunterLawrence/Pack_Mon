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
	private Weapon weapon;
	
	/*
	 * Constructor class
	 */
	public Player(int id, String pName, Weapon pWeapon, int hp) {
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
		return rand.nextInt(10) + 5;
	}
	
	/*
	 * Heal method that recovers the user's health
	 */
	public void heal(int hp) {
		health += hp;
		
		if(health > maxHealth)
		{
			health = maxHealth;
		}
	}
	
	// Getter methods
	public int getID() {
		return playerID;
	}
	public String getName() {
		return name;
	}
	public Weapon getWeapon() {
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
	public void setWeapon(Weapon newWeapon) {
		weapon = newWeapon;
	}
	public void setHealth(int hp) {
		health = hp;
	}
	
	// toString method
	public String toString() {
		return "Player Name: " + getName() + "\nWeapon: " + getWeapon() +
				"\nPlayer ID: " + getID();
	}
	
}
