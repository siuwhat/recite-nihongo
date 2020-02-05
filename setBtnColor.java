package recite;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class setBtnColor extends JButton{
	private static final Color Color_1=new Color(205,255,205);
	private static final Color Color_2=new Color(51,154,47);
	
	public setBtnColor(String string, int num){
		Color ts=null;
		    this.setText(string);
		    this.setBackground(ts=num==0?Color_1:Color_2);
		    this.setPreferredSize(new Dimension(100,50));
	}

	public setBtnColor() {
		
	}

	
}


