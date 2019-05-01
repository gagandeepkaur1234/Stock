package Stockgrabber.yahoo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Color;

public class gagan extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gagan frame = new gagan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gagan() {
		GetHistory obj= new GetHistory();
		
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultCategoryDataset d= new DefaultCategoryDataset();
				d.setValue(20, "gagan", "marks");
				d.setValue(10, "gagan1", "marks1");
				d.setValue(30, "gagan2", "marks2");
				JFreeChart abc= ChartFactory.createBarChart("Marks", "x axis", "y axis", d);
//ChartFactory.createLineChart("Chart", "date", "price", dataset, PlotOrientation.VERTICAL, true, true, true);
				CategoryPlot plot=abc.getCategoryPlot();
				plot.setRangeGridlinePaint(Color.black);
				ChartFrame ch=new ChartFrame("data",abc,true);
				ch.setVisible(true);
				ch.setSize(500,400);
			}
		});
		btnNewButton.setBounds(76, 313, 79, 29);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setActionCommand("Gaganb1");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
	}
}
