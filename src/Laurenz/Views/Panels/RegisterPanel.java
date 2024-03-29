package Laurenz.Views.Panels;

import Laurenz.Models.RegisterTable;
import Laurenz.Views.MainWindow;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class RegisterPanel
{
	/* Main variables */
	RegisterPanel registerPanel;
	MainWindow mw;
	RegisterTable registerTable;
	/* JStuff */
	JPanel jPanel;
	JTable jTable;

	public RegisterPanel(MainWindow mw)
	{
		this.mw = mw;
		createPanel();
	}

	public void createPanel()
	{
		jPanel = new JPanel();
		jPanel.setLayout( new BorderLayout() );
		jPanel.setBackground( Color.pink );
		jPanel.setBorder( BorderFactory.createTitledBorder(" Register Panel "));

		createTable();
	}

	public void createTable()
	{
		JScrollPane jScrollPane;

		registerTable 	= new RegisterTable(mw);
		jTable 			= new JTable(registerTable);
		jScrollPane		= new JScrollPane(jTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


		jScrollPane.setSize( jPanel.getSize() );
		jTable.setShowGrid(true);
		jPanel.add(jScrollPane);
	}

	public RegisterPanel getRegisterPanel() {
		return registerPanel;
	}

	public void setRegisterPanel(RegisterPanel registerPanel) {
		this.registerPanel = registerPanel;
	}

	public MainWindow getMw() {
		return mw;
	}

	public void setMw(MainWindow mw) {
		this.mw = mw;
	}

	public RegisterTable getRegisterTable() {
		return registerTable;
	}

	public void setRegisterTable(RegisterTable registerTable) {
		this.registerTable = registerTable;
	}

	public JPanel getjPanel() {
		return jPanel;
	}

	public void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}

	public JTable getjTable() {
		return jTable;
	}

	public void setjTable(JTable jTable) {
		this.jTable = jTable;
	}
}
