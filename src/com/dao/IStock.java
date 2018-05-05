package com.dao;

import java.util.List;

import com.entite.Stock;



public interface IStock {
public int add(Stock stock);
public int delete(int ref);
public int update(Stock stock);
public int get(int ref);
public List<Stock> liste();
}
