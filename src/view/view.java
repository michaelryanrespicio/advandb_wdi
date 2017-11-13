package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class view {

	private JFrame frame;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 314, 550);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel rollupdrilldown = new JLabel("Roll up / Drilldown");
		rollupdrilldown.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rollupdrilldown);
		rollupdrilldown.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 25));
		
		JPanel panel = new JPanel();
		panel_1.add(panel);
		panel.setLayout(new GridLayout(0, 2));
		
		JCheckBox countryName = new JCheckBox("Country Name");
		panel.add(countryName);
		
		JCheckBox data = new JCheckBox("Data");
		panel.add(data);
		
		JCheckBox income = new JCheckBox("Income");
		panel.add(income);
		
		JCheckBox region = new JCheckBox("Region");
		panel.add(region);
		
		JCheckBox seriesName = new JCheckBox("Series Name");
		panel.add(seriesName);
		
		JCheckBox seriesCategory = new JCheckBox("Series Category");
		panel.add(seriesCategory);
		
		JCheckBox yearC = new JCheckBox("YearC");
		panel.add(yearC);
		
		JLabel sliceDice = new JLabel("Slice / Dice");
		sliceDice.setHorizontalAlignment(SwingConstants.CENTER);
		sliceDice.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 25));
		panel_1.add(sliceDice);
		
		JPanel panel1 = new JPanel();
		panel_1.add(panel1);
		panel1.setLayout(new GridLayout(0, 2));
		
		JCheckBox sliceCountryName = new JCheckBox("Country Name");
		panel1.add(sliceCountryName);
		
		JCheckBox sliceData = new JCheckBox("Data");
		panel1.add(sliceData);
		
		JCheckBox sliceIncome = new JCheckBox("Income");
		panel1.add(sliceIncome);
		
		JCheckBox sliceRegion = new JCheckBox("Region");
		panel1.add(sliceRegion);
		
		JCheckBox sliceSeriesName = new JCheckBox("Series Name");
		panel1.add(sliceSeriesName);
		
		JCheckBox sliceSeriesCategory = new JCheckBox("Series Category");
		panel1.add(sliceSeriesCategory);
		
		JCheckBox sliceYearC = new JCheckBox("YearC");
		panel1.add(sliceYearC);
		panel.setLayout(new GridLayout(0, 2));
		
		JButton btnExecute = new JButton("Execute");
		btnExecute.setBounds(92, 587, 158, 63);
		frame.getContentPane().add(btnExecute);
		btnExecute.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		
		JPanel panel_2 = new JPanel();
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
		
	}
	
	
}
