package driver;


import model.DBConnection;
import view.view;
import controller.Controller;

public class Driver {
	
	
	private static DBConnection db;
	
	public static void main(String[] args){
		
		Controller c = new Controller();
		new view(c);
		//db = DBConnection.getInstance();
		
	}
}
