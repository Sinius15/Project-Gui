package com.sinius15.person1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class SinFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static SinFrame thiss;
	private JList<String> list;
	public ArrayList<SAlarm> alarms = new ArrayList<>();

	public SinFrame() {
		thiss = this;
		setResizable(false);
		setTitle("Alarm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 28, 414, 258);
		contentPane.add(list);
		
		JLabel lblAlarms = new JLabel("Alarms:");
		lblAlarms.setBounds(10, 11, 46, 14);
		contentPane.add(lblAlarms);
		
		JButton btnNewAlarm = new JButton("New Alarm");
		btnNewAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AlarmEditor e = new AlarmEditor();
				e.setVisible(true);
				e.setLocationRelativeTo(thiss);
				thiss.setEnabled(false);
			}
		});
		btnNewAlarm.setBounds(10, 297, 91, 23);
		contentPane.add(btnNewAlarm);
		
		JButton btnEditAlarm = new JButton("Edit Alarm");
		btnEditAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getList().getSelectedIndex() == -1)
					return;
				AlarmEditor a = new SAlarm(getList().getSelectedValue()).getFrame();
				a.setVisible(true);
				alarms.remove(getList().getSelectedIndex());
			}
		});
		btnEditAlarm.setBounds(111, 297, 91, 23);
		contentPane.add(btnEditAlarm);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(333, 297, 91, 23);
		contentPane.add(btnQuit);
		
		JButton btnRemoveAlarm = new JButton("Remove Alarm");
		btnRemoveAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(getList().getSelectedIndex() == -1)
					return;
				alarms.remove(getList().getSelectedIndex());
				updateGui();
			}
		});
		btnRemoveAlarm.setBounds(212, 297, 111, 23);
		contentPane.add(btnRemoveAlarm);
	}
	
	public void updateGui(){
		String[] t = new String[alarms.size()];
		int i = 0;
		System.out.println(alarms.size());
		for(SAlarm m : alarms){
			t[i] = m.toString();
			i++;
		}
		getList().setListData(t);
	}

	public JList<String> getList() {
		return list;
	}
}
