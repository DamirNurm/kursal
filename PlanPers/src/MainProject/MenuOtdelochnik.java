/**
* Устанавливаем принадлежность класса к пакету
 */
package MainProject;

/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * Подключаем библиотеку для работы с классами и интерфейсами, касающихся шрифтов.
 */
import java.awt.Font;
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
/**
 * Подключаем класс прослушки
 */
import java.awt.event.ActionListener;

/**
 * Объявляем public класс
 */
public class MenuOtdelochnik {

	
	private JFrame frame;
	/**
	 * Объявляем приватные поля ввода
	 * textField - принимает значение всей площади комнаты (кв.м)
	 * textField_1 - принимает значение количества объектов (шт.)
	 * textField_2 - принимает значение Свободного места в комнате (кв.м)
	 */
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Запуск приложения
	 */
	public static void main(String[] args) {
		/**
		 * Объявляем, что это необходимо выполнять в главном потоке
		 */
		EventQueue.invokeLater(new Runnable() {
			/**
			 * Метод run
			 */
			public void run() {
				/**
				 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи исключения try
				 */
				try {
					/**
					 * Создаём объект window
					 */
					MenuOtdelochnik window = new MenuOtdelochnik();
					/**
					 * Отображаем окно
					 */
					window.frame.setVisible(true);
					/**
					 * Исключение catch
					 */
				} catch (Exception e) {
					/**
					 * Обрабатываем исключение типа Exception e 
					 */
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Создание приложения
	 */
	public MenuOtdelochnik() {
		/**
		 * Вызываем метод initialize
		 */
		initialize();
	}
	/**
	 * Инициализация элементов фрейма
	 */
	private void initialize() {
		/**
		 * Создаём объект
		 */
		frame = new JFrame();
		/**
		 * Устанавливаем название окна
		 */
		frame.setTitle("Отделочник");
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту
		 */
		frame.setBounds(100, 100, 404, 365);
		/**
		 *  Указываем операцию, которая будет произведена при закрытии окна
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 *  Устанавлваем менеджер NullLayout для самостоятельного расположения элементов
		 */
		frame.getContentPane().setLayout(null);
		
		/**
		 *  Создаём простой компонент label класса JLabel
		 */
		JLabel label = new JLabel("Значение площади помещения(кв.м):");
		/**
		 *  Задаем у компонента шрифт  
		 */
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 *  Задаем у компонента его координаты и размеры
		 */
		label.setBounds(38, 11, 300, 25);
		/**
		 *  Добавляем компонент label на панель
		 */
		frame.getContentPane().add(label);
		/**
		 *  Создаём экземляр класса lblNewLabel класса JLabel
		 */
		JLabel lblNewLabel = new JLabel("Количество объектов в комнате(шт):");
		/**
		 *  Задаем у компонента шрифт  
		 */
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 *  Задаем у компонента его координаты и размеры
		 */
		lblNewLabel.setBounds(38, 80, 300, 25);
		/**
		 *  Добавляем компонент label на панель
		 */
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(38, 49, 155, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(38, 116, 155, 20);
		frame.getContentPane().add(textField_1);
		/**
		 *  Создаём экземляр класса label_1 класса JLabel
		 */
		JLabel label_1 = new JLabel("Свободного пространства в комнате(кв.м):");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(38, 147, 320, 25);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(38, 183, 155, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Сохранить в файл");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(38, 214, 170, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Выйти из режима");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(208, 279, 170, 36);
		frame.getContentPane().add(button);
		
		textField_1.setText(String.valueOf(MainProject.AmountObj.amount));
		textField_2.setText(String.valueOf(MainProject.place.freearea));
		textField.setText(String.valueOf(MainProject.place.totalarea));
		
		button.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 frame.setVisible(false);
		    	 MainProject.MainMenu.main(null);
		     }
		});
		btnNewButton.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 SaveFile.SaveInFile();

		     }
		});
		
	}
}
