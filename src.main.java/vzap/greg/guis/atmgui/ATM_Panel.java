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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

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
	private JButton btnWithdraw;
	private JButton btnDeposit;
	private JButton btnCurrentAccount;
	private JButton btnSavingsAccount;
	private JButton btnCancel;
	private JPanel basePanel;
	private JLabel lblMessage;
	private JLabel lblTransactionType;
	private JPanel cardPanel;
	private JTextField cardJTF;
	private JLabel lblCardReader;

	/**
	 * Create the panel.
	 */
	public ATM_Panel(JPanel basePanel)
	{
		setBorder(new EmptyBorder(10, 10, 10, 10));
		this.basePanel = basePanel;
		centerPanel = new JPanel();
		centerPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		westPanel = new JPanel();
		westPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

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
		gl_westPanel.setHorizontalGroup(gl_westPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_westPanel
				.createSequentialGroup().addGap(5)
				.addGroup(gl_westPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btn200, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
						.addComponent(btnOther, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
						.addComponent(btn10, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
						.addComponent(btn20, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
						.addComponent(btn50, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
						.addComponent(btn100, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
				.addContainerGap()));
		gl_westPanel.setVerticalGroup(gl_westPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_westPanel.createSequentialGroup().addGap(5).addComponent(btn200)
						.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
						.addComponent(btn100, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(46)
						.addComponent(btn50, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(50)
						.addComponent(btn20, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(43)
						.addComponent(btn10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(43)
						.addComponent(btnOther, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)));
		westPanel.setLayout(gl_westPanel);

		eastPanel = new JPanel();

		southPanel = new JPanel();
		southPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

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
		cashDispencerLabel.setFont(new Font("Tahoma", Font.BOLD, 26));

		cardPanel = new JPanel();
		cardPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		cardPanel.setBackground(Color.GREEN);

		cardJTF = new JTextField();
		cardJTF.setForeground(Color.WHITE);
		cardJTF.setColumns(10);
		cardJTF.setBackground(Color.BLACK);
		GroupLayout gl_cardPanel = new GroupLayout(cardPanel);
		gl_cardPanel.setHorizontalGroup(gl_cardPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 650, Short.MAX_VALUE).addGroup(gl_cardPanel.createSequentialGroup().addContainerGap()
						.addComponent(cardJTF, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE).addContainerGap()));
		gl_cardPanel.setVerticalGroup(gl_cardPanel.createParallelGroup(Alignment.LEADING).addGap(0, 74, Short.MAX_VALUE)
				.addGroup(gl_cardPanel.createSequentialGroup().addContainerGap()
						.addComponent(cardJTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));
		cardPanel.setLayout(gl_cardPanel);

		lblCardReader = new JLabel("Card Reader");
		lblCardReader.setForeground(Color.BLUE);
		lblCardReader.setFont(new Font("Tahoma", Font.BOLD, 26));
		GroupLayout gl_southPanel = new GroupLayout(southPanel);
		gl_southPanel.setHorizontalGroup(gl_southPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_southPanel
				.createSequentialGroup().addGap(54)
				.addComponent(keyPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGap(64)
				.addGroup(gl_southPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_southPanel.createSequentialGroup().addComponent(cashDispencerLabel).addGap(251))
						.addGroup(gl_southPanel.createSequentialGroup()
								.addComponent(cashDispencerPanel, GroupLayout.PREFERRED_SIZE, 650,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
						.addGroup(gl_southPanel.createSequentialGroup()
								.addComponent(cardPanel, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())))
				.addGroup(Alignment.TRAILING, gl_southPanel.createSequentialGroup()
						.addContainerGap(644, Short.MAX_VALUE)
						.addComponent(lblCardReader, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addGap(237)));
		gl_southPanel.setVerticalGroup(gl_southPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_southPanel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_southPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_southPanel
						.createSequentialGroup()
						.addComponent(cashDispencerPanel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(cashDispencerLabel).addGap(18)
						.addComponent(cardPanel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addComponent(keyPanel, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
				.addGap(5).addComponent(lblCardReader, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));

		cashDispencerJTF = new JTextField();
		cashDispencerJTF.setForeground(Color.WHITE);
		cashDispencerJTF.setBackground(Color.BLACK);
		cashDispencerJTF.setColumns(10);
		GroupLayout gl_cashDispencerPanel = new GroupLayout(cashDispencerPanel);
		gl_cashDispencerPanel.setHorizontalGroup(gl_cashDispencerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cashDispencerPanel.createSequentialGroup().addContainerGap()
						.addComponent(cashDispencerJTF, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
						.addContainerGap()));
		gl_cashDispencerPanel.setVerticalGroup(gl_cashDispencerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cashDispencerPanel.createSequentialGroup().addContainerGap()
						.addComponent(cashDispencerJTF, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));
		cashDispencerPanel.setLayout(gl_cashDispencerPanel);
		southPanel.setLayout(gl_southPanel);

		northPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(northPanel, GroupLayout.PREFERRED_SIZE, 953, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(westPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(centerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGap(18)
								.addComponent(eastPanel, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGap(21).addComponent(southPanel,
								GroupLayout.PREFERRED_SIZE, 1101, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(northPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(eastPanel, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
								.addComponent(westPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(centerPanel, 0, 0, Short.MAX_VALUE))
						.addGap(18)
						.addComponent(southPanel, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
						.addGap(24)));

		lblTransactionType = new JLabel("");
		lblTransactionType.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactionType.setForeground(Color.RED);
		lblTransactionType.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
		GroupLayout gl_centerPanel = new GroupLayout(centerPanel);
		gl_centerPanel.setHorizontalGroup(gl_centerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_centerPanel.createSequentialGroup().addGap(166)
						.addComponent(lblTransactionType, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(220, Short.MAX_VALUE)));
		gl_centerPanel.setVerticalGroup(
				gl_centerPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_centerPanel.createSequentialGroup()
						.addGap(31).addComponent(lblTransactionType).addContainerGap(389, Short.MAX_VALUE)));
		centerPanel.setLayout(gl_centerPanel);

		lblMessage = new JLabel("VZAP Bank");
		lblMessage.setForeground(new Color(0, 128, 0));
		lblMessage.setFont(new Font("Tahoma", Font.BOLD, 40));
		northPanel.add(lblMessage);

		btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new BtnDepositActionListener());
		btnDeposit.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnCurrentAccount = new JButton("Current Account");
		btnCurrentAccount.addActionListener(new BtnCurrentAccountActionListener());
		btnCurrentAccount.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnSavingsAccount = new JButton("Savings Account");
		btnSavingsAccount.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new BtnCancelActionListener());
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_eastPanel = new GroupLayout(eastPanel);
		gl_eastPanel.setHorizontalGroup(gl_eastPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_eastPanel
				.createSequentialGroup()
				.addGroup(gl_eastPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_eastPanel.createSequentialGroup().addContainerGap(34, Short.MAX_VALUE)
								.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_eastPanel.createSequentialGroup().addContainerGap(34, Short.MAX_VALUE)
								.addGroup(gl_eastPanel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnWithdraw, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnDeposit, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnCurrentAccount, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnSavingsAccount, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												224, Short.MAX_VALUE))))
				.addContainerGap()));
		gl_eastPanel.setVerticalGroup(gl_eastPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_eastPanel.createSequentialGroup().addGap(5).addComponent(btnWithdraw).addGap(33)
						.addComponent(btnDeposit, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(34)
						.addComponent(btnCurrentAccount, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGap(35)
						.addComponent(btnSavingsAccount, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGap(43).addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(150, Short.MAX_VALUE)));
		eastPanel.setLayout(gl_eastPanel);
		setLayout(groupLayout);

	}

	private class BtnCurrentAccountActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			btnSavingsAccount.setEnabled(false);
			lblMessage.setText("Current Account");
		}
	}

	private class BtnCancelActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			btnSavingsAccount.setEnabled(true);
			btnCurrentAccount.setEnabled(true);
			lblMessage.setText("VZAP Bank");
			lblTransactionType.setText("");
			btnWithdraw.setEnabled(true);
		}
	}

	private class BtnDepositActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			btnWithdraw.setEnabled(false);
			lblTransactionType.setText("Deposit");
		}
	}
}
