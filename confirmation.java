import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.ScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class confirmation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					confirmation frame = new confirmation();
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
	public confirmation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 10, 85, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u78BA\u8A8D\u9910\u9EDE");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnNewButton_1.setBounds(252, 222, 191, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u50F9\u683C:");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		lblNewLabel.setBounds(252, 108, 46, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("\u9910\u9EDE:");
		lblName.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		lblName.setBounds(252, 53, 59, 24);
		contentPane.add(lblName);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_2.setBounds(252, 176, 46, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("+");
		btnNewButton_2_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(397, 176, 46, 23);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(338, 178, 59, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Pic\\\u85AF\u99051.jpg"));
		lblNewLabel_1.setBounds(10, 43, 226, 199);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
