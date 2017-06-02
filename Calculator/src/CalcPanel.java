import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CalcPanel extends JPanel {
	
	private CalcState calc = new CalcState(); // this object will actually do the calculating work
	
	JSlider slider;
	JLabel currenVal;
	JTextField text = new JTextField(10);
	
	String firstN, secondN, operations;
	
	JButton zero, one, two, three, four, five, six, seven, eight, nine, A, B, C, D, E, F, plus, 
	minus, multiply, divide, back, equal, clear;
	
	CalcPanel() {
		this.setLayout(null); 
		
		text.setBounds(15, 15, 360, 50);
		text.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		slider = new JSlider(JSlider.HORIZONTAL, 2, 16, 10);
		slider.setBounds(15, 330, 250, 50);
		slider.setMajorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				int slider_val = slider.getValue();
				
				currenVal.setText("Current Base: " + slider_val);
				
				String conv = calc.Convert(text.getText(), slider_val);
				text.setText(conv);
				
				if(slider_val > 1)
				{
					one.setEnabled(true);					
				} 
				else 
				{
					one.setEnabled(false);
				}
					
				if(slider_val > 2)
				{
					two.setEnabled(true);	
				} 
				else 
				{
					two.setEnabled(false);
				}
				
				if(slider_val > 3)
				{
					three.setEnabled(true);		
				} 
				else 
				{
					three.setEnabled(false);
				}
				if(slider_val > 4)
				{
					four.setEnabled(true);					
				} 
				else 
				{
					four.setEnabled(false);
				}
				
				if(slider_val > 5)
				{
					five.setEnabled(true);	
				} 
				else 
				{
					five.setEnabled(false);
				}
				
				if(slider_val > 6)
				{
					six.setEnabled(true);					
				} 
				else 
				{
					six.setEnabled(false);
				}
				
				if(slider_val > 7)
				{
					seven.setEnabled(true);			
				} 
				else 
				{
					seven.setEnabled(false);
				}
				
				if(slider_val > 8)
				{
					eight.setEnabled(true);				
				} 
				else
				{
					eight.setEnabled(false);
				}
				
				if(slider_val > 9)
				{
					nine.setEnabled(true);			
				} 
				else 
				{
					nine.setEnabled(false);
				}
				
				if(slider_val > 10)
				{
					A.setEnabled(true);				
				} 
				else 
				{
					A.setEnabled(false);
				}
				
				if(slider_val > 11)
				{
					B.setEnabled(true);					
				} 
				else 
				{
					B.setEnabled(false);
				}
				
				if(slider_val > 12)
				{
					C.setEnabled(true);					
				} 
				else 
				{
					C.setEnabled(false);
				}
				
				if(slider_val > 13)
				{
					D.setEnabled(true);	
				} 
				else 
				{
					D.setEnabled(false);
				}
				
				if(slider_val > 14)
				{
					E.setEnabled(true);	
				} 
				else 
				{
					E.setEnabled(false);
				}
				
				if(slider_val > 15)
				{
					F.setEnabled(true);					
				} 
				else 
				{
					F.setEnabled(false);
				}
				
				
			}
		});
		
		currenVal = new JLabel("Current Base: 10");
		currenVal.setBounds(100, 360, 150, 50);
		
		//------------------------------------------------------first row
		/**
		 * i used comment lines to distinguish the rows of the buttons
		 */
		C = new JButton("C");
		C.setFont(new Font("Tahoma", Font.BOLD, 20));
		C.setBounds(15, 80, 50, 50);
		C.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(12);
				if(slider.getValue()< 12){
					String num = text.getText() + "12";
					text.setText(num);
				} else {
					String num = text.getText() + "C";
					text.setText(num);
				}
			}
		});
		
		D = new JButton("D");
		D.setFont(new Font("Tahoma", Font.BOLD, 20));
		D.setBounds(75, 80, 50, 50);
		D.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(13);
				if(slider.getValue()< 13){
					String num = text.getText() + "13";
					text.setText(num);
				} else {
					String num = text.getText() + "D";
					text.setText(num);
				}
			}
		
		});
		
		E = new JButton("E");
		E.setFont(new Font("Tahoma", Font.BOLD, 20));
		E.setBounds(135, 80, 50, 50);
		E.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(14);
				if(slider.getValue()< 14){
					String num = text.getText() + "14";
					text.setText(num);
				} else {
					String num = text.getText() + "E";
					text.setText(num);
				}
			}
		
		});
		
		F = new JButton("F"); 
		F.setFont(new Font("Tahoma", Font.BOLD, 20));
		F.setBounds(195, 80, 50, 50);
		F.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(15);
				if(slider.getValue()< 15){
					String num = text.getText() + "15";
					text.setText(num);
				} else {
					String num = text.getText() + "F";
					text.setText(num);
				}
			}
		
		});
		
		clear = new JButton("CL"); 
		clear.setFont(new Font("Tahoma", Font.BOLD, 10));
		clear.setBounds(255, 80, 50, 50);
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				
				calc.clear();
				text.setText("");
			}
		});
		/**
		 * some logic behind deleting or backspacing unwanted numbers
		 */
		back = new JButton("BK"); 
		back.setFont(new Font("Tahoma", Font.BOLD, 10));
		back.setBounds(315, 80, 50, 50);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String backspace = null;
				
				if(text.getText().length() >0){
					StringBuilder str = new StringBuilder(text.getText());
					str.deleteCharAt(text.getText().length()-1);
					backspace = str.toString();
					text.setText(backspace);
				}
			}
		});
		
		
		//-----------------------------------------------second row
		
		eight = new JButton("8");
		eight.setFont(new Font("Tahoma", Font.BOLD, 20));
		eight.setBounds(15, 140, 50, 50);
		eight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(8);
				String num = text.getText() + eight.getText();
				text.setText(num);
			}
		});
		
		
		nine = new JButton("9");
		nine.setFont(new Font("Tahoma", Font.BOLD, 20));
		nine.setBounds(75, 140, 50, 50);
		nine.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(9);
				String num = text.getText() + nine.getText();
				text.setText(num);
			}
		});
		
		
		A = new JButton("A");
		A.setFont(new Font("Tahoma", Font.BOLD, 20));
		A.setBounds(135, 140, 50, 50);
		A.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(10);
				if(slider.getValue()< 10){
					String num = text.getText() + "10";
					text.setText(num);
				} else {
					String num = text.getText() + "A";
					text.setText(num);
				}
			}
		});
		
		
		B = new JButton("B");
		B.setFont(new Font("Tahoma", Font.BOLD, 20));
		B.setBounds(195, 140, 50, 50);
		B.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(11);
				if(slider.getValue()< 11){
					String num = text.getText() + "11";
					text.setText(num);
				} else {
					String num = text.getText() + "B";
					text.setText(num);
				}
			}
		
		});
		
		
		divide = new JButton("/");
		divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		divide.setBounds(255, 140, 50, 50);
		divide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				firstN = text.getText();
				text.setText("");
				operations = "/";
			}
		
		});
		
		
		multiply = new JButton("*");
		multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		multiply.setBounds(315, 140, 50, 50);
		multiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				firstN = text.getText();
				text.setText("");
				operations = "*";
			}
		
		});
		
		
		//---------------------------------------------------- third row
		
		four = new JButton("4");
		four.setFont(new Font("Tahoma", Font.BOLD, 20));
		four.setBounds(15, 200, 50, 50);
		four.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(4);
				String num = text.getText() + four.getText();
				text.setText(num);	
			}
		});
		
		
		five = new JButton("5");
		five.setFont(new Font("Tahoma", Font.BOLD, 20));
		five.setBounds(75, 200, 50, 50);
		five.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(5);
				String num = text.getText() + five.getText();
				text.setText(num);
			}
		
		});
		
		
		six = new JButton("6");
		six.setFont(new Font("Tahoma", Font.BOLD, 20));
		six.setBounds(135, 200, 50, 50);
		six.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(6);
				String num = text.getText() + six.getText();
				text.setText(num);
			}
		
		});
		
		
		seven = new JButton("7");
		seven.setFont(new Font("Tahoma", Font.BOLD, 20));
		seven.setBounds(195, 200, 50, 50);
		seven.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(7);
				String num = text.getText() + seven.getText();
				text.setText(num);
			}
		
		});
		
		
		plus = new JButton("+");
		plus.setFont(new Font("Tahoma", Font.BOLD, 20));
		plus.setBounds(255, 200, 50, 50);
		plus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				firstN = text.getText();
				text.setText("");
				operations = "+";
			}
		});
		
		
		minus = new JButton("-");
		minus.setFont(new Font("Tahoma", Font.BOLD, 20));
		minus.setBounds(315, 200, 50, 50);
		minus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				firstN = text.getText();
				text.setText("");
				operations = "-";
			}
		
		});
		
		
		// ---------------------------------------------- fourth row
		
		zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.BOLD, 20));
		zero.setBounds(15, 260, 50, 50);
		zero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = text.getText() + zero.getText();
				text.setText(num);
			}
		
		});
		
		
		one = new JButton("1");
		one.setFont(new Font("Tahoma", Font.BOLD, 20));
		one.setBounds(75, 260, 50, 50);
		one.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(1);
				String num = text.getText() + one.getText();
				text.setText(num);
			}
		
		});
		
		
		two = new JButton("2");
		two.setFont(new Font("Tahoma", Font.BOLD, 20));
		two.setBounds(135, 260, 50, 50);
		two.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(2);
				String num = text.getText() + two.getText();
				text.setText(num);
			}
		
		});
		
		
		three = new JButton("3");
		three.setFont(new Font("Tahoma", Font.BOLD, 20));
		three.setBounds(195, 260, 50, 50);
		three.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc.setVal(3);
				String num = text.getText() + three.getText();
				text.setText(num);
			}
		
		});
		
		
		equal = new JButton("=");
		equal.setFont(new Font("Tahoma", Font.BOLD, 20));
		equal.setBounds(255, 260, 110, 50);
		equal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String answer;
				secondN = text.getText();
				if(operations == "+")
				{
					answer = calc.addN(firstN, secondN, slider.getValue());
					text.setText(answer);
				}
				else if(operations == "-")
				{
					answer = calc.subN(firstN, secondN, slider.getValue());
					text.setText(answer);
				}
				else if(operations == "*")
				{
					answer = calc.mulN(firstN, secondN, slider.getValue());
					text.setText(answer);
				}
				else if(operations == "/")
				{
					answer = calc.divN(firstN, secondN, slider.getValue());
					text.setText(answer);
				}
			
			}
		
		});
		
		
		
		add(text);
		add(plus);
		add(minus);
		add(multiply);
		add(divide);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(A);
		add(B);
		add(C);
		add(D);
		add(E);
		add(F);
		add(two);
		add(one);
		add(zero);
		add(clear);
		add(back);
		add(equal);
		add(slider);
		add(currenVal);
		}
		
	}

		