package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import controller.Controller;

public class view {
	
	private Controller controller;
	
	private JFrame frame;
	
	private ArrayList<String> attributes;
	private ArrayList<String> bAttributes;
	private ArrayList<String> tables;
	
	public view(Controller controller){
		this.controller = controller;
		
		attributes = new ArrayList<String>(0);
		bAttributes = new ArrayList<String>(0);
		tables = new ArrayList<String>(0);
		
		attributes.add("countrycode");
		attributes.add("seriescode");
		
		initialize();
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(102, 153, 102), 2, true));
		panel.setBounds(10, 88, 314, 201);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(0, 1, 157, 27);
		panel.add(lblID);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);
		
		JCheckBox chckbxCountryCode = new JCheckBox("Country Code");
		chckbxCountryCode.setBounds(157, 1, 157, 27);
		panel.add(chckbxCountryCode);
		
		JCheckBox chckbxSeriesCode = new JCheckBox("Series Code");
		chckbxSeriesCode.setBounds(0, 28, 157, 27);
		panel.add(chckbxSeriesCode);
		
		JLabel lblNewLabel = new JLabel("Country");
		panel.add(lblNewLabel);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_1);
		
		JCheckBox chckbxName = new JCheckBox("Name");
		panel.add(chckbxName);
		
		JCheckBox chckbxIncome = new JCheckBox("Income");
		panel.add(chckbxIncome);
		
		JCheckBox chckbxRegion = new JCheckBox("Region");
		panel.add(chckbxRegion);
		GridLayout gl_panel = new GridLayout(0, 2);
		gl_panel.setVgap(5);
		panel.setLayout(gl_panel);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_2);
		
		JLabel lblNewLabel_1 = new JLabel("Series");
		panel.add(lblNewLabel_1);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3);
		
		JCheckBox chckbxSeriesName = new JCheckBox("Name");
		panel.add(chckbxSeriesName);
		
		JCheckBox chckbxSeriesCategory = new JCheckBox("Category");
		panel.add(chckbxSeriesCategory);
		
		JLabel lblNewLabel_2 = new JLabel("Data by Year");
		panel.add(lblNewLabel_2);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4);
		
		JCheckBox chckbxYear = new JCheckBox("Year");
		panel.add(chckbxYear);
		
		JCheckBox chckbxData = new JCheckBox("Data");
		panel.add(chckbxData);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(153, 204, 153), 2, true));
		panel1.setBounds(10, 380, 314, 196);
		frame.getContentPane().add(panel1);
		GridLayout gl_panel1 = new GridLayout(0, 2);
		gl_panel1.setVgap(5);
		panel1.setLayout(gl_panel1);
		
		JLabel lblcountryName = new JLabel("Country Name");
		lblcountryName.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		panel1.add(lblcountryName);
		
		JComboBox<String> cNameList = new JComboBox<String>();
		panel1.add(cNameList);
		
		JLabel lblCountryIncome = new JLabel("Country Income");
		lblCountryIncome.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		panel1.add(lblCountryIncome);
		
		JComboBox<String> cIncomeList = new JComboBox<String>();
		panel1.add(cIncomeList);
		
		JLabel lblCountryRegion = new JLabel("Country Region");
		lblCountryRegion.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		panel1.add(lblCountryRegion);
		
		JComboBox<String> cRegionList = new JComboBox<String>();
		panel1.add(cRegionList);
		
		JLabel lblseriesCategory = new JLabel("Series Category");
		lblseriesCategory.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		panel1.add(lblseriesCategory);
		
		JComboBox<String> sCategoryList = new JComboBox<String>();
		panel1.add(sCategoryList);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		panel1.add(lblYear);
		
		JComboBox<String> yearList = new JComboBox<String>();
		panel1.add(yearList);
		
		JButton btnExecute = new JButton("Execute");
		btnExecute.setBounds(92, 587, 158, 63);
		frame.getContentPane().add(btnExecute);
		btnExecute.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 204, 153), 2, true));
		panel_2.setBounds(334, 88, 940, 562);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(334, 11, 940, 70);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel rowsReturned = new JLabel("Rows Returned: ");
		rowsReturned.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		panel_3.add(rowsReturned);
		
		JLabel queryRuntime = new JLabel("Query Runtime:");
		queryRuntime.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		panel_3.add(queryRuntime);
		
		JLabel rollupdrilldown = new JLabel("Roll up / Drilldown");
		rollupdrilldown.setBounds(10, 39, 202, 26);
		frame.getContentPane().add(rollupdrilldown);
		rollupdrilldown.setHorizontalAlignment(SwingConstants.CENTER);
		rollupdrilldown.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 25));
		
		JLabel sliceDice = new JLabel("Slice / Dice");
		sliceDice.setBounds(10, 323, 119, 26);
		frame.getContentPane().add(sliceDice);
		sliceDice.setHorizontalAlignment(SwingConstants.CENTER);
		sliceDice.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 25));
		
		frame.setVisible(true);
		frame.setTitle("ADVANDB MCO2");
		frame.setResizable(false);
	}
}
