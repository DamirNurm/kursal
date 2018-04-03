package MainProject;

import javax.swing.JOptionPane;

public class Objects {
	public  int objNumbet = 0;
	public  float width = 0;
	public  float length = 0;
	public   float area = 0;
	public static   Objects[] Obj = new Objects[100];
	
	public static void AddValueForObject() {
		try {
		if (MenuPlanirov.textField_1.getText().length() != 0 && MenuPlanirov.textField_2.getText().length() != 0 && !MenuPlanirov.textField_2.getText().equals("0") && !MenuPlanirov.textField_1.getText().equals("0")) {
			AmountObj.amount += 1;
			Obj[AmountObj.amount] = new Objects();
			System.out.println(MenuPlanirov.textField_1.getText());
			System.out.println(MenuPlanirov.textField_2.getText());
			Obj[AmountObj.amount].width = Float.parseFloat(MenuPlanirov.textField_1.getText());
			Obj[AmountObj.amount].length = Float.parseFloat(MenuPlanirov.textField_2.getText());
			Obj[AmountObj.amount].objNumbet = AmountObj.amount;
			Obj[AmountObj.amount].area = Float.parseFloat(MenuPlanirov.textField_1.getText())* Float.parseFloat(MenuPlanirov.textField_2.getText());
			MenuPlanirov.textField_1.setText("");
			MenuPlanirov.textField_2.setText("");
			FillTextF4();
		}else {
			FillTextF4();
		}
	}catch (Exception ep) {AmountObj.amount -= 1;
	JOptionPane.showMessageDialog(null, "Ошибка во время добавления объекта! \nПараметры объекта заполнены неверно!");}
	}
	public static void DelValueObjects() {
		AmountObj.amount=0;
		FillTextF4();
		
		}
	public static void FillTextF4() {
		MenuPlanirov.textField_4.setText(String.valueOf(AmountObj.amount));
	}

}
