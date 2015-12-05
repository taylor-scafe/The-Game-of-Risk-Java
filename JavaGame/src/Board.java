import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	ArrayList<Sector> SectorList = new ArrayList<Sector>();

	public Board(){
		File file = new File("MapData.txt");
		try {
			Scanner MapData = new Scanner(file);
			String[] FirstLine = (MapData.nextLine()).split(",");
			for(int i = 0; i<FirstLine.length/2;i++){
				Sector oObject = new Sector(FirstLine[i*2]);
				SectorList.add(oObject);
			}
			
			MapData.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("FileNotFound!!!");
		}
		
	}
}
