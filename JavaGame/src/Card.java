
public class Card {
	private String strCardName = "";
	private int intStars;
	public void setCardName(String input){
		strCardName = input;
	}
	public void setCard(int input){
		intStars = input;
	}
	public String getCardName(){
		return strCardName;
	}
	public int getStars(){
		return intStars;
	}
	public String toString(){
		return strCardName + " | " + intStars;
	}
}
