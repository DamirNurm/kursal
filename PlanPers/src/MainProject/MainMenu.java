package MainProject;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.JFrame;
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
public class MainMenu {

	private JFrame frame;

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
				 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
				 * исключения try
				 */
				try {
					/**
					 * Создаём объект window
					 */
					MainMenu window = new MainMenu();
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
	 * Создаем приложение
	 */
	public MainMenu() {
		/**
		 * Вызываем метод initialize для инициализации элементов фрейма
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
		frame.setTitle("Главное меню");
		/**
		 * Указываем координаты верхней левой вершины окна, а также его ширину и высоту
		 */
		frame.setBounds(100, 100, 450, 300);
		/**
		 * Указываем операцию, которая будет произведена при закрытии окна
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Устанавлваем менеджер NullLayout для самостоятельного расположения элементов
		 */
		frame.getContentPane().setLayout(null);

		/**
		 * Создаём простой компонент btnNewButton класса JButton 
		 * Кнопка при нажатии закроет форму "Главное меню" и откроет форму "Планировщик"
		 */
		JButton btnNewButton = new JButton("Планировщик");
		/**
		 * Задаем у компонента шрифт
		 */
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		btnNewButton.setBounds(45, 85, 143, 77);
		/**
		 * Добавляем компонент btnNewButton на панель
		 */
		frame.getContentPane().add(btnNewButton);

		/**
		 * Создаём простой компонент button класса JButton 
		 * Кнопка при нажатии закроет форму "Главное меню" и откроет форму "Отделочник"
		 */
		JButton button = new JButton("Отделочник");
		/**
		 * Задаем у компонента шрифт
		 */
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		/**
		 * Задаем у компонента его координаты и размеры
		 */
		button.setBounds(245, 85, 143, 77);
		/**
		 * Добавляем компонент btnNewButton на панель
		 */
		frame.getContentPane().add(button);

		/**
		 * Добавляем слушателя к кнопке btnNewButton с помощью вызова addActionListener
		 */
		btnNewButton.addActionListener(new ActionListener() {
			/**
			 * Интерфейс ActionListener требует только реализации одного метода — actionPerformed.
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * Скрываем окно
				 */
				frame.setVisible(false);
				/**
				 * Вызываем метод main,который находится в классе MenuPlanirov,который находится в пакете MainProject
				 */
				MainProject.MenuPlanirov.main(null);
			}
		});

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
				 * Вызываем метод main,который находится в классе MenuOtdelochnik,который находится в пакете MainProject
				 */
				MainProject.MenuOtdelochnik.main(null);

			}
		});

	}
}
