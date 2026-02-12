package cir.java.NewYear_maven;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class NewYear26Maven extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Timer timer;
	int maxY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewYear26Maven frame = new NewYear26Maven();
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
	public NewYear26Maven() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		maxY = getHeight();

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		

		
		JLabel snowFlake = new JLabel("❄");
		snowFlake.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake.setForeground(new Color(255, 255, 255));
		snowFlake.setBounds(46, 275, 44, 44);
		panel.add(snowFlake);

		JLabel snowFlake_1 = new JLabel("❄");
		snowFlake_1.setForeground(Color.WHITE);
		snowFlake_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_1.setBounds(227, 101, 44, 44);
		panel.add(snowFlake_1);

		JLabel snowFlake_2 = new JLabel("❄");
		snowFlake_2.setForeground(Color.WHITE);
		snowFlake_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_2.setBounds(494, 101, 44, 44);
		panel.add(snowFlake_2);

		JLabel snowFlake_3 = new JLabel("❄");
		snowFlake_3.setForeground(Color.WHITE);
		snowFlake_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_3.setBounds(643, 87, 44, 44);
		panel.add(snowFlake_3);

		JLabel snowFlake_4 = new JLabel("❄");
		snowFlake_4.setForeground(Color.WHITE);
		snowFlake_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_4.setBounds(547, 30, 44, 44);
		panel.add(snowFlake_4);

		JLabel snowFlake_5 = new JLabel("❄");
		snowFlake_5.setForeground(Color.WHITE);
		snowFlake_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_5.setBounds(352, 30, 44, 44);
		panel.add(snowFlake_5);

		JLabel snowFlake_6 = new JLabel("❄");
		snowFlake_6.setForeground(Color.WHITE);
		snowFlake_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_6.setBounds(56, 100, 44, 44);
		panel.add(snowFlake_6);

		JLabel snowFlake_7 = new JLabel("❄");
		snowFlake_7.setForeground(Color.WHITE);
		snowFlake_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_7.setBounds(195, 235, 44, 44);
		panel.add(snowFlake_7);

		JLabel snowFlake_8 = new JLabel("❄");
		snowFlake_8.setForeground(Color.WHITE);
		snowFlake_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_8.setBounds(352, 179, 44, 44);
		panel.add(snowFlake_8);

		JLabel snowFlake_9 = new JLabel("❄");
		snowFlake_9.setForeground(Color.WHITE);
		snowFlake_9.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_9.setBounds(511, 235, 44, 44);
		panel.add(snowFlake_9);

		JLabel snowFlake_10 = new JLabel("❄");
		snowFlake_10.setForeground(Color.WHITE);
		snowFlake_10.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_10.setBounds(704, 211, 44, 44);
		panel.add(snowFlake_10);

		JLabel snowFlake_11 = new JLabel("❄");
		snowFlake_11.setForeground(Color.WHITE);
		snowFlake_11.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_11.setBounds(614, 326, 44, 44);
		panel.add(snowFlake_11);

		JLabel snowFlake_12 = new JLabel("❄");
		snowFlake_12.setForeground(Color.WHITE);
		snowFlake_12.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_12.setBounds(141, 395, 45, 45);
		panel.add(snowFlake_12);

		JLabel snowFlake_13 = new JLabel("❄");
		snowFlake_13.setForeground(Color.WHITE);
		snowFlake_13.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_13.setBounds(511, 428, 45, 45);
		panel.add(snowFlake_13);

		JLabel snowFlake_14 = new JLabel("❄");
		snowFlake_14.setForeground(Color.WHITE);
		snowFlake_14.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_14.setBounds(703, 475, 45, 45);
		panel.add(snowFlake_14);

		JLabel snowFlake_15 = new JLabel("❄");
		snowFlake_15.setForeground(Color.WHITE);
		snowFlake_15.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_15.setBounds(22, 508, 45, 45);
		panel.add(snowFlake_15);

		JLabel snowFlake_16 = new JLabel("❄");
		snowFlake_16.setForeground(Color.WHITE);
		snowFlake_16.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_16.setBounds(255, 490, 45, 45);
		panel.add(snowFlake_16);

		JLabel snowFlake_17 = new JLabel("❄");
		snowFlake_17.setForeground(Color.WHITE);
		snowFlake_17.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_17.setBounds(340, 335, 45, 45);
		panel.add(snowFlake_17);

		JLabel snowFlake_18 = new JLabel("❄");
		snowFlake_18.setForeground(Color.WHITE);
		snowFlake_18.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_18.setBounds(433, 541, 45, 45);
		panel.add(snowFlake_18);

		JLabel snowFlake_19 = new JLabel("❄");
		snowFlake_19.setForeground(Color.WHITE);
		snowFlake_19.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_19.setBounds(614, 552, 45, 45);
		panel.add(snowFlake_19);

		JLabel snowFlake_20 = new JLabel("❄");
		snowFlake_20.setForeground(Color.WHITE);
		snowFlake_20.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		snowFlake_20.setBounds(141, 541, 45, 45);
		panel.add(snowFlake_20);
		
		JLabel newYearTree = new JLabel("");
		newYearTree.setIcon(new ImageIcon(NewYear26Maven.class.getResource("/res/img/png-transparent-christmas-tree-pine-fir-three-rows-of-christmas-tree-leaf-holidays-tree-branch.png")));
		newYearTree.setBounds(321, 440, 147, 203);
		panel.add(newYearTree);
		
		timer = new Timer(15, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				snowFlake.setLocation(snowFlake.getX(),	snowFlake.getY() > maxY ? 10:snowFlake.getY()+1);
				snowFlake_1.setLocation(snowFlake_1.getX(),	snowFlake_1.getY() > maxY ? 10:snowFlake_1.getY()+1);
				snowFlake_2.setLocation(snowFlake_2.getX(),	snowFlake_2.getY() > maxY ? 10:snowFlake_2.getY()+1);
				snowFlake_3.setLocation(snowFlake_3.getX(),	snowFlake_3.getY() > maxY ? 10:snowFlake_3.getY()+1);
				snowFlake_4.setLocation(snowFlake_4.getX(),	snowFlake_4.getY() > maxY ? 10:snowFlake_4.getY()+1);
				snowFlake_5.setLocation(snowFlake_5.getX(),	snowFlake_5.getY() > maxY ? 10:snowFlake_5.getY()+1);
				snowFlake_6.setLocation(snowFlake_6.getX(),	snowFlake_6.getY() > maxY ? 10:snowFlake_6.getY()+1);
				snowFlake_7.setLocation(snowFlake_7.getX(),	snowFlake_7.getY() > maxY ? 10:snowFlake_7.getY()+1);
				snowFlake_8.setLocation(snowFlake_8.getX(),	snowFlake_8.getY() > maxY ? 10:snowFlake_8.getY()+1);
				snowFlake_9.setLocation(snowFlake_9.getX(),	snowFlake_9.getY() > maxY ? 10:snowFlake_9.getY()+1);
				snowFlake_10.setLocation(snowFlake_10.getX(),	snowFlake_10.getY() > maxY ? 10:snowFlake_10.getY()+1);
				snowFlake_11.setLocation(snowFlake_11.getX(),	snowFlake_11.getY() > maxY ? 10:snowFlake_11.getY()+1);
				snowFlake_12.setLocation(snowFlake_12.getX(),	snowFlake_12.getY() > maxY ? 10:snowFlake_12.getY()+1);
				snowFlake_13.setLocation(snowFlake_13.getX(),	snowFlake_13.getY() > maxY ? 10:snowFlake_13.getY()+1);
				snowFlake_14.setLocation(snowFlake_14.getX(),	snowFlake_14.getY() > maxY ? 10:snowFlake_14.getY()+1);
				snowFlake_15.setLocation(snowFlake_15.getX(),	snowFlake_15.getY() > maxY ? 10:snowFlake_15.getY()+1);
				snowFlake_16.setLocation(snowFlake_16.getX(),	snowFlake_16.getY() > maxY ? 10:snowFlake_16.getY()+1);
				snowFlake_17.setLocation(snowFlake_17.getX(),	snowFlake_17.getY() > maxY ? 10:snowFlake_17.getY()+1);
				snowFlake_18.setLocation(snowFlake_18.getX(),	snowFlake_18.getY() > maxY ? 10:snowFlake_18.getY()+1);
				snowFlake_19.setLocation(snowFlake_19.getX(),	snowFlake_19.getY() > maxY ? 10:snowFlake_19.getY()+1);
				snowFlake_20.setLocation(snowFlake_20.getX(),	snowFlake_20.getY() > maxY ? 10:snowFlake_20.getY()+1);

			}
		});
		timer.start();
		
	}

}
