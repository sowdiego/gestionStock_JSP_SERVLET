package com.dao;

import java.util.List;

import com.entite.Entree;

public interface IEntree {
	public int add(Entree entree);
	public int delete(int ref);
	public int update(Entree entree);
	public int get(int ref);
	public List<Entree> liste();
}
