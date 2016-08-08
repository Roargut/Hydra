import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

public class Gui extends JFrame{

	private JPanel panel, panel2, panel3; //Tab 1-3
	private JTabbedPane tabs; //container for all tabs
	private JButton execute; //button to create Table
	private JScrollPane scrollPane; //container for table in tab3
	private JTextField tfAccid1, tfAccid1a, tfSecid1, tfMandant;
	private JLabel lblMandant,lblAccid1, lblSecid1;
	

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Gui() {
		initializeMain();
		this.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeMain() {
		
		this.setBounds(100, 100, 640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Generate RT_ACC");
		panel = new JPanel(); 
		
		//Container Tabs
		tabs = new JTabbedPane();
		
		//Tab1
		panel = new JPanel();
		tabs.addTab("Primary Keys / Must", panel);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.weighty = 1;
		
		lblMandant = new JLabel("F001: Mandant");
		c.gridx = 0;
		c.gridy = 0;
		panel.add(lblMandant, c);
		tfMandant = new JTextField("vererbt");
		c.gridx = 1;
		c.gridy = 0;
		panel.add(tfMandant, c);
		
		lblAccid1 = new JLabel("ACCID1: Geschäftsfall ID");
		c.gridx = 0;
		c.gridy = 1;
		panel.add(lblAccid1, c);
		tfAccid1 = new JTextField("id20stellen");
		c.gridx = 1;
		c.gridy = 1;
		panel.add(tfAccid1, c);
		tfAccid1a = new JTextField("anzahl");
		c.gridx = 2;
		c.gridy = 1;
		panel.add(tfAccid1a, c);
		
		JSeparator sep = new JSeparator(SwingConstants.HORIZONTAL);
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 3;
		panel.add(sep, c);
		
		lblSecid1 = new JLabel("SECID1: ISIN");
		c.gridx = 0;
		c.gridy = 5;
		panel.add(lblSecid1, c);
		tfSecid1 = new JTextField();
		c.gridx = 1;
		c.gridy = 5;
		panel.add(tfSecid1, c);
		
		execute = new JButton("exec");
		c.anchor = GridBagConstraints.PAGE_END;
		panel.add(execute, c);
		
		//Tab2
		panel2 = new JPanel();
		tabs.addTab("Optional", panel2);
		panel2.setLayout(new GridBagLayout());
		
		//Tab3
		panel3 = new JPanel();
		tabs.addTab("Result", panel3);
		scrollPane = new JScrollPane(); //add Table in this container
		
		//set all Tooltipps
		lblMandant.setToolTipText("varchar(20) rel nE");
		lblAccid1.setToolTipText("varchar(100) random nE");
		lblSecid1.setToolTipText("varchar(12) fixed");
				
		this.getContentPane().add(tabs);
		//this.setVisible(true);
	}
	/*
	 * Add Listeners
	 */
		//exec Button
	void addExecListener(ActionListener listenForExecBtn){
		execute.addActionListener(listenForExecBtn); //???????????
	}
	
	/*
	 * Getters&Setters for Controller
	 */
	public String getMandant(){
		return tfMandant.getText();
	}
	public String getAccid1(){
		return tfAccid1.getText();
	}
	public String getAccid1a(){
		return tfAccid1a.getText();
	}

	void displayErrorMessage(String errorMsg){
		JOptionPane.showMessageDialog(this, errorMsg);
	}
}
