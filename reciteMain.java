package recite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class reciteMain  {
public String path;
static private int i=0;
public String str="";
public String []filestr= {};


public reciteMain(String path) throws IOException{

File n3=new File(System.getProperty("user.dir")+"\\"+path+".txt");

FileInputStream filetxt=new FileInputStream(n3);
int size=filetxt.available();
byte[] buffer=new byte[size];
filetxt.read(buffer);
filetxt.close();
str=new String(buffer,"UTF-8");
}
public String[] reader() {

	filestr=str.split("\\s+");
	return filestr;
}}



