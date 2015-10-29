
public class Sector {
	private String strName;
	private String strGalaxy;
	private int intTroops;
	private boolean boolNeutral;
	
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
