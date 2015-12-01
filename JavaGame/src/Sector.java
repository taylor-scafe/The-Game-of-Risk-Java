import java.util.ArrayList;

public class Sector {
	private String strName;
	private String strGalaxy;
	private int intTroops;
	private boolean boolNeutral;
	private Player player;
	private ArrayList<Sector> Neighbors = new ArrayList<Sector>();
	public Sector(){
	setName("");
	setGalaxy("");
	setTroops(0);
	setNeutral(true);
	}
	public Sector(String name) {
		setName(name);
	}

	public void setName(String input){
		strName = input;
	}
	public void setGalaxy(String input){
		strGalaxy = input;
	}
	public void setTroops(int input){
		intTroops = input;
	}
	public void addTroops(int input){
		intTroops = intTroops + input;
	}
	public void subTroops(int input){
		intTroops = intTroops - input;
	}
	public void addTroop(){
		intTroops++;
	}
	public void subTroop(){
		intTroops--;
	}
	public void setNeutral(boolean input){
		boolNeutral = input;
	}
	public void setPlayer(Player input){
		player = input;
	}
	public String getName(){
		return strName;
	}
	public String getGalaxy(){
		return strGalaxy;
	}
	public int getTroops(){
		return intTroops;
	}
	public boolean isNeutral(){
		return boolNeutral;
	}
	public Player getPlayer(){
		return player;
	}
	public void addNeighbor(Sector input){
		Neighbors.add(input);
	}
	public ArrayList<Sector> getNeighbors(){
		return Neighbors;
	}
	
	
	
	
	
	
	public String toString(){
		if (boolNeutral){
			return "Name: " + strName + " Galaxy: " + strGalaxy
				+ " Troops: " + intTroops + " Neutral";
		}
		else{
			return "Name: " + strName + " Galaxy: " + strGalaxy
				+ " Troops: " + intTroops;
		}
	}
	
}
