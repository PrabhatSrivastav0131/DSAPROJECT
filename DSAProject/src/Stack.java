import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(188, 11, 181, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1.setBounds(24, 69, 148, 15);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(224, 67, 86, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack creation code
				
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Stack of size "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setFont(new Font("Tahoma", Font.BOLD, 12));
		stack.setForeground(new Color(165, 42, 42));
		stack.setBounds(162, 107, 123, 23);
		contentPane.add(stack);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_2.setBounds(24, 164, 117, 15);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(159, 162, 86, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "push not possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push successfull");
					element.setText("");
				}
				
			}
		});
		push.setFont(new Font("Tahoma", Font.BOLD, 12));
		push.setForeground(new Color(165, 42, 42));
		push.setBounds(350, 161, 89, 23);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code
				
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Pop not possible");
				}
				else {
					String message="Element deleted is: "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		pop.setForeground(new Color(165, 42, 42));
		pop.setFont(new Font("Tahoma", Font.BOLD, 12));
		pop.setBounds(188, 216, 89, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=top;i>=0;i--) {
						msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(165, 42, 42));
		display.setFont(new Font("Tahoma", Font.BOLD, 12));
		display.setBounds(188, 262, 89, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(128, 311, 324, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
