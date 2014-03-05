package movie;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class Movies extends JPanel{

	private static final long serialVersionUID = 5868937736280780583L;
	JLabel labelMovieName = new JLabel("Име на филма:");
	JLabel labelTrailer = new JLabel("Трайлър:");
	JLabel labelYear = new JLabel("Година:");
	JLabel labelDescription = new JLabel("Описание:");
	JLabel labelCategories = new JLabel("Категория:");
	
	JTextField movieName = new JTextField(10);
	JTextField movieTrailer = new JTextField(10);
	JTextField movieYear = new JTextField(5);
	JTextField searchName = new JTextField("Заглавие на филма",15);
	JTextField movieDescription = new JTextField(10);
	
	String[] categories = {"Екшън","Комедия","Ужас","Драма","Криминален","Спортен"};
	JTable dataTable = new JTable();
	JScrollPane scroller = new JScrollPane(dataTable);
	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox dropDown = new JComboBox(categories);
	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox dropDownChoice = new JComboBox(categories);
	
	JButton buttonAdd = new JButton("Запиши");
	JButton buttonSearch = new JButton("Търси");
	
	
	public Movies(){
		super();
		setLayout(new GridLayout(3,1));
		
		JPanel movieInfoPanel = new JPanel();
		movieInfoPanel.setLayout(new GridLayout(7,2,1,4));
		
		movieInfoPanel.add(labelMovieName);
		movieInfoPanel.add(movieName);
		
		movieInfoPanel.add(labelTrailer);
		movieInfoPanel.add(movieTrailer);
		
		movieInfoPanel.add(labelYear);
		movieInfoPanel.add(movieYear);
		
		movieInfoPanel.add(labelDescription);
		movieInfoPanel.add(movieDescription);
		
		movieInfoPanel.add(labelCategories);
		movieInfoPanel.add(dropDown);
		movieInfoPanel.add(new JPanel());
		movieInfoPanel.add(buttonAdd);
		
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		searchPanel.add(searchName);
		searchPanel.add(dropDownChoice);
		searchPanel.add(buttonSearch);
		
		JPanel tablePanel = new JPanel();
		dataTable.setPreferredScrollableViewportSize(new Dimension(600,150));
		dataTable.setFillsViewportHeight(true);
		tablePanel.add(scroller);
		
		add(movieInfoPanel);
		add(searchPanel);
		add(tablePanel);
	}
}