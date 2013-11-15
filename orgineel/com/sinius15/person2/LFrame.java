package com.sinius15.person2;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ListSelectionModel;

public class LFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	public ArrayList<LAlarm> alarms = new ArrayList<>();
	private JList<String> list;
	private JComboBox<String> amPm;
	private JCheckBox mo;
	private JCheckBox tu;
	private JCheckBox sa;
	private JComboBox<String> alarm;
	private JCheckBox fr;
	private JComboBox<String> mins;
	private JCheckBox we;
	private JComboBox<String> hours;
	private JCheckBox th;
	private JCheckBox su;

	public LFrame() {
		setResizable(false);
		setTitle("Alarm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 214);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 11, 266, 85);
		contentPane.add(list);
		
		JButton btnDelete = new JButton("remove");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(getList().getSelectedIndex() == -1)
					return;
				alarms.remove(getList().getSelectedIndex());
				updateAlarmGui();
			}
		});
		btnDelete.setBounds(286, 73, 91, 23);
		contentPane.add(btnDelete);
		
		JButton btnAdd = new JButton("save");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alarms.add(new LAlarm(
						(String) getHours().getSelectedItem(), 
						(String) getMins().getSelectedItem(), 
						(String) getAmPm().getSelectedItem(), 
						(String) getAlarm().getSelectedItem(), 
						getMo().isSelected(), 
						getTu().isSelected(), 
						getWe().isSelected(), 
						getTh().isSelected(), 
						getFr().isSelected(), 
						getSa().isSelected(), 
						getSu().isSelected()));
				updateAlarmGui();
				
				getHours().setSelectedIndex(0);
				getMins().setSelectedIndex(0);
				getAmPm().setSelectedIndex(0);
				getAlarm().setSelectedIndex(0);
				getMo().setSelected(false);
				getTu().setSelected(false);
				getWe().setSelected(false);
				getTh().setSelected(false);
				getFr().setSelected(false);
				getSa().setSelected(false);
				getSu().setSelected(false);
			}
		});
		btnAdd.setBounds(286, 106, 91, 23);
		contentPane.add(btnAdd);
		
		hours = new JComboBox<String>();
		hours.setModel(new DefaultComboBoxModel<String>(new String[] {"12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01"}));
		hours.setBounds(10, 107, 38, 20);
		contentPane.add(hours);
		
		JLabel label_2 = new JLabel(":");
		label_2.setBounds(51, 110, 13, 14);
		contentPane.add(label_2);
		
		mins = new JComboBox<String>();
		mins.setModel(new DefaultComboBoxModel<String>(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		mins.setBounds(58, 107, 38, 20);
		contentPane.add(mins);
		
		amPm = new JComboBox<String>();
		amPm.setModel(new DefaultComboBoxModel<String>(new String[] {"AM", "PM"}));
		amPm.setBounds(106, 107, 41, 20);
		contentPane.add(amPm);
		
		alarm = new JComboBox<String>();
		alarm.setModel(new DefaultComboBoxModel<String>(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		alarm.setBounds(190, 107, 86, 20);
		contentPane.add(alarm);
		
		JLabel label_3 = new JLabel("Alarm:");
		label_3.setBounds(157, 110, 38, 14);
		contentPane.add(label_3);
		
		JButton btnEdit = new JButton("edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getList().getSelectedIndex() == -1)
					return;
				LAlarm a = alarms.get(getList().getSelectedIndex());
				alarms.remove(getList().getSelectedIndex());
				
				getHours().setSelectedItem(a.hours);
				getMins().setSelectedItem(a.minutes);
				getAmPm().setSelectedItem(a.AmPm);
				getAlarm().setSelectedItem(a.alarm);
				getMo().setSelected(a.ma);
				getTu().setSelected(a.di);
				getWe().setSelected(a.wo);
				getTh().setSelected(a.don);
				getFr().setSelected(a.vr);
				getSa().setSelected(a.za);
				getSu().setSelected(a.zo);
				updateAlarmGui();
			}
		});
		btnEdit.setBounds(286, 39, 91, 23);
		contentPane.add(btnEdit);
		
		JButton btnSetAlarms = new JButton("set alarms");
		btnSetAlarms.setBounds(286, 8, 91, 23);
		contentPane.add(btnSetAlarms);
		
		mo = new JCheckBox("Monday");
		mo.setBounds(10, 134, 63, 23);
		contentPane.add(mo);
		
		tu = new JCheckBox("Tuesday");
		tu.setBounds(81, 134, 67, 23);
		contentPane.add(tu);
		
		we = new JCheckBox("Wednesday");
		we.setBounds(147, 134, 86, 23);
		contentPane.add(we);
		
		th = new JCheckBox("Thursday");
		th.setBounds(10, 160, 76, 23);
		contentPane.add(th);
		
		fr = new JCheckBox("Friday");
		fr.setBounds(81, 160, 55, 23);
		contentPane.add(fr);
		
		sa = new JCheckBox("Saturday");
		sa.setBounds(147, 160, 76, 23);
		contentPane.add(sa);
		
		su = new JCheckBox("Sunday");
		su.setBounds(225, 160, 76, 23);
		contentPane.add(su);
	}
	
	public void updateAlarmGui(){
		String[] t = new String[alarms.size()];
		int i = 0;
		System.out.println(alarms.size());
		for(LAlarm m : alarms){
			t[i] = m.toString();
			i++;
		}
		getList().setListData(t);
	}
	
	public JList<String> getList() {
		return list;
	}
	public JCheckBox getFr() {
		return fr;
	}
	public JCheckBox getMo() {
		return mo;
	}
	public JComboBox<String> getHours() {
		return hours;
	}
	public JCheckBox getTh() {
		return th;
	}
	public JCheckBox getTu() {
		return tu;
	}
	public JCheckBox getSu() {
		return su;
	}
	public JCheckBox getWe() {
		return we;
	}
	public JComboBox<String> getAmPm() {
		return amPm;
	}
	public JComboBox<String> getMins() {
		return mins;
	}
	public JCheckBox getSa() {
		return sa;
	}
	public JComboBox<String> getAlarm() {
		return alarm;
	}
}
