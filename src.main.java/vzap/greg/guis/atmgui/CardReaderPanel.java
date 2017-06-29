package vzap.greg.guis.atmgui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;

public class CardReaderPanel extends JPanel
{
	private JLabel lblVzapBank;
	private JPanel cardReaderPanel;
	private JLabel lblCardreadericon;
	private JLabel lblInsertCard;
	private JPanel keyPanel;
	private JButton btn4;
	private JButton button_1;
	private JButton button_2;
	private JButton btn3;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JPanel panel_1;
	private JButton btn0;
	private JPanel panel_2;
	private JPanel pinPanel;
	private JPasswordField pinJTF;

	/**
	 * Create the panel.
	 */
	public CardReaderPanel()
	{
		setBackground(new Color(0, 255, 255));

		lblVzapBank = new JLabel("VZAP Bank");
		lblVzapBank.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		lblVzapBank.setHorizontalAlignment(SwingConstants.CENTER);
		lblVzapBank.setForeground(new Color(255, 0, 0));
		lblVzapBank.setFont(new Font("Tahoma", Font.BOLD, 50));

		cardReaderPanel = new JPanel();
		cardReaderPanel.setBorder(null);
		cardReaderPanel.setBackground(Color.CYAN);

		keyPanel = new JPanel();
		keyPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));

		pinPanel = new JPanel();
		pinPanel.setBackground(new Color(127, 255, 0));
		pinPanel.setBorder(
				new TitledBorder(null, "PIN Code", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(325).addComponent(lblVzapBank,
								GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGap(75)
								.addComponent(keyPanel, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
								.addGap(54).addComponent(cardReaderPanel, GroupLayout.PREFERRED_SIZE, 488,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(40, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(590, Short.MAX_VALUE)
						.addComponent(pinPanel, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
						.addGap(97)));
		groupLayout
				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup()
						.addGap(43).addComponent(lblVzapBank).addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(125)
										.addComponent(pinPanel, GroupLayout.PREFERRED_SIZE,
												83, GroupLayout.PREFERRED_SIZE)
										.addGap(65).addComponent(cardReaderPanel, GroupLayout.PREFERRED_SIZE, 298,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addGap(259).addComponent(keyPanel,
										GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(41, Short.MAX_VALUE)));

		pinJTF = new JPasswordField();
		pinJTF.setFont(new Font("Tahoma", Font.BOLD, 30));
		GroupLayout gl_pinPanel = new GroupLayout(pinPanel);
		gl_pinPanel.setHorizontalGroup(gl_pinPanel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_pinPanel.createSequentialGroup().addContainerGap()
						.addComponent(pinJTF, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE).addContainerGap()));
		gl_pinPanel.setVerticalGroup(gl_pinPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pinPanel.createSequentialGroup().addContainerGap()
						.addComponent(pinJTF, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE).addContainerGap()));
		pinPanel.setLayout(gl_pinPanel);
		keyPanel.setLayout(new GridLayout(4, 3, 0, 0));

		button_1 = new JButton("1");
		button_1.setBorder(new LineBorder(Color.RED));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(button_1);

		button_2 = new JButton("2");
		button_2.setBorder(new LineBorder(Color.RED));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(button_2);

		btn3 = new JButton("3");
		btn3.setBorder(new LineBorder(Color.RED));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(btn3);

		btn4 = new JButton("4");
		btn4.setBorder(new LineBorder(Color.RED));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setIconTextGap(1);
		keyPanel.add(btn4);

		btn5 = new JButton("5");
		btn5.setBorder(new LineBorder(Color.RED));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(btn5);

		btn6 = new JButton("6");
		btn6.setBorder(new LineBorder(Color.RED));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(btn6);

		btn7 = new JButton("7");
		btn7.setBorder(new LineBorder(Color.RED));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(btn7);

		btn8 = new JButton("8");
		btn8.setBorder(new LineBorder(Color.RED));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(btn8);

		btn9 = new JButton("9");
		btn9.setBorder(new LineBorder(Color.RED));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(btn9);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		keyPanel.add(panel_1);

		btn0 = new JButton("0");
		btn0.setBorder(new LineBorder(Color.RED));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		keyPanel.add(btn0);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		keyPanel.add(panel_2);

		lblCardreadericon = new JLabel("");
		lblCardreadericon.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new LineBorder(new Color(0, 255, 0))));
		lblCardreadericon.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardreadericon.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCardreadericon.setIcon(new ImageIcon(
				"C:\\Users\\greg\\java\\projects\\neonProjects\\ATM_ProjectGregVersionServer\\resources\\scaledCardReader.png"));

		lblInsertCard = new JLabel("Insert Card");
		lblInsertCard.setForeground(new Color(0, 0, 255));
		lblInsertCard.setFont(new Font("Tahoma", Font.BOLD, 40));
		GroupLayout gl_cardReaderPanel = new GroupLayout(cardReaderPanel);
		gl_cardReaderPanel
				.setHorizontalGroup(gl_cardReaderPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_cardReaderPanel.createSequentialGroup().addGap(56)
								.addComponent(lblCardreadericon, GroupLayout.PREFERRED_SIZE, 423,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(50, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_cardReaderPanel.createSequentialGroup()
								.addContainerGap(175, Short.MAX_VALUE).addComponent(lblInsertCard).addGap(125)));
		gl_cardReaderPanel.setVerticalGroup(gl_cardReaderPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cardReaderPanel.createSequentialGroup().addGap(29)
						.addComponent(lblCardreadericon, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE).addComponent(lblInsertCard)
						.addGap(22)));
		cardReaderPanel.setLayout(gl_cardReaderPanel);
		setLayout(groupLayout);

	}
}
