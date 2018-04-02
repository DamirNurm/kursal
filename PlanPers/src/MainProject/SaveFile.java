package MainProject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveFile {
	public static void SaveInFile() {
		try {
			PrintWriter writer = new PrintWriter("Results.txt");
			writer.println("=======================");
			writer.println("TOTAL AREA: " + place.totalarea);
			writer.println("FREE AREA: " + place.freearea);
			writer.println("Amount of objects: " + AmountObj.amount);
			
			for (int i=1;i<=AmountObj.amount;i++) {
			writer.println("=======================");
			writer.println("Number Object: " + i);
			writer.println("Width: " + MainProject.Objects.Obj[i].width);
			System.out.println(Objects.Obj[i].width);
			
			writer.println("Length: " + Objects.Obj[i].length);
			writer.println("Occupies area: " + Objects.Obj[i].area);
			}
			writer.close();
	    	 MainProject.SuccessSave.main(null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

		
}
