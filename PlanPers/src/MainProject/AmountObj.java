package MainProject;

public class AmountObj {
	public static int amount = 0;
	
	public static void SetAmount() {
		MainProject.Main2.textField_4.setText(String.valueOf(Math.round(MainProject.AmountObj.amount)));
	}
	
}
