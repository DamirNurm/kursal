/**
* Устанавливаем принадлежность класса к пакету
 */
package MainProject;
/**
 * Объявляем класс с модификатором public
 */
public class AmountObj {
	/**
	 * Объявляем переменную, которая независит от 
	 * каких-либо экземпляров, созданных для класса.
	 */
	public static int amount = 0;
	
	/**
	 * Метод SetAmount() необходим для заполнения 
	 * поля со значением объектов(textField_4)
	 * в форме планировщик.
	 */
	public static void SetAmount() {
		/**
		 * Заполняем поле textField_4 в форме 
		 * планировщик количеством созданных объектов.
		 */
		MainProject.MenuPlanirov.textField_4.setText(String.valueOf(Math.round(MainProject.AmountObj.amount)));
	}
	
}
