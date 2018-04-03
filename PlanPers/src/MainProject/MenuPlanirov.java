package MainProject;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPlanirov {

	JFrame frame;
	public static JTextField textField;
	private static JLabel lblNewLabel_1;
	public static JTextField textField_1;
	public static JTextField textField_2;
	private static JLabel lblNewLabel_2;
	private static JButton btnNewButton_3;
	private static JButton btnNewButton_4;
	public static JTextField textField_3;
	public static JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPlanirov window = new MenuPlanirov();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPlanirov() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Планировщик");
		frame.setBounds(100, 100, 389, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(30, 54, 152, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Введите значение площади комнаты(кв.м)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 23, 355, 20);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Значение ширины объекта(м)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 155, 240, 20);
		frame.getContentPane().add(lblNewLabel_1);

		// Поле для ширины объекта
		textField_1 = new JTextField();
		textField_1.setBounds(30, 180, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		// Поле для длины объекта
		textField_2 = new JTextField();
		textField_2.setBounds(30, 235, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel_2 = new JLabel("Значение длины объекта(м)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 211, 240, 20);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Параметры объекта");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(20, 121, 190, 23);
		frame.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton_1 = new JButton("Рассчитать свободное место");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(20, 366, 270, 33);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Добавить объект");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(20, 270, 170, 23);
		frame.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel_4 = new JLabel("Свободное место(кв.м): ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(30, 410, 180, 20);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Объектов всего:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(20, 327, 170, 20);
		frame.getContentPane().add(lblNewLabel_5);

		btnNewButton_3 = new JButton("Выйти из режима");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(193, 458, 170, 36);
		frame.getContentPane().add(btnNewButton_3);

		btnNewButton_4 = new JButton("Удалить все объекты");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(20, 300, 190, 23);
		frame.getContentPane().add(btnNewButton_4);

		textField_3 = new JTextField();
		textField_3.setBounds(212, 412, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setEnabled(false);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(130, 328, 30, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);

		MainProject.DigitFilter.TextFilter(textField, 15);
		MainProject.DigitFilter.TextFilter(textField_1, 9);
		MainProject.DigitFilter.TextFilter(textField_2, 9);
		
		place.SetTotalArea();
		AmountObj.SetAmount();
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MainProject.MainMenu.main(null);

			}
		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Objects.AddValueForObject();
			}

		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				place.AreaCounter();
			}

		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Objects.DelValueObjects();
			}

		});

	}

}
