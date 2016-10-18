import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frmConversor;
	private JTextField textField;
	private JTextField textField_1;
	Conversor c=new Conversor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.setTitle("Conversor");
		frmConversor.setBounds(100, 100, 450, 370);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversor.getContentPane().setLayout(null);
		
		JLabel lblEnterTheValue = new JLabel("Enter the value in degrees:");
		lblEnterTheValue.setBounds(131, 58, 200, 20);
		frmConversor.getContentPane().add(lblEnterTheValue);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversor c=new Conversor();
				
			}
		});
		textField.setBounds(131, 100, 189, 26);
		frmConversor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheValues = new JLabel("Enter the value in radians:");
		lblEnterTheValues.setBounds(133, 142, 198, 20);
		frmConversor.getContentPane().add(lblEnterTheValues);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 174, 189, 26);
		frmConversor.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(36, 225, 69, 20);
		frmConversor.getContentPane().add(lblResult);
		
		JButton btnToRadians = new JButton("to radians");
		btnToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//save value to a string
				String valueToConvert=textField.getText().toString();
				//System.out.println(valueToConvert);
				Double finalResult=0.0;
				finalResult=c.toRadians(Double.parseDouble(valueToConvert));
				//System.out.println(finalResult);
				textField_1.setText(String.valueOf(finalResult));
				textField.setText("");
				
				
				
			}
		});
		btnToRadians.setBounds(75, 255, 115, 29);
		frmConversor.getContentPane().add(btnToRadians);
		
		JButton btnToDegrees = new JButton("to degrees");
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valueToConvert=textField_1.getText().toString();
				Double finalResult2=0.0;
				finalResult2=c.toDegrees(Double.parseDouble(valueToConvert));
				textField.setText(String.valueOf(valueToConvert));
				textField_1.setText("");
				
			}
		});
		Conversor c=new Conversor();
		btnToDegrees.setBounds(232, 255, 115, 29);
		frmConversor.getContentPane().add(btnToDegrees);
	}
}
