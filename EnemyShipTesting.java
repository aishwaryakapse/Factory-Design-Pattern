import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String[] args){
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What type of ship? (U /R /B)");
		
		if(input.hasNextLine()){
			String typeOfShip = input.nextLine();
			
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			
			if(theEnemy != null){
				doStuffEnemy(theEnemy);
			}else{
				System.out.println("Enter Again");
			}
		}
		input.close();
	}
	
	public static void doStuffEnemy(EnemyShip theEnemy){
		theEnemy.displayEnemyShip();
		theEnemy.followHeroShip();
		theEnemy.enemyShipShoots();
	}
}
