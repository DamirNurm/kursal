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
public class place {
	/**
	 * Объявляем переменные
	 * totalarea - вся площадь комнаты
	 * freearea - незанятая площадь в комнате
	 */
	public static float totalarea = 0;
	public static float freearea = 0;
	/**
	 * Метод AreaCounter используется 
	 * для подсчёта свободного места в помещении
	 */
	public static void AreaCounter() {
		/**
		 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
		 * исключения try
		 */
		try {
			/**
			 * Присваиваем атрибутам класса значения
			 */
			MainProject.place.totalarea = Float.parseFloat(MenuPlanirov.textField.getText());
			MainProject.place.freearea = Float.parseFloat(MenuPlanirov.textField.getText());
			/**
			 * Высчитываем значение незанятой площади в комнате
			 */
			for (int i = 1; i <= AmountObj.amount; i++) {
				MainProject.place.freearea -= Objects.Obj[i].area;
			}
			/**
			 * Если незанятой площади становится меньше 0, то
			 * присваиваем значение 0.
			 */
			if(freearea<0)
				freearea=0;
			/**
			 * Записываем результат расчёта незанятого пространства в
			 * форму планировщика.
			 */
			MenuPlanirov.textField_3.setText(String.valueOf(MainProject.place.freearea));
			
	}
		/**
		 * Исключение catch
		 */
		catch (Exception ep) {
			/**
			 * Показываем диалоговое окна с информацией об ошибке
			 */
		JOptionPane.showMessageDialog(null, "Ошибка во время расчётов! \nЗначение площади комнаты заполнено неверно!");
		}
	}
	/**
	 * Метод SetTotalArea для занесения
	 * в поле ввода значения всей площади
	 * комнаты в форме "планировщик".
	 */
	public static void SetTotalArea() {
		/**
		 * Проверяем необходимость заполнения поля 
		 * в форме "Планировщик"
		 */
		if (totalarea!=0.0)
			/**
			 * Заполняем поле textField в форме "Планировщик"
			 * значением всей площади комнаты.
			 */
		MainProject.MenuPlanirov.textField.setText(String.valueOf(Math.round(MainProject.place.totalarea)));
	}
	
}
