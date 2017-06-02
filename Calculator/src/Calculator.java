import java.awt.BorderLayout;

import javax.swing.JFrame;

// this class probably won't need to change much: most of the 'action' is in Base4Panel and Base4Calc


public class Calculator 
{
	
	public static void main(String[] args) 
	{
		createAndShowGUI();
	}
	
	private static void createAndShowGUI() 
	{
		JFrame frame = new JFrame("Base 4 Calculator");

		frame.add(BorderLayout.CENTER, new CalcPanel());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 450);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
