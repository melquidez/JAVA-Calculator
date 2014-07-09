import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MelTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstInput;
	private JTextField secondInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MelTest frame = new MelTest();
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
	public MelTest() {
		setTitle("Melquidez Lazaro Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstLabel = new JLabel("First:");
		firstLabel.setBounds(43, 54, 46, 14);
		contentPane.add(firstLabel);
		
		JLabel secondLabel = new JLabel("Second:");
		secondLabel.setBounds(43, 79, 46, 14);
		contentPane.add(secondLabel);
		
		final JLabel totalLabel = new JLabel("Total:");
		totalLabel.setBounds(91, 123, 86, 20);
		contentPane.add(totalLabel);
		
		firstInput = new JTextField();
		firstLabel.setLabelFor(firstInput);
		firstInput.setBounds(91, 38, 86, 30);
		contentPane.add(firstInput);
		firstInput.setColumns(10);
		
		secondInput = new JTextField();
		secondLabel.setLabelFor(secondInput);
		secondInput.setBounds(91, 79, 86, 31);
		contentPane.add(secondInput);
		secondInput.setColumns(10);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2;
				try{
					num1 = Integer.parseInt(firstInput.getText());
				}
				
				catch(Exception Int){
					JOptionPane.showMessageDialog(null, "False");
					return;
				}
				
				try{
					num2 = Integer.parseInt(secondInput.getText());
				}
				
				catch(Exception Int){
					JOptionPane.showMessageDialog(null, "False 2");
					return;
				}
				
				int answer = num1 + num2;
				
				totalLabel.setText("Total: " + answer);
			}
		});
		plus.setBounds(43, 165, 89, 23);
		contentPane.add(plus);
	}
}
