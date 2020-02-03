package fr.unice.polytech.deantoni.vrep.polycar.utils;

public class Pixel {
	
	public Pixel(String n){
		name = n;
	}
	
	public String name = "";
	public int R = 0;
	public int G = 0;
	public int B = 0;
	
	public boolean isRed() {
		return R > 220 && G < 20 && B < 20;
	}
	public boolean isBlue() {
		return R < 20 && G < 20 && B > 220;
	}
	public boolean isGreen() {
		return R < 20 && G > 220 && B < 20;
	}
	public boolean isOrange() {
		return R > 220 && G < 180 && G > 130 && B < 20;
	}
	public boolean isBlack() {
		return R < 20 && G < 20 && B < 20;
	}
	
	@Override
	public String toString() {
		return name+":      R:"+R+"  G:"+G+"  B:"+B;
	}
}
