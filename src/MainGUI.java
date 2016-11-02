import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Thuan Nguyen
 *
 */
public class MainGUI extends JFrame{
	public MainGUI(){
		setPreferredSize(new Dimension(400,400));
		setLayout(null);
		setTitle("Thuan Pro");
		pack();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainGUI wMain = new MainGUI();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}

}
