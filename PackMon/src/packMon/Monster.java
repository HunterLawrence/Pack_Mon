package packMon;

/**
 * Class for the monsters in PackMon
 */
public class Monster {

	private String name;
	private int quality;
	private int monsterID;
	private String attackName;
	private int attackPower;
	
	/**
	 * Constructor method
	 */
	public Monster(String name, int quality, int monsterID, String attackName, int attackPower) {
		this.name = name;
		this.quality = quality;
		this.monsterID = monsterID;
		this.attackName = attackName;
		this.attackPower = attackPower;
	}
	
	/**
	 * Attack method that calculates how much damage the monster will inflict on the player
	 */
	public int attack() {
		
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
	
	
}
