package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBManager {
	private static DBManager dbManager = new DBManager();
	private DBConnection connection;
	private QueryBuilder qBuilder;
	private double queryTime;
	
	//initializes the DB manager
	private DBManager(){
		connection = DBConnection.getInstance();
		qBuilder = new QueryBuilder();
	}
	
	public static DBManager getInstance(){
		return dbManager;
	}
	
	public ResultSet getData( ArrayList<String> attributes, ArrayList<String> bAttributes, ArrayList<String> tables )
	{
		PreparedStatement ps;
		String sql = qBuilder.buildQuery(attributes, bAttributes, tables);
		
		System.out.println(sql);
		
		try
		{
			ps = connection.getConnection().prepareStatement(sql);

			double start = System.currentTimeMillis();
			ResultSet rs = ps.executeQuery();
			double end = System.currentTimeMillis();
			
			queryTime = end - start;
			
			return rs;
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block3w
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ResultSet getAllCountry(){
		PreparedStatement ps;
		String sql = "SELECT * FROM country";
		
		try{
			ps = connection.getConnection().prepareStatement(sql);
			
			double start = System.currentTimeMillis();
			ResultSet rs = ps.executeQuery();
			double end = System.currentTimeMillis();
			
			return rs;
			
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ResultSet getAllCountryIncome(){
		PreparedStatement ps;
		String sql = "SELECT * FROM countryincome";
		
		try{
			ps = connection.getConnection().prepareStatement(sql);
			
			double start = System.currentTimeMillis();
			ResultSet rs = ps.executeQuery();
			double end = System.currentTimeMillis();
			
			return rs;
			
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ResultSet getAllCountryRegion(){
		PreparedStatement ps;
		String sql = "SELECT * FROM countryregion";
		
		try{
			ps = connection.getConnection().prepareStatement(sql);
			
			double start = System.currentTimeMillis();
			ResultSet rs = ps.executeQuery();
			double end = System.currentTimeMillis();
			
			return rs;
			
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ResultSet getAllSeries(){
		PreparedStatement ps;
		String sql = "SELECT * FROM series";
		
		try{
			ps = connection.getConnection().prepareStatement(sql);
			
			double start = System.currentTimeMillis();
			ResultSet rs = ps.executeQuery();
			double end = System.currentTimeMillis();
			
			return rs;
			
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ResultSet getAllSeriesCategory(){
		PreparedStatement ps;
		String sql = "SELECT * FROM seriescategory";
		
		try{
			ps = connection.getConnection().prepareStatement(sql);
			
			double start = System.currentTimeMillis();
			ResultSet rs = ps.executeQuery();
			double end = System.currentTimeMillis();
			
			return rs;
			
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ResultSet getAllDataByYear(){
		PreparedStatement ps;
		String sql = "SELECT * FROM databyyear";
		
		try{
			ps = connection.getConnection().prepareStatement(sql);
			
			double start = System.currentTimeMillis();
			ResultSet rs = ps.executeQuery();
			double end = System.currentTimeMillis();
			
			return rs;
			
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public double getQueryTime()
	{
		return queryTime;
	}
}
