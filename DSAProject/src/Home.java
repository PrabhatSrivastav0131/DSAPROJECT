import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel array;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		array = new JPanel();
		array.setForeground(new Color(255, 4, 4));
		array.setBackground(new Color(255, 255, 0));
		array.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(array);
		array.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(117, 11, 199, 19);
		array.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ARRAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
				
				//Array a=new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 4, 4));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton.setBounds(155, 52, 89, 23);
		array.add(btnNewButton);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				
				new Stack().setVisible(true);
				
				
			}
		});
		stack.setForeground(new Color(255, 4, 4));
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setBounds(10, 82, 89, 23);
		array.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
			}
		});
		queue.setForeground(new Color(255, 4, 4));
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		queue.setBounds(298, 82, 89, 23);
		array.add(queue);
		
		JButton cq = new JButton("CIRCULAR QUEUE");
		cq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULARQUEUE WINDOW OPENING CODE HERE
			}
		});
		cq.setForeground(new Color(255, 4, 4));
		cq.setFont(new Font("Constantia", Font.BOLD, 12));
		cq.setBounds(10, 137, 139, 23);
		array.add(cq);
		
		JButton sll = new JButton("SINGLYLlNKEDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLY LINKEDLIST WINDOW OPENING CODE HERE
			}
		});
		sll.setFont(new Font("Constantia", Font.BOLD, 12));
		sll.setForeground(new Color(255, 4, 4));
		sll.setBounds(242, 137, 145, 23);
		array.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLY LINKED LIST WINDOW OPENING CODE HERE
			}
		});
		dll.setForeground(new Color(255, 4, 4));
		dll.setFont(new Font("Constantia", Font.BOLD, 12));
		dll.setBounds(117, 201, 159, 23);
		array.add(dll);
	}
}
