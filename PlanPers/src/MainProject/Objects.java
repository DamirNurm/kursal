/**
* Устанавливаем принадлежность класса к пакету
 */
package MainProject;
/**
* Подключаем библиотеку для работы с диалоговыми окнами
 */
import javax.swing.JOptionPane;

/**
 * Объявляем класс с модификатором public
 */
public class Objects {
	/**
	 * Объявляем переменные с модификатором public
	 * objNumbet - значение номера объекта
	 * width - значение ширины объекта
	 * length - значение длины объекта
	 * area - значение занимаемого места в комнате
	 */
	public  int objNumbet = 0;
	public  float width = 0;
	public  float length = 0;
	public  float area = 0;
	/**
	* Объявляем массив статических перенных для хранения параметров объекта
	 */
	public static   Objects[] Obj = new Objects[100];
	
	/**
	* Объявляем статический метод для сохранения значений параметров объекта
	 */
	public static void AddValueForObject() {
		/**
		 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
		 * исключения try
		 */
		try {
			/**
			 * Проверяем поля ввода на длину и символы, для исключения ошибок в вычислениях.
			 */
		if (MenuPlanirov.textField_1.getText().length() != 0 && MenuPlanirov.textField_2.getText().length() != 0 && !MenuPlanirov.textField_2.getText().equals("0") && !MenuPlanirov.textField_1.getText().equals("0")) {
			/**
			 * Добавляем информацию, что количество объектов увеличислось
			 */
			AmountObj.amount += 1;
			/**
			 * Создаем экземпляр указанного класса
			 */
			Obj[AmountObj.amount] = new Objects();
			/**
			 * Присваиваем атрибутам класса значения
			 */
			Obj[AmountObj.amount].width = Float.parseFloat(MenuPlanirov.textField_1.getText());
			Obj[AmountObj.amount].length = Float.parseFloat(MenuPlanirov.textField_2.getText());
			Obj[AmountObj.amount].objNumbet = AmountObj.amount;
			Obj[AmountObj.amount].area = Float.parseFloat(MenuPlanirov.textField_1.getText())* Float.parseFloat(MenuPlanirov.textField_2.getText());
			
			/**
			 * Выполняем очистку полей
			 */
			MenuPlanirov.textField_1.setText("");
			MenuPlanirov.textField_2.setText("");
			
			/**
			 * Вызываем метод 
			 */
			FillTextF4();
		}else {
			/**
			 * Вызываем метод 
			 */
			FillTextF4();
		}
		
	}
		/**
		 * Исключение catch
		 */
		catch (Exception ep) {
			/**
			 * Обрабатываем исключение типа Exception ep.
			 * Уменьшение количества созданных объектов,
			 * для исключения переполнения.
			 */
		AmountObj.amount -= 1;
		/**
		 * Показываем диалоговое окна с информацией об ошибке
		 */
	JOptionPane.showMessageDialog(null, "Ошибка во время добавления объекта! \nПараметры объекта заполнены неверно!");
	}
	}
	/**
	 * Метод DelValueObjects для исключения объектов
	 * из вычислений.
	 */
	public static void DelValueObjects() {
		/**
		 * Обнуляем количества объектов
		 */
		AmountObj.amount=0;
		/**
		 * Вызываем метод 
		 */
		FillTextF4();
		
		}
	/**
	 * Метод FillTextF4 для заполнения поля
	 */
	public static void FillTextF4() {
		/**
		 * Заполняем поле "Объектов всего"(textField_4)
		 * в форме "Планировщик".
		 */
		MenuPlanirov.textField_4.setText(String.valueOf(AmountObj.amount));
	}

}
