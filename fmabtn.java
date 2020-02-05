package recite;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class fmabtn {
	public static List<String>list_Array;
	public static JFrame jframe=new JFrame("日语学习");
	public static JPanel Win=new JPanel();
	public static JLabel headlabel=new JLabel();
	public static JLabel label=new JLabel();
	public static JLabel firstlabel=new JLabel("日本语学习软件");
	public static String sum1="",sum2="",sum3="";
	public static int index=8;
	public static int n=0;
	 public  static setBtnColor begin=new setBtnColor("开始",0);//按钮如果不为static的话则会产生两个同名变量引用一块堆内存；
	 public  static setBtnColor last=new setBtnColor("上一个单词",1);
	 public  static setBtnColor next=new setBtnColor("下一个单词",1);
	 public  static setBtnColor restart=new setBtnColor();
	private static String []field= {"日汉","日语","形态","中文"};
	
	
	
	public static void main(String []args)throws IOException {
		 
		
		 Icon ret=new ImageIcon(System.getProperty("user.dir")+"\\loop.jpg");
		 ImageIcon java=new ImageIcon("java.jpg");
		 jframe.setIconImage(new ImageIcon(System.getProperty("user.dir")+"\\java.jpg").getImage());
		 restart.setIcon(ret);
		 firstlabel.setFont(new getAllFont().getSomeFont());
		 Win.setBackground(Color.LIGHT_GRAY);
		 Win.add(begin);
		 Win.add(firstlabel);
		 jframe.add(Win);
		    jframe.setFont(new getAllFont().getHeaderFont());
		    jframe.setResizable(false);//固定窗口大小
		    jframe.setVisible(true);
		    jframe.setSize(400,300);//在显示之前加入panel组件
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		 
		 list_Array=new listarray("n3单词").getArray();
		 for(String page:field) {
			 sum2+=page+"<br>";
		 }
		 headlabel.setText("<html>"+sum2+"</html>");sum2="";
		 
	begin.addActionListener(new ActionListener(){
	
		public void actionPerformed(ActionEvent e) {	
	index=8;
			System.out.println("begin:"+index);
		
		 Win.remove(begin);
		 Win.remove(firstlabel);
		 Win.invalidate();
		 Win.repaint();
		 Win.updateUI();
			last.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
					if(this.equals(last)==false) {
					System.out.println("last:"+index);
					
					if(index>=8) {for(n=index-8;n<index-4;n++) {
						sum1+=list_Array.get(n)+"<br>";}}
					    index=index-4;
					if(index<3) {label.setText("开头没有更多了，点击下一个单词");}
					else{label.setText("<html>"+sum1+"</html>");sum1="";}}}});
					
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(this.equals(next)==false) {
				System.out.println("next:"+index);
				
			if(index+4<=list_Array.size()) {for(n=index;n<index+4;n++) {
						sum1+=list_Array.get(n)+"<br>";}}
			   index=index+4;
				if(index>list_Array.size()){label.setText("结尾没有更多了，点击上一个单词");}
				else if(index<=list_Array.size()) {label.setText("<html>"+sum1+"</html>");sum1="";}}}});
		
		
			restart.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					System.out.println("restart:"+index);
	   {Win.removeAll();
	   Win.add(begin);  
	   Win.repaint();
	   Win.setVisible(true);
		   jframe.dispose();
		   jframe.validate();
	   jframe.setVisible(true);

	  
	   begin.setLocation(150,100);
		 System.out.println("restart后的:"+index);
		 }}});
		
			{for(int i=4;i<8;i++) {
				sum2+=list_Array.get(i)+"<br>";}}
			 label.setText("<html>"+sum2+"</html>");sum2="";
			 Win.setLayout(null);
		 last.setBounds(-10, 200, 100,75);
		 next.setBounds(300,200,100,75);
		 label.setBounds(50,0,400,160);
		 headlabel.setBounds(10,0,400,160);
		 restart.setBounds(300,50,60,60);
		 
		 Win.add(label);
		 Win.add(last);
		 Win.add(next);
		 Win.add(restart);
		 Win.add(headlabel);
		 jframe.setSize(400,300);
		 jframe.setVisible(true);
}});

	
	
}}


