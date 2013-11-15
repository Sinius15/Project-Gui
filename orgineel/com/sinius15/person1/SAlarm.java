package com.sinius15.person1;

public class SAlarm {

	public String hours = "", minutes = "", AmPm = "", alarm = "", name = "";
	public boolean ma, di, wo, don, vr, za, zo;
	
	public SAlarm(AlarmEditor f){
		name = f.getNameField().getText();
		hours = (String) f.getHours().getSelectedItem();
		minutes = (String) f.getMinutes().getSelectedItem();
		AmPm = (String) f.getAmPm().getSelectedItem();
		alarm = (String) f.getAlarm().getSelectedItem();
		
		ma = f.getMa().isSelected();
		di = f.getDi().isSelected();
		wo = f.getWo().isSelected();
		don = f.getDo().isSelected();
		vr = f.getVr().isSelected();
		za = f.getZa().isSelected();
		zo = f.getZo().isSelected();
	}
	
	public SAlarm(String s){
		name = s.split(" ")[0];
		s = s.replace(s.split(" ")[0] + " ", "");
		hours = s.substring(0, 2);
		s = s.replace(s.substring(0, 3), "");
		minutes = s.substring(0, 2);
		s = s.replace(s.substring(0, 3), "");
		AmPm = s.substring(0,2);
		s = s.replace(s.substring(0, 4), "");
		
		if(!(s.length() > 0))
			return;
		String[] split = s.split(",");
		for(String a : split){
			if(a.equals("mo")) ma = true;
			if(a.equals("tu")) di = true;
			if(a.equals("we")) wo = true;
			if(a.equals("th")) don = true;
			if(a.equals("fr")) vr = true;
			if(a.equals("sa")) za = true;
			if(a.equals("su")) zo = true;
		}
	}
	
	public AlarmEditor getFrame(){
		AlarmEditor f = new AlarmEditor();
		
		f.getNameField().setText(name);
		f.getHours().setSelectedItem(hours);
		f.getMinutes().setSelectedItem(minutes);
		f.getAmPm().setSelectedItem(AmPm);
		f.getAlarm().setSelectedItem(alarm);
		
		f.getMa().setSelected(ma);
		f.getDi().setSelected(di);
		f.getWo().setSelected(wo);
		f.getDo().setSelected(don);
		f.getVr().setSelected(vr);
		f.getZa().setSelected(za);
		f.getZo().setSelected(zo);
		
		return f;
	}
	
	public String toString(){
		String out =  name + " " + hours + ":" + minutes +" "+ AmPm + "  ";
		if(ma) out += "mo,";
		if(di) out += "tu,";
		if(wo) out += "we,";
		if(don) out += "th,";
		if(vr) out += "fr,";
		if(za) out += "sa,";
		if(zo) out += "su,";
		return out;
	}
	
}
