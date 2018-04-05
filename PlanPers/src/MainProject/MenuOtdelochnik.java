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
 * Подключаем библиотеку для работы с классами и интерфейсами, касающихся шрифтов
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
	/**
	* Для создания основного контейнера для приложения используем контейнер JFrame
	*/
	private JFrame frame;
	/**
	 * Объявляем поля ввода JTextField
	 * textField - Заносится значение всей площади комнаты (кв.м) с формы "Планировщик"
	 * textField_1 - принимает значение количества объектов (шт.) 
	 * textField_2 - принимает значение Свободного места в комнате (кв.м) 
	 */
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Запускаем приложение
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
				 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
				 * исключения try
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
		 * Создаем frame для формы Отделочник
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
		 * Указываем операцию, которая будет произведена при закрытии окна
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Устанавливаем менеджер NullLayout для расположения элементов по координатам
		 */
		frame.getContentPane().setLayout(null);

		/**
		 * Создаём простой компонент label класса JLabel
		 */
		JLabel label = new JLabel("Значение площади помещения(кв.м):");
		/**
		 * Задаем у компонента шрифт
		 */
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		label.setBounds(38, 11, 300, 25);
		/**
		 * Добавляем компонент label на панель
		 */
		frame.getContentPane().add(label);

		/**
		 * Создаём экземпляр класса lblNewLabel класса JLabel
		 */
		JLabel lblNewLabel = new JLabel("Количество объектов в комнате(шт):");
		/**
		 * Задаем шрифт компонента
		 */
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		lblNewLabel.setBounds(38, 80, 300, 25);
		/**
		 * Добавляем компонент lblNewLabel на панель
		 */
		frame.getContentPane().add(lblNewLabel);

		/**
		 * Создаём простой компонент textField класса JTextField 
		 * В это поле заносится значение общей площади помещения
		 */
		textField = new JTextField();
		/**
		 * Запрещаем пользователю выделять и изменять содержимое в компоненте
		 */
		textField.setEnabled(false);
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		textField.setBounds(38, 49, 155, 20);
		/**
		 * Добавляем компонент textField на панель
		 */
		frame.getContentPane().add(textField);
		/**
		 * Указываем количество символов в строке
		 */
		textField.setColumns(10);

		/**
		 * Создаём простой компонент textField_1 класса JTextField 
		 * В это поле заносится количество объектов в комнате
		 */
		textField_1 = new JTextField();
		/**
		 * Запрещаем пользователю выделять и изменять содержимое в компоненте
		 */
		textField_1.setEnabled(false);
		/**
		 * Указываем количество символов в строке
		 */
		textField_1.setColumns(10);
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		textField_1.setBounds(38, 116, 155, 20);
		/**
		 * Добавляем компонент textField_1 на панель
		 */
		frame.getContentPane().add(textField_1);

		/**
		 * Создаём простой компонент label_1 класса JLabel
		 */
		JLabel label_1 = new JLabel("Свободного пространства в комнате(кв.м):");
		/**
		 * Задаем шрифт компонента
		 */
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		label_1.setBounds(38, 147, 320, 25);
		/**
		 * Добавляем компонент label_1 на панель
		 */
		frame.getContentPane().add(label_1);

		/**
		 * Создаём простой компонент textField_2 класса JTextField В это поле заносится
		 * свободное пространство в помещении
		 */
		textField_2 = new JTextField();
		/**
		 * Запрещаем пользователю выделять и изменять содержимое в компоненте
		 */
		textField_2.setEnabled(false);
		/**
		 * Указываем количество символов в строке
		 */
		textField_2.setColumns(10);
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		textField_2.setBounds(38, 183, 155, 20);
		/**
		 * Добавляем компонент textField_2 на панель
		 */
		frame.getContentPane().add(textField_2);

		/**
		 * Создаём простой компонент btnNewButton класса JButton 
		 * Кнопка при нажатии сохраняет результаты расчётов в файл
		 */
		JButton btnNewButton = new JButton("Сохранить в файл");
		/**
		 * Задаем у компонента шрифт
		 */
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		btnNewButton.setBounds(38, 214, 170, 36);
		/**
		 * Добавляем компонент btnNewButton на панель
		 */
		frame.getContentPane().add(btnNewButton);

		/**
		 * Создаём простой компонент button класса JButton 
		 * Эта кнопка при нажатии возвращает в главное меню
		 */
		JButton button = new JButton("Выйти из режима");
		/**
		 * Задаем у компонента шрифт
		 */
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		button.setBounds(208, 279, 170, 36);
		/**
		 * Добавляем компонент button на панель
		 */
		frame.getContentPane().add(button);

		/**
		 * Заносим значение количества объектов(AmountObj.amount) в поле textField_1
		 */
		textField_1.setText(String.valueOf(MainProject.AmountObj.amount));
		/**
		 * Заносим значение свободного пространства в комнате
		 * (MainProject.place.freearea) в поле textField_1
		 */
		textField_2.setText(String.valueOf(MainProject.place.freearea));
		/**
		 * Заносим значение площади комнаты (MainProject.place.totalarea) в поле
		 * textField_1
		 */
		textField.setText(String.valueOf(MainProject.place.totalarea));

		/**
		 * Добавляем слушателя к кнопке button с помощью вызова addActionListener
		 */
		button.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода — actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Скрываем окно
				 */
				frame.setVisible(false);
				/**
				 * Вызываем метод main,который находится в классе MainMenu,который находится в пакете MainProject
				 */
				MainProject.MainMenu.main(null);
			}
		});
		/**
		 * Добавляем слушателя к кнопке btnNewButton с помощью вызова addActionListener
		 */
		btnNewButton.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода — actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Вызываем метод SaveInFile,который находится в классе SaveFile
				 */
				SaveFile.SaveInFile();

			}
		});

	}
}
