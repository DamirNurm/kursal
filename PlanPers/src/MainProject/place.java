package MainProject;

import javax.swing.JOptionPane;

public class place extends Objects{
	public static float totalarea = 0;
	public static float freearea = 0;

	public static void AreaCounter() {
		try {
		if (Main2.textField.getText().length() > 0 && (Float.parseFloat(Main2.textField.getText())) >= 0) {
			MainProject.place.totalarea = Float.parseFloat(Main2.textField.getText());
			MainProject.place.freearea = Float.parseFloat(Main2.textField.getText());
			for (int i = 1; i <= AmountObj.amount; i++) {
				MainProject.place.freearea -= Objects.Obj[i].area;
			}
			if(freearea<0)
				freearea=0;
			Main2.textField_3.setText(String.valueOf(MainProject.place.freearea));
			System.out.println("dsad");
		} else {
			MainProject.Dial1.main(null);
		}
	}catch (Exception ep) {JOptionPane.showMessageDialog(null, "Ошибка во время расчётов! \nВозможно какие-то поля заполнены неверно!");}
	}
	public static void SetTotalArea() {
		if (totalarea!=0.0)
		MainProject.Main2.textField.setText(String.valueOf(Math.round(MainProject.place.totalarea)));
	}
	
}
