package de.oszimt.bank;

public class Kunde {

	private String name;
	private int kundennr;
	
	public Kunde(String name, int kundennr){
		this.name = name;
		this.kundennr = kundennr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKundennr() {
		return kundennr;
	}

	public void setKundennr(int kundennr) {
		this.kundennr = kundennr;
	}
}
