package MainProject;

import javax.swing.JOptionPane;

public class place extends Objects{
	public static float totalarea = 0;
	public static float freearea = 0;

	public static void AreaCounter() {
		try {
			MainProject.place.totalarea = Float.parseFloat(MenuPlanirov.textField.getText());
			MainProject.place.freearea = Float.parseFloat(MenuPlanirov.textField.getText());
			for (int i = 1; i <= AmountObj.amount; i++) {
				MainProject.place.freearea -= Objects.Obj[i].area;
			}
			if(freearea<0)
				freearea=0;
			MenuPlanirov.textField_3.setText(String.valueOf(MainProject.place.freearea));
			System.out.println("dsad");
	}catch (Exception ep) {JOptionPane.showMessageDialog(null, "Ошибка во время расчётов! \nЗначение площади комнаты заполнено неверно!");}
	}
	public static void SetTotalArea() {
		if (totalarea!=0.0)
		MainProject.MenuPlanirov.textField.setText(String.valueOf(Math.round(MainProject.place.totalarea)));
	}
	
}
