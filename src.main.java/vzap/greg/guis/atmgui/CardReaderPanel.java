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

public class CardReaderPanel extends JPanel
{
	private JLabel lblVzapBank;
	private JLabel lblCardreaderIcon;

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

		lblCardreaderIcon = new JLabel("cardReaderIcon");
		lblCardreaderIcon.setIcon(new ImageIcon(
				"C:\\Users\\greg\\java\\projects\\neonProjects\\ATM_ProjectGregVersionServer\\resources\\scaledCardReader.png"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(325)
										.addComponent(lblVzapBank, GroupLayout.PREFERRED_SIZE, 336,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(55, Short.MAX_VALUE))
								.addGroup(Alignment.TRAILING,
										groupLayout.createSequentialGroup()
												.addContainerGap(584, Short.MAX_VALUE).addComponent(lblCardreaderIcon,
														GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
												.addGap(46)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(43).addComponent(lblVzapBank)
						.addPreferredGap(ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
						.addComponent(lblCardreaderIcon, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addGap(119)));
		setLayout(groupLayout);

	}
}
