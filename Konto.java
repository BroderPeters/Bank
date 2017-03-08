package de.oszimt.bank;

import java.util.ArrayList;
import java.util.List;

public class Konto {
	
	private int bankleitzahl;
	private int kontonummer;
	private double kontostand = 0;
	private ArrayList<Kunde> inhaber = new ArrayList<Kunde>();
	
	/**
	 * 
	 * @param ersterInhaber
	 * @param knr
	 */
	public Konto(Kunde ersterInhaber, int knr) {
		inhaber.add(ersterInhaber);
		kontonummer = knr;
	}
	
	/**
	 * 
	 * @param zahl
	 */
	public void einzahlen(double zahl) {
		if (zahl > 0) {x
			kontostand += zahl;	
		}		
	}
	/**
	 * 
	 * @return double
	 */
	public double getKontoStand() {
		return kontostand;
	}
	/**
	 * 
	 * @param zahl
	 * @return boolean
	 */
	public boolean abheben(float zahl) {
		if (zahl > 0 && kontostand >= zahl) {
			kontostand -= zahl;
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @return Kunde
	 */
	public Kunde getFirstKontoInhaber() {
		return inhaber.get(0);
	}
}

