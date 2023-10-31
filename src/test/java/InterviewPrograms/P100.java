package InterviewPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class P100 {

	@Test
	public void array() {
		int count=0;
		int[]a={1,3,5,2,8,9,10};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
			if ((a[i]+a[j])==11) {
				count++;
				System.out.println(a[i]+"    "+a[j]);
				
			}
		}
	}
		System.out.println(count+"  Combinations");
}

	
	@Test
	public void occurance() {
		String input="darlidng";

		int []a=new int[256];
		for (int i = 0; i < input.length(); i++) {
			char iput = input.charAt(i);
			if (iput>=0 && iput<=255) {
				a[iput]++;
			}
		}
		for (char i = 0; i < a.length; i++) {
			if (a[i]>0) {
				System.out.println(i+"---"+a[i]);
			}
		}
    }

@Test
public void MIssingElemnts() {
	int[]a= {1,2,5};
	int startRange=0;
	int endRange=10;
	
	boolean found[]=new boolean[endRange-startRange+1];
	
	for (int b : a) {
		if (b>startRange&&b<endRange) {
			found[b-startRange]=true;
		}
	}
	for (int i = 0; i < found.length; i++) {
		if (!found[i]) {
			System.out.println(i+startRange);
		}
	}
	
}

@Test
public void ExcelSheetDupliIds() throws Throwable {
	FileInputStream fis =new FileInputStream("C:\\Users\\Koushik MN\\eclipse-workspace\\JavaSanjay\\src\\test\\resources\\Dupli.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int lst = wb.getSheet("Sheet1").getLastRowNum();
	HashSet<String>hs=new HashSet<>();
	
	for (int i = 1; i <lst; i++) {
		hs.add(wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue());
		
	}
	System.out.println(hs);
}


@Test
public void replacestarintheplaceofChars() {
	String S="a1m goi123ng to fi3215nd pro234325du";
	
	 String[] words = S.split(" ");
     int product = 1;

     // Iterate through the words to find and multiply the numeric substrings
     for (String word : words) {
         String numericPart = word.replaceAll("[^0-9]", "");
         System.out.println(numericPart);
         // Extract numeric part
         if (!numericPart.isEmpty()) {
             Integer number = Integer.parseInt(numericPart);
            product *= number;
            
         }
     }
    
    // Print the product
     System.out.println("Product of numbers inside the string: " + product);
 }

@Test
public void removeDuplicatesin2Strings() {
	String s="This is  funny elephant";
	String s1=" ah funny show ";
	String s3=s+s1;
	String s5="";
	}

@Test
public void aaa() {
	String s="aabbccddeev";
	 char[] st = s.toCharArray();
	 int j=0;
	 for (int i = 0; i < st.length; i=j) 
	 {
		 int count=1;
		for (j = i+1; j<st.length; j++) 
		{
			if(st[i]==st[j])
			{
				 
				count++;
			}
		else 
		{
			break;
			}
			
		}
		System.out.println(st[i]+" "+count);
	}
	 System.out.println(j);
}
}

