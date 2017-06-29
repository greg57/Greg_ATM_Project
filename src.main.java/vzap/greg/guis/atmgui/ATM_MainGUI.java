package vzap.greg.guis.atmgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ATM_MainGUI extends JFrame
{

	private JPanel basePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					ATM_MainGUI frame = new ATM_MainGUI();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ATM_MainGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 783);
		basePanel = new JPanel(new GridLayout(1, 1));
		basePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(basePanel);
	}

}
