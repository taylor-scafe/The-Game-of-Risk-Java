import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	static ArrayList<Sector> SectorList = new ArrayList<Sector>();
	
	
	
	
	public static boolean setBoard(){
		File file = new File("MapData.txt");
		try {
			Scanner MapData = new Scanner(file);
			String[] FirstLine = (MapData.nextLine()).split(",");
			for(int i = 0; i<FirstLine.length;i++){
				SectorList.add(new Sector(FirstLine[i]));
				System.out.println(FirstLine[i]);
				System.out.println(SectorList.get(i));
			}
				System.out.println(SectorList);
			
			
			
			
			MapData.close();
			return true;
		}
		catch (FileNotFoundException e) {
			return false;
		}
		
	}
}
