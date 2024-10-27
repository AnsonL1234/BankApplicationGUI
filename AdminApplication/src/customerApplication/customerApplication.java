package customerApplication;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class customerApplication extends JFrame{
	private JMenu setting, account, languages;
	private JMenuItem quiteFunction;
	private JMenuBar menuFrames;
	
	//general reference variable
	private JPanel topPanel, bottomPanel;
	
	//top panel reference variable
	private JPanel nPanel, cPanel, sPanel;
	private JLabel balanceLabel, currencySymbol, totalBalance;
	
	//set the width and height for the frame that cannot be change
	private final int WIDTH = 800, HEIGHT = 400;
	
	//set the total balance for the account
	private double totalBalances = 0.00;
	
	private String[] settingList = {"Account Detail","Personal Detail","Statement","Transaction","Spending Detail"};
	private String[] functionList = {"Add Money","Withdraw","Account Detail","Transaction","Currentcy Account"};
	private String[] currencySetting = {"EUR","USD","GBP","SGD","JPY","MYR"};
	
	public customerApplication() {
		super("Sky Bank Application");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuFrame();
		topPanel();
		
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
	
	//setting the menu setting on top of the windows
	public void menuFrame() {
		setting = new JMenu("Setting");
		setting.add(new JMenuItem("About us"));
		setting.add(new JMenuItem("Exchange Rate"));
		setting.add(new JMenuItem("Close Account"));
		
		//set separate line between it
		setting.addSeparator();
		setting.add("Forgot Password");
		quiteFunction = new JMenuItem("Sign Out");
		
		//setting a short cut in the program
		quiteFunction.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK));
		
		//add action function in the program
		quiteFunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setting.add(quiteFunction);
		
		//setting menu 2
		account = new JMenu("Account");
		for (int i = 0; i < 4; i++) {
			account.add(new JMenuItem(settingList[i]));
		}
		
		//setting menu 3
		languages = new JMenu("languages");
		languages.add(new JMenuItem("Languages Setting"));
		
		menuFrames = new JMenuBar();
		menuFrames.add(setting);
		menuFrames.add(account);
		menuFrames.add(languages);
		
		//push everything to the frame
		this.setJMenuBar(menuFrames);
	}
	
	//top panel of the GUI
	public void topPanel() {
		topPanel = new JPanel();
		
		topNPanel();
		topCPanel();
		topSPanel();
		
		topPanel.setLayout(new GridLayout(3,1));
		topPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
		this.add(topPanel, BorderLayout.NORTH);
		
	}
	
	//north side of the top panel
	public void topNPanel() {
		nPanel = new JPanel();
		balanceLabel = new JLabel("Total Balance");
		
		balanceLabel.setFont(new Font("Arial",Font.BOLD, 24));
		
		nPanel.add(balanceLabel);
		topPanel.add(nPanel, BorderLayout.NORTH);
	}
	
	//center side of the top panel
	public void topCPanel() {
		cPanel = new JPanel();
		currencySymbol = new JLabel("EUR");
		totalBalance = new JLabel(String.valueOf(totalBalances));
		
		currencySymbol.setFont(new Font("Arial",~Font.BOLD, 16));
		totalBalance.setFont(new Font("Arial",~Font.BOLD, 16));
		
		cPanel.add(currencySymbol);
		cPanel.add(totalBalance);
		
		cPanel.setLayout(new FlowLayout());
		topPanel.add(cPanel, BorderLayout.CENTER);
	}
	
	//south side of the top panel
	public void topSPanel() {
		sPanel = new JPanel();
		
		for (int i = 0; i < 5; i++) {
			
			//input all the value in array into button
			JButton button = new JButton(functionList[i]);
			
			//setting all the action in the array value
			button.setActionCommand(functionList[i]);
			
			//setting up the action for the button
			buttonFunction(button);
			
			//adding all the button to the panel
			sPanel.add(button);
		}
		
		sPanel.setLayout(new GridLayout(1,5,3,3));
		topPanel.add(sPanel, BorderLayout.SOUTH);
	}
	
	//pure method for all action of the button
	public void buttonFunction(JButton button) {
		button.addActionListener(e -> {
			String actionCommand = e.getActionCommand();
			
			if (actionCommand.equals("Add Money")) {
				
			} else if (actionCommand.equals("Withdraw")) {
				
			}
		});
	}
	
	public void bottomPanel() {
		bottomPanel = new JPanel();
	}
}
