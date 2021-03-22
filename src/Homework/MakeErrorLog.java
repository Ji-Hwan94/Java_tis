package Homework;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MakeErrorLog {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String strDate = sdf.format( date );
		 
		try {
			System.out.println(c/d);
		 } catch (Exception e) {
			 fout = new FileWriter("C:\\log\\" + strDate+ ".log");
			 while(true) {
				 String error = e.getMessage();
				 if(error.length() == 0)
					 break;
				 fout.write(error, 0, error.length());
				 fout.write("\r\n", 0, 2);
				 	
				 fout.close();
			 }
		 }
		 scanner.close();
	}

}
