
public abstract class EnemyShip {
	private String name;
	private double amtDamage;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){ return name; }
	
	public void setDamage(double amtDamage){
		this.amtDamage = amtDamage;
	}
	
	public double getDamage(){ return amtDamage; }
	
	public void followHeroShip(){
		System.out.println(getName()+" is following the Hero");
	}
	
	public void displayEnemyShip(){
		System.out.println(getName()+" is on the screen");
	}
	
	public void enemyShipShoots(){
		System.out.println(getName()+" attacks Hero and does "+getDamage()+"damage to the Hero");
	}
}
