/*
 * Battle and Battle Execute method by Taylor Scafe. Ignore warnings. It works
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;


public class Method {
	
	public static void Battle(Sector attack, Sector defend){//Will take 2 sectors
		int attackTroops = 0;
		int defendTroops = 0;
		Object[] troopOptions = {};
		for(int i = 1; i <= attack.getTroops()-1 && i<=3 ;i++){
			troopOptions = appendValue(troopOptions, ""+i);
		}
		Object[] possibilities = troopOptions;
		String sAttackTroops = (String)JOptionPane.showInputDialog(null, "Select Number of Troops to Deploy", "Attack", JOptionPane.PLAIN_MESSAGE, null, possibilities, "1");
		if (sAttackTroops == null){
			return;
		}
		else{
			attackTroops = Integer.parseInt(sAttackTroops);
			defendTroops = defend.getTroops();
			Method.BattleExecute(attackTroops, defendTroops, attack, defend);
		}
	}
	private static void BattleExecute(int attackTroops, int defendTroops, Sector attack, Sector defend){//Will take 2 sectors as input
		Random die = new Random();
		System.out.println(attackTroops);
		ArrayList<Integer> attackDice = new ArrayList<Integer>();
		ArrayList<Integer> defendDice = new ArrayList<Integer>();
		int moveTroops = attackTroops;
		if (defendTroops >=2){
			defendTroops = 2;
		}
		for(int i=0; i!=attackTroops;i++){
			attackDice.add((die.nextInt(5)+1));
		}
		Collections.sort(attackDice);
		for(int i=0; i!=defendTroops;i++){
			defendDice.add(die.nextInt(5)+1);
		}
		Collections.sort(defendDice);
		for(int i=0;i!=defendTroops;i++){
			int attackDie = (int) attackDice.get(attackTroops-i-1);
			int defendDie = (int) defendDice.get(defendTroops-i-1);
			if(attackDie <= defendDie){
				System.out.println("Defender "+ (i+1) + " was Sucessful");
				moveTroops --;
				attack.subTroop();
			}
			else{
				System.out.println("Attacker "+ (i+1) + " was Sucessful");
				defend.subTroop();
			}
		}
		//System.out.println(attackDice);
		//System.out.println(defendDice);
		//System.out.println(attack.getTroops());
		//System.out.println(defend.getTroops());
			
		if(defend.getTroops() == 0){
			System.out.println("Attackers overwhelmed the opposition");
			defend.setPlayer(attack.getPlayer());
			defend.setTroops(moveTroops);
			attack.subTroops(moveTroops);
			if(attack.getTroops()>1){
				Object[] troopOptions = {};
				for(int i = 0; i <= attack.getTroops()-1;i++){
					troopOptions = appendValue(troopOptions, ""+i);
				}
				Object[] possibilities = troopOptions;
				String sMoveTroops = (String)JOptionPane.showInputDialog(null, "Select Number of Troops to Move", "Move", JOptionPane.PLAIN_MESSAGE, null, possibilities, "0");
				if (sMoveTroops == null){
					return;
				}
				else{
					defend.addTroops(Integer.parseInt(sMoveTroops));
					attack.subTroops(Integer.parseInt(sMoveTroops));
				}
			}
		}
	}
	private static Object[] appendValue(Object[] obj, Object newObj) {//Taken from the Internet. Give append method to an Object[]

		ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(obj));
		temp.add(newObj);
		return temp.toArray();
	}
	
	public void MoveTroops(Player player){
		Object[] MoveFromOptions = {};
		Object[] MoveToOptions = {};
		ArrayList SectorsOccupied = new ArrayList<Sector>();
		//for sector occupied
		//MoveFromOptions = appendValue(MoveFromOptions, ""+ sector.getName());

		//	MoveToOptions = appendValue(MoveToptions, ""+ variable);
	}
	
	//public ArrayList[] getOccupiedSectors(Player player){
	//	return 
	//}
	
	
}
