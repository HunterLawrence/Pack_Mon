package packMon;


/**
 * Weapon superclass for the PackMon game.
 * Implies inheritance of main functions
 */
public class Weapon {

	/*
	 * Fields
	 */
	private int attackPower;
	private String weaponName;
	private int weaponID;
	
	
	/**
	 * Constructor method
	 */
	public Weapon(int attackPower, String weaponName, int weaponID) {
		this.attackPower = attackPower;
		this.weaponName = weaponName;
		this.weaponID = weaponID;
	}
	
	/**
	 * Setter method for attackPower;
	 */
	public void setAttackPower(int power) {
		attackPower = power;
	}
	
	/**
	 * Setter method for weaponName
	 */
	public void setWeaponName(String name) {
		weaponName = name;
	}
	
	/**
	 * Setter method for weaponID
	 */
	public void setWeaponID(int id) {
		weaponID = id;
	}
	
	/**
	 * Getter method for attackPower
	 */
	public int getAttackPower() {
		return attackPower;
	}
	
	/**
	 * Getter method for weaponName
	 */
	public String getWeaponName() {
		return weaponName;
	}
	
	/**
	 * Getter method for weaponID
	 */
	public int getWeaponID() {
		return weaponID;
	}
	
}
