package model;

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
	
}
