package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entite.Stock;
import com.mysql.jdbc.PreparedStatement;



public class ImpStock implements IStock {

	private DB db;
	private int ok;
	private ResultSet rs;

	public  ImpStock()  {
		db = new DB();
	}

	@Override
	public int add(Stock stock) {
		String sql ="INSERT INTO stock VALUES(NULL, ?, ?, ?)";
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, stock.getRef());
			db.getPstm().setString(2, stock.getLib());
			db.getPstm().setDouble(3, stock.getQtStock());
			ok = db.executeMAJ();
			//recuperation de ID auto_increment
			rs = db.getPstm().getGeneratedKeys();
			while (rs.next()) {
				ok = rs.getInt(1);
			}
			rs.close();
			db.closeConnexion();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int delete(int ref) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Stock stock) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int get(int ref) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Stock> liste() {
		List<Stock> ls = new ArrayList<Stock>();
		String sql = "SELECT *  FROM stock";
		try {
			db.initPrepare(sql);
			rs =db.executeSELECT();
			while (rs.next()) {
				Stock s = new Stock();
				s.setIdStock(rs.getInt(1));
				s.setRef(rs.getString(2));
				s.setLib(rs.getString(3));
				s.setQtStock(rs.getDouble(4));
				ls.add(s);


			}
			rs.close();
			db.closeConnexion();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

}
