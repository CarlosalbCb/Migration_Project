package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.Component;
import javax.swing.JScrollPane;

public class Connection_Window extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtConnectionName;
	private JTextField txtHostName;
	private JTextField txtDataBaseName;
	private JTextField txtPortNumber;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Connection_Window dialog = new Connection_Window();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Connection_Window() {
		setBounds(100, 100, 450, 415);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(null, "New Connection", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel.add(panel_1, BorderLayout.NORTH);
				{
					JLabel lblConnectionName = new JLabel("Connection Name:");
					panel_1.add(lblConnectionName);
				}
				{
					txtConnectionName = new JTextField();
					panel_1.add(txtConnectionName);
					txtConnectionName.setColumns(10);
				}
			}
		}
		{
			JSplitPane splitPane = new JSplitPane();
			contentPanel.add(splitPane, BorderLayout.CENTER);
			{
				JPanel panel = new JPanel();
				panel.setBorder(new TitledBorder(null, "Connection Type", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				splitPane.setLeftComponent(panel);
				{
					DefaultListModel<String> modelo = new DefaultListModel<String>();
					modelo.addElement("MySQL");
					modelo.addElement("MSSQL Server");
					modelo.addElement("Neo4j");
					panel.setLayout(new BorderLayout(0, 0));
					{
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
						panel.add(scrollPane, BorderLayout.NORTH);
						JList<String> list = new JList<String>();
						list.setModel(modelo);
						scrollPane.setViewportView(list);
					}
					
					
					
				}
			}
			{
				JPanel panel = new JPanel();
				panel.setBorder(new TitledBorder(null, "Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				splitPane.setRightComponent(panel);
				panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
				{
					JLabel lblHostName = new JLabel("Host Name:");
					panel.add(lblHostName);
				}
				{
					txtHostName = new JTextField();
					panel.add(txtHostName);
					txtHostName.setColumns(10);
				}
				{
					JLabel lblDataBaseName = new JLabel("Database Name:");
					panel.add(lblDataBaseName);
				}
				{
					txtDataBaseName = new JTextField();
					panel.add(txtDataBaseName);
					txtDataBaseName.setColumns(10);
				}
				{
					JLabel lblPortNumber = new JLabel("Port Number:");
					panel.add(lblPortNumber);
				}
				{
					txtPortNumber = new JTextField();
					txtPortNumber.setAlignmentY(Component.BOTTOM_ALIGNMENT);
					panel.add(txtPortNumber);
					txtPortNumber.setColumns(10);
				}
				{
					JLabel lblUserName = new JLabel("User Name:");
					panel.add(lblUserName);
				}
				{
					txtUserName = new JTextField();
					panel.add(txtUserName);
					txtUserName.setColumns(10);
				}
				{
					JLabel lblPassword = new JLabel("Password:");
					panel.add(lblPassword);
				}
				{
					txtPassword = new JTextField();
					panel.add(txtPassword);
					txtPassword.setColumns(10);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnTestConnection = new JButton("Test Connection");
				btnTestConnection.setHorizontalAlignment(SwingConstants.LEFT);
				btnTestConnection.setMnemonic('T');
				btnTestConnection.setActionCommand("Ok");
				buttonPane.add(btnTestConnection);
				getRootPane().setDefaultButton(btnTestConnection);
			}
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
			{
				JButton btnSave = new JButton("Save");
				buttonPane.add(btnSave);
			}
		}
	}

}
