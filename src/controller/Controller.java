package controller;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.DBManager;

public class Controller {
	
	private DBManager DBManager;
	
	public Controller(){
		DBManager = DBManager.getInstance();
	}
	
	public ResultSet getData(ArrayList<String> attributes, ArrayList<String> bAttributes, ArrayList<String> tables){
		return DBManager.getData(attributes, bAttributes, tables);
	}
	
	
	public double getQueryTime(){
		return DBManager.getQueryTime();
	}
	
	public ResultSet getAllCountry(){
		return DBManager.getAllCountry();
	}

	public ResultSet getAllCountryIncome(){
		return DBManager.getAllCountryIncome();
	}
	
	public ResultSet getAllCountryRegion(){
		return DBManager.getAllCountryRegion();
	}
	
	public ResultSet getAllSeries(){
		return DBManager.getAllSeries();
	}
	
	public ResultSet getAllSeriesCategory(){
		return DBManager.getAllSeriesCategory();
	}
	
	public ResultSet getAllDataByYear(){
		return DBManager.getAllDataByYear();
	}
	
}
