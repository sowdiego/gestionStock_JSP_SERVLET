package com.entite;

import java.util.*;


public class Sortie {

	protected int idS;
	protected Date dateS;
	protected double qtS;
	protected int puS;
	protected Stock stock;
	public Sortie() {
		
	}
	public Sortie(int idS, Date dateS, double qtS, int puS,Stock stock) {
		super();
		this.idS = idS;
		this.dateS = dateS;
		this.qtS = qtS;
		this.puS = puS;
		this.stock = stock;
	}
	public int getIdS() {
		return idS;
	}
	public void setIdS(int idS) {
		this.idS = idS;
	}
	public Date getDateS() {
		return dateS;
	}
	public void setDateS(Date dateS) {
		this.dateS = dateS;
	}
	public double getQtS() {
		return qtS;
	}
	public void setQtS(double qtS) {
		this.qtS = qtS;
	}
	public int getPuS() {
		return puS;
	}
	public void setPuS(int puS) {
		this.puS = puS;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	
	
}
