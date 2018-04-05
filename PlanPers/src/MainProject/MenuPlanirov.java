/**
* Устанавливаем принадлежность класса к пакету
 */
package MainProject;
/**
 * Добавляем библиотеку для работы с асинхронными событиями
 */
import java.awt.EventQueue;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
/**
 * Подключаем библиотеку для работы с классами и интерфейсами, касающихся шрифтов
 */
import java.awt.Font;
/**
 * Подключаем класс событий
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Объявляем public класс
 */
public class MenuPlanirov {
	/**
	* Для создания основного контейнера для приложения используем контейнер JFrame
	*/
	JFrame frame;
	/**
	 * Объявляем поля ввода JTextField.
	 * textField - Поле для ввода значения всей площади комнаты.
	 * textField_1 - Поле для ввода значения ширины объекта.
	 * textField_2 - Поле для ввода значения длины объекта.
	 * textField_3 - Поле для вывода свободного пространства в комнате.
	 * textField_4 - Поле для вывода количества добавленных объектов.
	 */
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	
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
					
					MenuPlanirov window = new MenuPlanirov();
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
	 * Создаём приложение
	 */
	public MenuPlanirov() {
		/**
		 * Вызываем метод initialize
		 */
		initialize();
	}

	/**
	 * Инициализация элементов фрейма
	 */
	public void initialize() {
		/**
		 * Создаем frame для формы Планировщик
		 */
		frame = new JFrame();
		/**
		 * Устанавливаем название окна
		 */
		frame.setTitle("Планировщик");
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту
		 */
		frame.setBounds(100, 100, 389, 545);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Устанавливаем менеджер NullLayout для расположения элементов по координатам
		 */
		frame.getContentPane().setLayout(null);
		
		/**
		 * Создаём простой компонент textField класса JTextField.
		 * В это поле заносится значение общей площади помещения.
		 */
		textField = new JTextField();
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		textField.setBounds(30, 54, 152, 20);
		/**
		 * Добавляем компонент textField на панель
		 */
		frame.getContentPane().add(textField);
		/**
		 * Указываем количество символов в строке
		 */
		textField.setColumns(10);

		/**
		 * Создаём простой компонент lblNewLabel класса JLabel.
		 * Этот компонент показывает текст: "Введите значение площади комнаты(кв.м)".
		 */
		JLabel lblNewLabel = new JLabel("Введите значение площади комнаты(кв.м)");
		/**
		 * Задаем шрифт компонента
		 */
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		lblNewLabel.setBounds(20, 23, 355, 20);
		/**
		 * Добавляем компонент lblNewLabel на панель
		 */
		frame.getContentPane().add(lblNewLabel);

		/**
		 * Создаём простой компонент lblNewLabel_1 класса JLabel.
		 * Этот компонент показывает текст: "Значение ширины объекта(м)".
		 */
		JLabel lblNewLabel_1 = new JLabel("Значение ширины объекта(м)");
		/**
		 * Задаем шрифт компонента
		 */
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		lblNewLabel_1.setBounds(20, 155, 240, 20);
		/**
		 * Добавляем компонент lblNewLabel_1 на панель
		 */
		frame.getContentPane().add(lblNewLabel_1);

		/**
		 * Создаём простой компонент textField_1 класса JTextField.
		 * В это поле заносится значение ширины объекта.
		 */
		textField_1 = new JTextField();
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		textField_1.setBounds(30, 180, 86, 20);
		/**
		 * Добавляем компонент textField_1 на панель
		 */
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		/**
		 * Создаём простой компонент textField_2 класса JTextField.
		 * В это поле заносится значение длины объекта.
		 */
		textField_2 = new JTextField();
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		textField_2.setBounds(30, 235, 86, 20);
		/**
		 * Добавляем компонент textField_2 на панель
		 */
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		/**
		 * Создаём простой компонент lblNewLabel_1 класса JLabel.
		 * Этот компонент показывает текст: "Значение длины объекта(м)".
		 */
		JLabel lblNewLabel_2 = new JLabel("Значение длины объекта(м)");
		/**
		 * Задаем шрифт компонента
		 */
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		lblNewLabel_2.setBounds(20, 211, 240, 20);
		/**
		 * Добавляем компонент lblNewLabel_2 на панель
		 */
		frame.getContentPane().add(lblNewLabel_2);

		/**
		 * Создаём простой компонент lblNewLabel_3 класса JLabel.
		 * Этот компонент показывает текст: "Параметры объекта".
		 */
		JLabel lblNewLabel_3 = new JLabel("Параметры объекта");
		/**
		 * Задаем шрифт компонента
		 */
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		lblNewLabel_3.setBounds(20, 121, 190, 23);
		/**
		 * Добавляем компонент lblNewLabel_3 на панель
		 */
		frame.getContentPane().add(lblNewLabel_3);

		/**
		 * Создаём простой компонент btnNewButton_1 класса JButton.
		 * При нажатии вызывает метод для расчёта свободного пространства в комнате
		 */
		JButton btnNewButton_1 = new JButton("Рассчитать свободное место");
		/**
		 * Задаем шрифт компонента
		 */
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		btnNewButton_1.setBounds(20, 366, 270, 33);
		/**
		 * Добавляем компонент btnNewButton_1 на панель
		 */
		frame.getContentPane().add(btnNewButton_1);

		/**
		 * Создаём простой компонент btnNewButton_2 класса JButton.
		 * Эта кнопка при нажатии добавляет объект и сохраняет его параметры
		 */
		JButton btnNewButton_2 = new JButton("Добавить объект");
		/**
		 * Задаем шрифт компонента
		 */
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		btnNewButton_2.setBounds(20, 270, 170, 23);
		/**
		 * Добавляем компонент btnNewButton_2 на панель
		 */
		frame.getContentPane().add(btnNewButton_2);

		/**
		 * Создаём простой компонент lblNewLabel_4 класса JLabel.
		 * Этот компонент показывает текст: "Свободное место(кв.м): ".
		 */
		JLabel lblNewLabel_4 = new JLabel("Свободное место(кв.м): ");
		/**
		 * Задаем шрифт компонента
		 */
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		lblNewLabel_4.setBounds(30, 410, 180, 20);
		/**
		 * Добавляем компонент lblNewLabel_4 на панель
		 */
		frame.getContentPane().add(lblNewLabel_4);

		/**
		 * Создаём простой компонент lblNewLabel_5 класса JLabel.
		 * Этот компонент показывает текст: "Объектов всего:".
		 */
		JLabel lblNewLabel_5 = new JLabel("Объектов всего:");
		/**
		 * Задаем шрифт компонента
		 */
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		lblNewLabel_5.setBounds(20, 327, 170, 20);
		/**
		 * Добавляем компонент lblNewLabel_5 на панель
		 */
		frame.getContentPane().add(lblNewLabel_5);

		/**
		 * Создаём простой компонент btnNewButton_3 класса JButton.
		 * Эта кнопка при нажатии возвращает в главное меню.
		 */
		JButton btnNewButton_3 = new JButton("Выйти из режима");
		/**
		 * Задаем шрифт компонента
		 */
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		btnNewButton_3.setBounds(193, 458, 170, 36);
		/**
		 * Добавляем компонент btnNewButton_3 на панель
		 */
		frame.getContentPane().add(btnNewButton_3);

		/**
		 * Создаём простой компонент btnNewButton_4 класса JButton.
		 * Эта кнопка при нажатии удаляет все объекты из расчётов.
		 */
		JButton btnNewButton_4 = new JButton("Удалить все объекты");
		/**
		 * Задаем шрифт компонента
		 */
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		btnNewButton_4.setBounds(20, 300, 190, 23);
		/**
		 * Добавляем компонент btnNewButton_4 на панель
		 */
		frame.getContentPane().add(btnNewButton_4);

		/**
		 * Создаём простой компонент textField_3 класса JTextField.
		 * В это поле заносится значение свободного пространства в комнате.
		 */
		textField_3 = new JTextField();
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		textField_3.setBounds(212, 412, 86, 20);
		/**
		 * Добавляем компонент textField_3 на панель
		 */
		frame.getContentPane().add(textField_3);
		/**
		 * Запрещаем пользователю выделять и изменять содержимое в компоненте
		 */
		textField_3.setEnabled(false);
		/**
		 * Указываем количество символов в строке
		 */
		textField_3.setColumns(10);

		/**
		 * Создаём простой компонент textField_4 класса JTextField.
		 * В это поле заносится количество добавленных объектов.
		 */
		textField_4 = new JTextField();
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		textField_4.setBounds(130, 328, 30, 20);
		/**
		 * Добавляем компонент textField_4 на панель
		 */
		frame.getContentPane().add(textField_4);
		/**
		 * Запрещаем пользователю выделять и изменять содержимое в компоненте
		 */
		textField_4.setEnabled(false);
		/**
		 * Указываем количество символов в строке
		 */
		textField_4.setColumns(10);

		/**
		 * Выполняем метод DigitFilter.
		 * Для поля ввода textField передаем значение максимальной длины: 15.
		 * Для поля ввода textField_1 передаем значение максимальной длины: 9.
		 * Для поля ввода textField_2 передаем значение максимальной длины: 9.
		 */
		MainProject.DigitFilter.TextFilter(textField, 15);
		MainProject.DigitFilter.TextFilter(textField_1, 9);
		MainProject.DigitFilter.TextFilter(textField_2, 9);
		
		/**
		 * Выполняем метод SetTotalArea() для того, чтобы
		 * поле textField заполнялось значением площади
		 * комнаты, при открытии формы планировщик.
		 */
		place.SetTotalArea();
		
		/**
		 * Выполняем метод SetAmount() для того, чтобы
		 * поле textField_4 заполнялось значением количества
		 * объектов, при открытии формы планировщик.
		 */
		AmountObj.SetAmount();
		
		/**
		 * Добавляем слушателя к кнопке btnNewButton_3 с помощью вызова addActionListener
		 */
		btnNewButton_3.addActionListener(new ActionListener() {
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
		 * Добавляем слушателя к кнопке btnNewButton_2 с помощью вызова addActionListener
		 */
		btnNewButton_2.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода — actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Вызываем метод AddValueForObject() для
				 * добавления объекта и сохранения его параметров
				 */
			Objects.AddValueForObject();
			}

		});

		/**
		 * Добавляем слушателя к кнопке btnNewButton_1 с помощью вызова addActionListener
		 */
		btnNewButton_1.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода — actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Вызываем метод AreaCounter() для
				 * расчёта свободного пространства в комнате
				 */
				place.AreaCounter();
			}

		});
		
		/**
		 * Добавляем слушателя к кнопке btnNewButton_4 с помощью вызова addActionListener
		 */
		btnNewButton_4.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода — actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Вызываем метод DelValueObjects() для
				 * удаления всех объектов из расчётов.
				 */
				Objects.DelValueObjects();
			}

		});

	}

}
