package TestQuestions;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class hackerRankChaalenge1 {

	public static void main(String[] args) {
		List<String> ls=Arrays.asList("YYY","YYY","YYY","YNY","YYY");
		int count=0;
		
	Iterator<String> itr=ls.iterator();
	while(itr.hasNext())
	{
		String test=itr.next();
		if(test.equals("YYY"))
			count++;
		else
			count=0;
	}
	
System.out.println(count);
	}

}
