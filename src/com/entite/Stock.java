package com.entite;

public class Stock {
	protected int idStock;
	protected String ref;
	protected String lib;
	protected double qtStock;
	
	public Stock() {
	
	}
	public Stock(String ref, String lib, double qtStock) {
		super();
		this.ref = ref;
		this.lib = lib;
		this.qtStock = qtStock;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}
	public double getQtStock() {
		return qtStock;
	}
	public void setQtStock(double qtStock) {
		this.qtStock = qtStock;
	}
	public int getIdStock() {
		return idStock;
	}
	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}
	
	
	

}
