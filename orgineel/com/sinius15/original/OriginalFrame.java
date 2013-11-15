package com.sinius15.original;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;

import javax.swing.JLayeredPane;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class OriginalFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public OriginalFrame() {
		setResizable(false);
		setTitle("Alarm - Original");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Daily Alarms", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 383, 209);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxSunday = new JCheckBox("Sunday");
		chckbxSunday.setBounds(16, 21, 97, 23);
		panel.add(chckbxSunday);
		
		JCheckBox chckbxMonday = new JCheckBox("Monday");
		chckbxMonday.setBounds(16, 47, 97, 23);
		panel.add(chckbxMonday);
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(16, 99, 97, 23);
		panel.add(chckbxWednesday);
		
		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setBounds(16, 73, 97, 23);
		panel.add(chckbxTuesday);
		
		JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setBounds(16, 177, 97, 23);
		panel.add(chckbxSaturday);
		
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(16, 151, 97, 23);
		panel.add(chckbxFriday);
		
		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setBounds(16, 125, 97, 23);
		panel.add(chckbxThursday);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}));
		comboBox.setBounds(113, 22, 38, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}));
		comboBox_1.setBounds(113, 51, 38, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}));
		comboBox_2.setBounds(113, 77, 38, 20);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}));
		comboBox_3.setBounds(113, 102, 38, 20);
		panel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}));
		comboBox_4.setBounds(113, 129, 38, 20);
		panel.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}));
		comboBox_5.setBounds(113, 155, 38, 20);
		panel.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}));
		comboBox_6.setBounds(113, 180, 38, 20);
		panel.add(comboBox_6);
		
		JLabel label = new JLabel(":");
		label.setBounds(154, 25, 13, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel(":");
		label_1.setBounds(154, 51, 13, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel(":");
		label_2.setBounds(154, 77, 13, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel(":");
		label_3.setBounds(154, 103, 13, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel(":");
		label_4.setBounds(154, 129, 13, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel(":");
		label_5.setBounds(154, 158, 13, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel(":");
		label_6.setBounds(154, 181, 13, 14);
		panel.add(label_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_7.setBounds(161, 22, 38, 20);
		panel.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_8.setBounds(161, 50, 38, 20);
		panel.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_9.setBounds(161, 76, 38, 20);
		panel.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_10.setBounds(161, 102, 38, 20);
		panel.add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_11.setBounds(161, 129, 38, 20);
		panel.add(comboBox_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_12.setBounds(161, 155, 38, 20);
		panel.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_13.setBounds(161, 180, 38, 20);
		panel.add(comboBox_13);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_14.setBounds(209, 22, 41, 20);
		panel.add(comboBox_14);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_15.setBounds(209, 51, 41, 20);
		panel.add(comboBox_15);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_16.setBounds(209, 76, 41, 20);
		panel.add(comboBox_16);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_17.setBounds(209, 102, 41, 20);
		panel.add(comboBox_17);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_18.setBounds(209, 128, 41, 20);
		panel.add(comboBox_18);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_19.setBounds(209, 154, 41, 20);
		panel.add(comboBox_19);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_20.setBounds(209, 180, 41, 20);
		panel.add(comboBox_20);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_21.setBounds(298, 22, 68, 20);
		panel.add(comboBox_21);
		
		JLabel lblAlarm = new JLabel("Alarm:");
		lblAlarm.setBounds(260, 25, 46, 14);
		panel.add(lblAlarm);
		
		JLabel label_7 = new JLabel("Alarm:");
		label_7.setBounds(260, 53, 46, 14);
		panel.add(label_7);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_22.setBounds(298, 50, 68, 20);
		panel.add(comboBox_22);
		
		JLabel label_8 = new JLabel("Alarm:");
		label_8.setBounds(260, 79, 46, 14);
		panel.add(label_8);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_23.setBounds(298, 76, 68, 20);
		panel.add(comboBox_23);
		
		JLabel label_9 = new JLabel("Alarm:");
		label_9.setBounds(260, 105, 46, 14);
		panel.add(label_9);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_24.setBounds(298, 102, 68, 20);
		panel.add(comboBox_24);
		
		JLabel label_10 = new JLabel("Alarm:");
		label_10.setBounds(260, 131, 46, 14);
		panel.add(label_10);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_25.setBounds(298, 128, 68, 20);
		panel.add(comboBox_25);
		
		JLabel label_11 = new JLabel("Alarm:");
		label_11.setBounds(260, 157, 46, 14);
		panel.add(label_11);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_26.setBounds(298, 154, 68, 20);
		panel.add(comboBox_26);
		
		JLabel label_12 = new JLabel("Alarm:");
		label_12.setBounds(260, 183, 46, 14);
		panel.add(label_12);
		
		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setModel(new DefaultComboBoxModel(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_27.setBounds(298, 180, 68, 20);
		panel.add(comboBox_27);
		
		JCheckBox chckbxSingleAlarm = new JCheckBox("Single Alarm");
		chckbxSingleAlarm.setBounds(27, 229, 97, 23);
		contentPane.add(chckbxSingleAlarm);
		
		JComboBox comboBox_28 = new JComboBox();
		comboBox_28.setModel(new DefaultComboBoxModel(new String[] {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"}));
		comboBox_28.setBounds(124, 232, 38, 20);
		contentPane.add(comboBox_28);
		
		JLabel label_13 = new JLabel(":");
		label_13.setBounds(165, 233, 13, 14);
		contentPane.add(label_13);
		
		JComboBox comboBox_29 = new JComboBox();
		comboBox_29.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_29.setBounds(172, 232, 38, 20);
		contentPane.add(comboBox_29);
		
		JComboBox comboBox_30 = new JComboBox();
		comboBox_30.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		comboBox_30.setBounds(220, 232, 41, 20);
		contentPane.add(comboBox_30);
		
		JLabel label_14 = new JLabel("Alarm:");
		label_14.setBounds(271, 235, 46, 14);
		contentPane.add(label_14);
		
		JComboBox comboBox_31 = new JComboBox();
		comboBox_31.setModel(new DefaultComboBoxModel(new String[] {"Default", "Danse", "La vateria ", "Cobone"}));
		comboBox_31.setBounds(309, 232, 68, 20);
		contentPane.add(comboBox_31);
		
		JButton btnSetAlarms = new JButton("Set Alarms");
		btnSetAlarms.setBounds(403, 7, 85, 23);
		contentPane.add(btnSetAlarms);
		
		JButton btnQuite = new JButton("Quite");
		btnQuite.setBounds(403, 33, 84, 23);
		contentPane.add(btnQuite);
		
		JLabel lblSnoozeDelay = new JLabel("Snooze Delay:");
		lblSnoozeDelay.setBounds(33, 270, 76, 14);
		contentPane.add(lblSnoozeDelay);
		
		textField = new JTextField();
		textField.setText("5");
		textField.setBounds(106, 267, 25, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setBounds(134, 270, 46, 14);
		contentPane.add(lblMinutes);
	}
}
