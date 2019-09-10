package com.intothemobile.ifa.values;

public enum ItmConstants {
	PAGE_META;
	
	@Override
	public String toString() {
		return "_ITM_C_"+name().toString()+"_";
	}
}
