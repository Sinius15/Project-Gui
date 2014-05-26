package com.sinius15;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.sinius15.original.OriginalFrame;
import com.sinius15.person1.SinFrame;
import com.sinius15.person2.LFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Start thiss;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Start() {
		thiss = this;
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e2) {
			e2.printStackTrace();
		}
		
		setResizable(false);
		setTitle("Alarm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 174, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOriginal = new JButton("Original");
		btnOriginal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OriginalFrame f = new OriginalFrame();
				f.setVisible(true);
				f.setLocationRelativeTo(thiss);
				thiss.dispose();
			}
		});
		btnOriginal.setBounds(10, 11, 147, 32);
		contentPane.add(btnOriginal);
		
		JButton btnSijmen = new JButton("Redesign 1");
		btnSijmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinFrame f = new SinFrame();
				f.setVisible(true);
				f.setLocationRelativeTo(thiss);
				thiss.dispose();
			}
		});
		btnSijmen.setBounds(10, 54, 147, 32);
		contentPane.add(btnSijmen);
		
		JButton btnLars = new JButton("Redesign 2");
		btnLars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LFrame f = new LFrame();
				f.setVisible(true);
				f.setLocationRelativeTo(thiss);
				thiss.dispose();
			}
		});
		btnLars.setBounds(10, 97, 147, 32);
		contentPane.add(btnLars);
		setLocationRelativeTo(null);
	}
}
