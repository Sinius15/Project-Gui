package com.sinius15.person1;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlarmEditor extends JFrame {

	private static final long serialVersionUID = 5501990503938304002L;
	private static AlarmEditor thiss;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JCheckBox checkBox_5;
	private JCheckBox checkBox_4;
	private JCheckBox checkBox_3;
	private JCheckBox checkBox_2;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox;
	private JCheckBox checkBox_6;
	private JButton btnAdd;

	public AlarmEditor() {
		thiss = this;
		setResizable(false);
		setTitle("Alarm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		checkBox = new JCheckBox("Saturday");
		checkBox.setBounds(263, 34, 76, 23);
		contentPane.add(checkBox);
		
		checkBox_1 = new JCheckBox("Friday");
		checkBox_1.setBounds(263, 8, 76, 23);
		contentPane.add(checkBox_1);
		
		checkBox_2 = new JCheckBox("Thursday");
		checkBox_2.setBounds(164, 86, 76, 23);
		contentPane.add(checkBox_2);
		
		checkBox_3 = new JCheckBox("Wednesday");
		checkBox_3.setBounds(164, 60, 97, 23);
		contentPane.add(checkBox_3);
		
		checkBox_4 = new JCheckBox("Tuesday");
		checkBox_4.setBounds(164, 34, 97, 23);
		contentPane.add(checkBox_4);
		
		checkBox_5 = new JCheckBox("Monday");
		checkBox_5.setBounds(164, 8, 97, 23);
		contentPane.add(checkBox_5);
		
		checkBox_6 = new JCheckBox("Sunday");
		checkBox_6.setBounds(263, 60, 76, 23);
		contentPane.add(checkBox_6);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01", "0"}));
		comboBox.setBounds(10, 59, 38, 20);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel(":");
		label.setBounds(51, 62, 13, 14);
		contentPane.add(label);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_1.setBounds(58, 59, 38, 20);
		contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"AM", "PM"}));
		comboBox_2.setBounds(106, 59, 41, 20);
		contentPane.add(comboBox_2);
		
		comboBox_3 = new JComboBox<String>();
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_3.setBounds(61, 86, 86, 20);
		contentPane.add(comboBox_3);
		
		JLabel label_1 = new JLabel("Alarm:");
		label_1.setBounds(10, 89, 38, 14);
		contentPane.add(label_1);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 11, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(51, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(10, 38, 46, 14);
		contentPane.add(lblTime);
		
		btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinFrame.thiss.alarms.add(new SAlarm(thiss));
				SinFrame.thiss.updateGui();
				thiss.dispose();
				SinFrame.thiss.setEnabled(true);
				SinFrame.thiss.requestFocus();
			}
		});
		btnAdd.setBounds(263, 86, 76, 23);
		contentPane.add(btnAdd);
	}
	public JTextField getNameField() {
		return textField;
	}
	public JComboBox<String> getHours() {
		return comboBox;
	}
	public JComboBox<?> getMinutes() {
		return comboBox_1;
	}
	public JComboBox<?> getAmPm() {
		return comboBox_2;
	}
	public JComboBox<?> getAlarm() {
		return comboBox_3;
	}
	public JCheckBox getMa() {
		return checkBox_5;
	}
	public JCheckBox getDi() {
		return checkBox_4;
	}
	public JCheckBox getWo() {
		return checkBox_3;
	}
	public JCheckBox getDo() {
		return checkBox_2;
	}
	public JCheckBox getVr() {
		return checkBox_1;
	}
	public JCheckBox getZa() {
		return checkBox;
	}
	public JCheckBox getZo() {
		return checkBox_6;
	}
}
