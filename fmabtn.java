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
	public static JFrame jframe=new JFrame("����ѧϰ");
	public static JPanel Win=new JPanel();
	public static JLabel headlabel=new JLabel();
	public static JLabel label=new JLabel();
	public static JLabel firstlabel=new JLabel("�ձ���ѧϰ���");
	public static String sum1="",sum2="",sum3="";
	public static int index=8;
	public static int n=0;
	 public  static setBtnColor begin=new setBtnColor("��ʼ",0);//��ť�����Ϊstatic�Ļ�����������ͬ����������һ����ڴ棻
	 public  static setBtnColor last=new setBtnColor("��һ������",1);
	 public  static setBtnColor next=new setBtnColor("��һ������",1);
	 public  static setBtnColor restart=new setBtnColor();
	private static String []field= {"�պ�","����","��̬","����"};
	
	
	
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
		    jframe.setResizable(false);//�̶����ڴ�С
		    jframe.setVisible(true);
		    jframe.setSize(400,300);//����ʾ֮ǰ����panel���
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		 
		 list_Array=new listarray("n3����").getArray();
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
					if(index<3) {label.setText("��ͷû�и����ˣ������һ������");}
					else{label.setText("<html>"+sum1+"</html>");sum1="";}}}});
					
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(this.equals(next)==false) {
				System.out.println("next:"+index);
				
			if(index+4<=list_Array.size()) {for(n=index;n<index+4;n++) {
						sum1+=list_Array.get(n)+"<br>";}}
			   index=index+4;
				if(index>list_Array.size()){label.setText("��βû�и����ˣ������һ������");}
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
		 System.out.println("restart���:"+index);
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


