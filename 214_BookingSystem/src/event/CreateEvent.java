package event;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class CreateEvent extends JFrame{
	static CreateEvent frame;
	private JPanel contentPane;
	private JTextField eventName;
	private JTextField eventId;
	private JTextField venue;
	private JTextField date;
	private JTextField time;
	private JTextField maxCap;
	private JTextField price;
	public JButton createButton;
	public JButton cancelButton;

	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new CreateEvent();
					frame.setResizable(false);
					frame.pack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
			
	public CreateEvent() {
		super("Main > Create event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 250, 450, 500);
		contentPane = new JPanel(new GridBagLayout());
		contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
		setContentPane(contentPane);
		GridBagConstraints grid = new GridBagConstraints();
		GridBagConstraints gridtext = new GridBagConstraints();
		GridBagConstraints gridbtn = new GridBagConstraints();
		GridBagConstraints gridtitle = new GridBagConstraints();
		
		JLabel pageTitle = new JLabel("Event Creation");
		pageTitle.setFont(new Font("Tahoma", Font.PLAIN,30));
		pageTitle.setBorder(new EmptyBorder(5, 5, 20, 5));
		gridtitle.gridx = 2;
		gridtitle.gridy = 0;
		gridtitle.anchor = GridBagConstraints.FIRST_LINE_START;
		add(pageTitle, gridtitle);
		
		JLabel eventIdLabel = new JLabel("Event ID:");
		eventIdLabel.setFont(new Font("Tahoma", Font.PLAIN,20));
		eventIdLabel.setBorder(new EmptyBorder(5, 5, 10, 10));
		eventId = new JTextField(idCreate());
		eventId.setColumns(15);
		eventId.setFont(new Font("Tahoma", Font.PLAIN,20));
		eventId.setEditable(false);
		grid.gridx = 1;
		grid.gridy = 1;
		grid.anchor = GridBagConstraints.FIRST_LINE_START;
		add(eventIdLabel, grid);
		gridtext.gridx = 2;
		gridtext.gridy = 1;
		gridtext.anchor = GridBagConstraints.FIRST_LINE_START;
		add(eventId, gridtext);
		
		JLabel eventNameLabel = new JLabel ("Event name:");
		eventNameLabel.setFont(new Font("Tahoma", Font.PLAIN,20));
		eventNameLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		eventName = new JTextField();
		eventName.setColumns(15);
		eventName.setFont(new Font("Tahoma", Font.PLAIN,20));
		grid.gridx = 1;
		grid.gridy = 2;
		add(eventNameLabel, grid);
		gridtext.gridx = 2;
		gridtext.gridy = 2;
		add(eventName, gridtext);
		
		JLabel dateLabel = new JLabel("Date:");
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN,20));
		dateLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		date = new JTextField();
		date.setColumns(15);
		date.setFont(new Font("Tahoma", Font.PLAIN,20));
		grid.gridx = 1;
		grid.gridy = 3;
		add(dateLabel, grid);
		gridtext.gridx = 2;
		gridtext.gridy = 3;
		add(date, gridtext);
		
		JLabel timeLabel = new JLabel("Time:");
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN,20));
		timeLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		time = new JTextField();
		time.setColumns(15);
		time.setFont(new Font("Tahoma", Font.PLAIN,20));
		grid.gridx = 1;
		grid.gridy = 4;
		add(timeLabel, grid);
		gridtext.gridx = 2;
		gridtext.gridy = 4;
		add(time, gridtext);
		
		JLabel venueLabel = new JLabel("Event venue:");
		venueLabel.setFont(new Font("Tahoma", Font.PLAIN,20));
		venueLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		venue = new JTextField();
		venue.setColumns(15);
		venue.setFont(new Font("Tahoma", Font.PLAIN,20));
		grid.gridx = 1;
		grid.gridy = 5;
		add(venueLabel, grid);
		gridtext.gridx = 2;
		gridtext.gridy = 5;
		add(venue, gridtext);
		
		JLabel priceLabel = new JLabel("Price:");
		priceLabel.setFont(new Font("Tahoma", Font.PLAIN,20));
		priceLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		price = new JTextField();
		price.setColumns(15);
		price.setFont(new Font("Tahoma", Font.PLAIN,20));
		grid.gridx = 1;
		grid.gridy = 6;
		add(priceLabel, grid);
		gridtext.gridx = 2;
		gridtext.gridy = 6;
		add(price, gridtext);
		
		JLabel capacityLabel = new JLabel("Capacity:");
		capacityLabel.setFont(new Font("Tahoma", Font.PLAIN,20));
		capacityLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		maxCap = new JTextField();
		maxCap.setColumns(15);
		maxCap.setFont(new Font("Tahoma", Font.PLAIN,20));
		grid.gridx = 1;
		grid.gridy = 7;
		add(capacityLabel, grid);
		gridtext.gridx = 2;
		gridtext.gridy = 7;
		add(maxCap, gridtext);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN,15));
		grid.gridx = 1;
		grid.gridy = 8;
		grid.anchor = GridBagConstraints.SOUTHWEST;
		add(cancelButton, grid);
		
		JButton createButton = new JButton("Create Event!");
		createButton.setFont(new Font("Tahoma", Font.PLAIN,20));
		createButton.setPreferredSize(new Dimension(258, 60));
		gridbtn.gridx = 2;
		gridbtn.gridy = 8;
		add(createButton, gridbtn);
		
	}
		
	public static String idCreate() {
		int num = ((int)(Math.random()*99999));
		char chra;
		switch((int)(Math.random()*5)) {
			case 0 : chra = 'A';
				break;
			case 1 : chra = 'B';
				break;
			case 2 : chra = 'C';
				break;
			case 3 : chra = 'D';
				break;
			case 4 : chra = 'E';
				break;
			default: chra = 'F';
		}
		
		return String.format("%s%05d",chra, num);
	}
}
