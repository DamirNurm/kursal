package MainProject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class SaveFile {
	public static void SaveInFile() {
		try {
			PrintWriter writer = new PrintWriter("Results.txt");
			writer.println("======================="
					+"\nTOTAL AREA: " + place.totalarea + 
					"\nFREE AREA: " + place.freearea + 
					"\nAmount of objects: " + AmountObj.amount);
			
			for (int i=1;i<=AmountObj.amount;i++) {
			writer.println(
					"=======================\nNumber Object:" + i + 
					"\nWidth: " + MainProject.Objects.Obj[i].width + 
					"\nLength: " + Objects.Obj[i].length + 
					"\nOccupies area: " + Objects.Obj[i].area);
			}
			writer.close();
	    	JOptionPane.showMessageDialog(null, "Сохранение выполнено успешно");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
