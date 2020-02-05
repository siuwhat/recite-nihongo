package recite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class listarray {
public String []filestr;
public String path;
public static List<String> arraylist=new ArrayList<String>();	
	
public  listarray(String path) throws IOException {
		
reciteMain test=new reciteMain(path);

filestr=test.reader();

for(String element :filestr) {
	arraylist.add(element);}

	}
public  List<String> getArray() {
return arraylist;

	}
}
