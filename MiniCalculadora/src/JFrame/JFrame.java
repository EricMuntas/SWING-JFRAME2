package JFrame;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField operacionButton1;
	private JTextField operacionButton2;
	private JTextField resultadoField;
	private double num1;
	private double num2;
	private double resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		operacionButton1 = new JTextField();
		operacionButton1.setBounds(24, 50, 86, 20);
		contentPane.add(operacionButton1);
		operacionButton1.setColumns(10);
		
		operacionButton2 = new JTextField();
		operacionButton2.setBounds(181, 50, 86, 20);
		contentPane.add(operacionButton2);
		operacionButton2.setColumns(10);
		
		resultadoField = new JTextField();
		resultadoField.setBounds(337, 50, 86, 20);
		contentPane.add(resultadoField);
		resultadoField.setColumns(10);
		
		JButton sumaButton = new JButton("Suma");
		
		sumaButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				num1 = Double.parseDouble(operacionButton1.getText());
				num2 = Double.parseDouble(operacionButton2.getText());
				
				resultado = num1 + num2;
				
				resultadoField.setText(String.valueOf(resultado));
			}
		});
		
		
		
		
		sumaButton.setBounds(10, 125, 117, 23);
		contentPane.add(sumaButton);
		
		
		
		
		JButton restaButton = new JButton("Resta");
		restaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				num1 = Double.parseDouble(operacionButton1.getText());
				num2 = Double.parseDouble(operacionButton2.getText());
				
				resultado = num1 - num2;
				
				resultadoField.setText(String.valueOf(resultado));
				
				
			}
		});
		
		
		
		
		
		restaButton.setBounds(166, 125, 117, 23);
		contentPane.add(restaButton);
		
		JButton multiplicacionButton = new JButton("Multiplicación");
		multiplicacionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				num1 = Double.parseDouble(operacionButton1.getText());
				num2 = Double.parseDouble(operacionButton2.getText());
				
				resultado = num1 * num2;
				
				resultadoField.setText(String.valueOf(resultado));
				
				
			}
		});
		multiplicacionButton.setBounds(327, 125, 117, 23);
		contentPane.add(multiplicacionButton);
		
		JButton divisionButton = new JButton("Division");
		divisionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				num1 = Double.parseDouble(operacionButton1.getText());
				num2 = Double.parseDouble(operacionButton2.getText());
				
				resultado = num1 / num2;
				
				resultadoField.setText(String.valueOf(resultado));
				
				
				
			}
		});
		divisionButton.setBounds(85, 210, 117, 23);
		contentPane.add(divisionButton);
		
		JButton salirButton = new JButton("Salir");
		salirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				dispose();
				
				
				
			}
		});
		salirButton.setBounds(253, 210, 117, 23);
		contentPane.add(salirButton);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setBounds(297, 53, 16, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 1:");
		lblNewLabel_1.setBounds(36, 25, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Número 2:");
		lblNewLabel_2.setBounds(195, 25, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(357, 25, 66, 14);
		contentPane.add(lblNewLabel_3);
	}

}
