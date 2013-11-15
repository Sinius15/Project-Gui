package com.sinius15.person2;

public class LAlarm {

	public String hours = "", minutes = "", AmPm = "", alarm = "";
	public boolean ma, di, wo, don, vr, za, zo;
	
	public String toString(){
		String out = hours + ":" + minutes +" "+ AmPm + "  ";
		if(ma) out += "mo,";
		if(di) out += "tu,";
		if(wo) out += "we,";
		if(don) out += "th,";
		if(vr) out += "fr,";
		if(za) out += "sa,";
		if(zo) out += "su,";
		return out;
	}
	
	public LAlarm(String hours, String minutes, String AmPm, String alarm, 
			boolean ma, boolean di, boolean wo, boolean don, boolean vr, 
			boolean za, boolean zo){
		
		this.hours = hours;
		this.minutes = minutes;
		this.AmPm = AmPm;
		this.alarm = alarm;
		
		this.ma = ma;
		this.di = di;
		this.wo = wo;
		this.don = don;
		this.vr = vr;
		this.za = za;
		this.zo = zo;
	}
	
}
