package vzap.greg.guis.atmgui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ATM_Panel extends JPanel
{
	private JPanel centerPanel;
	private JPanel westPanel;
	private JPanel eastPanel;
	private JPanel southPanel;
	private JPanel keyPanel;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JPanel cashDispencerPanel;
	private JTextField cashDispencerJTF;
	private JLabel cashDispencerLabel;
	private JPanel northPanel;
	private JButton btn200;
	private JButton btn100;
	private JButton btn50;
	private JButton btn20;
	private JButton btn10;
	private JButton btnOther;

	/**
	 * Create the panel.
	 */
	public ATM_Panel()
	{
		setLayout(new BorderLayout(0, 0));

		centerPanel = new JPanel();
		add(centerPanel, BorderLayout.CENTER);

		westPanel = new JPanel();
		westPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(westPanel, BorderLayout.WEST);

		btn200 = new JButton("R200");
		btn200.setFont(new Font("Tahoma", Font.BOLD, 20));

		btn100 = new JButton("R100");
		btn100.setFont(new Font("Tahoma", Font.BOLD, 20));

		btn50 = new JButton(" R50 ");
		btn50.setFont(new Font("Tahoma", Font.BOLD, 20));

		btn20 = new JButton("R20");
		btn20.setFont(new Font("Tahoma", Font.BOLD, 20));

		btn10 = new JButton("R10");
		btn10.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnOther = new JButton("Other");
		btnOther.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_westPanel = new GroupLayout(westPanel);
		gl_westPanel.setHorizontalGroup(gl_westPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_westPanel.createSequentialGroup().addGap(5)
						.addGroup(gl_westPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btn50, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(btn20, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(btn10, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(btn100, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(btn200, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(btnOther, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
						.addContainerGap()));
		gl_westPanel.setVerticalGroup(gl_westPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_westPanel.createSequentialGroup().addGap(5).addComponent(btn200).addGap(37)
						.addComponent(btn100, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(37)
						.addComponent(btn50, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(32)
						.addComponent(btn20, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(30)
						.addComponent(btn10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
						.addComponent(btnOther, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)));
		westPanel.setLayout(gl_westPanel);

		eastPanel = new JPanel();
		add(eastPanel, BorderLayout.EAST);

		southPanel = new JPanel();
		southPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(southPanel, BorderLayout.SOUTH);

		keyPanel = new JPanel();
		keyPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		keyPanel.setLayout(new GridLayout(4, 3, 0, 0));

		button = new JButton("1");
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button);

		button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_1.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_1);

		button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_2.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_2);

		button_3 = new JButton("4");
		button_3.setIconTextGap(1);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_3.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_3);

		button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_4.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_4);

		button_5 = new JButton("6");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_5.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_5);

		button_6 = new JButton("7");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_6.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_6);

		button_7 = new JButton("8");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_7.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_7);

		button_8 = new JButton("9");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_8.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_8);

		button_9 = new JButton("Cancel");
		button_9.setForeground(Color.RED);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_9.setBorder(new LineBorder(new Color(255, 0, 0)));
		keyPanel.add(button_9);

		button_10 = new JButton("0");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_10.setBorder(new LineBorder(Color.RED));
		keyPanel.add(button_10);

		button_11 = new JButton("Enter");
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_11.setBackground(new Color(0, 255, 127));
		keyPanel.add(button_11);

		cashDispencerPanel = new JPanel();
		cashDispencerPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		cashDispencerPanel.setBackground(Color.GREEN);

		cashDispencerLabel = new JLabel("Cash Dispencer");
		cashDispencerLabel.setForeground(Color.BLUE);
		cashDispencerLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_southPanel = new GroupLayout(southPanel);
		gl_southPanel.setHorizontalGroup(gl_southPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_southPanel.createSequentialGroup().addGap(56)
						.addComponent(keyPanel,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_southPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_southPanel.createSequentialGroup().addGap(58)
										.addComponent(cashDispencerPanel, GroupLayout.DEFAULT_SIZE, 265,
												Short.MAX_VALUE)
										.addGap(34))
								.addGroup(Alignment.TRAILING,
										gl_southPanel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(cashDispencerLabel).addGap(80)))));
		gl_southPanel.setVerticalGroup(gl_southPanel.createParallelGroup(Alignment.TRAILING).addGroup(
				gl_southPanel.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_southPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(keyPanel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.TRAILING,
										gl_southPanel.createSequentialGroup()
												.addComponent(cashDispencerPanel, GroupLayout.PREFERRED_SIZE, 54,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(cashDispencerLabel).addGap(23)))));

		cashDispencerJTF = new JTextField();
		cashDispencerJTF.setForeground(Color.WHITE);
		cashDispencerJTF.setBackground(Color.BLACK);
		cashDispencerJTF.setColumns(10);
		GroupLayout gl_cashDispencerPanel = new GroupLayout(cashDispencerPanel);
		gl_cashDispencerPanel.setHorizontalGroup(gl_cashDispencerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cashDispencerPanel.createSequentialGroup().addContainerGap()
						.addComponent(cashDispencerJTF, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
						.addContainerGap()));
		gl_cashDispencerPanel.setVerticalGroup(gl_cashDispencerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cashDispencerPanel.createSequentialGroup()
						.addContainerGap().addComponent(cashDispencerJTF, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(17, Short.MAX_VALUE)));
		cashDispencerPanel.setLayout(gl_cashDispencerPanel);
		southPanel.setLayout(gl_southPanel);

		northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);

	}
}
