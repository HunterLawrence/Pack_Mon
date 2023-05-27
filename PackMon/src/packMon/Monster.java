package packMon;

// Importing the random class for the attack method
import java.util.Random;


/**
 * Class for the monsters in PackMon
 */
public class Monster {

	/*
	 * Fields
	 */
	private String name;
	private int quality;
	private int monsterID;
	private String attackName;
	private int attackPower;
	private int health;
	
	
	/**
	 * Constructor method
	 */
	public Monster(String name, int quality, int monsterID, String attackName, int attackPower, int health) {
		this.name = name;
		this.quality = quality;
		this.monsterID = monsterID;
		this.attackName = attackName;
		this.attackPower = attackPower;
		this.health = health;
	}
	
	public Monster() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Attack method that calculates how much damage the monster will inflict on the player
	 */
	public int attack() {
		Random rand = new Random();
		return rand.nextInt(attackPower);
	}
	
	/**
	 * Setter method for name
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * Setter method for quality
	 */
	public void setQuality(int newQuality) {
		quality = newQuality;
	}
	
	/**
	 * Setter method for attackName
	 */
	public void setAttackName(String newAttack) {
		attackName = newAttack;
	}
	
	/**
	 * Setter method for attackPower
	 */
	public void setPower(int power) {
		attackPower = power;
	}
	
	/**
	 * Setter method for health
	 */
	public void setHealth(int hp) {
		health = hp;
	}
	
	/**
	 * Getter method for name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter method for quality
	 */
	public int getQuality() {
		return quality;
	}
	
	/**
	 * Getter method for monsterID
	 */
	public int getID() {
		return monsterID;
	}
	
	/**
	 * Getter method for attackPower
	 */
	public int getPower() {
		return attackPower;
	}
	
	/**
	 * Getter method for attackName
	 */
	public String getAttackName() {
		return attackName;
	}
	
	/**
	 * Getter method for health
	 */
	public int getHP() {
		return health;
	}
	
	// toString method
	public String toString() {
		return "Monster name: " + getName() + "\nUses attack: " + getAttackName() + ", which can deal up to " +
				getPower() + " damage!" + "\nRarity: " + getQuality();
	}
	
	
}
