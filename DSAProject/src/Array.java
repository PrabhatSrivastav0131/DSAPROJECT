import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(167, 11, 180, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setForeground(new Color(255, 4, 4));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(0, 68, 132, 15);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(177, 63, 86, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(128, 0, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 12));
		create.setBounds(314, 64, 119, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_2.setForeground(new Color(255, 4, 4));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(0, 109, 175, 15);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(177, 104, 86, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="element"+elem+" inserted at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(128, 0, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 12));
		insert.setBounds(375, 135, 119, 23);
		contentPane.add(insert);
		
		JLabel lblNewLabel_3 = new JLabel("DELETE POSITION");
		lblNewLabel_3.setForeground(new Color(255, 4, 4));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_3.setBounds(13, 170, 119, 15);
		contentPane.add(lblNewLabel_3);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(188, 169, 86, 20);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		insertposition = new JTextField();
		insertposition.setBounds(430, 104, 86, 20);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("POSITION");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(255, 4, 4));
		lblNewLabel_4.setBounds(306, 109, 75, 15);
		contentPane.add(lblNewLabel_4);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Element deleted at the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 12));
		delete.setForeground(new Color(128, 0, 0));
		delete.setBounds(326, 169, 89, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg=msg+" "+arr[i];
					
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(128, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(344, 228, 89, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(173, 216, 230));
		displaybox.setBounds(86, 304, 261, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
