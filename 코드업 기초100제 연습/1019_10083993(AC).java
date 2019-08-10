import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		String year=a.split("\\.")[0];
		String month=a.split("\\.")[1];
		String day=a.split("\\.")[2];
		
		switch(year.length()){
		case 4:
			System.out.print(year+".");
			break;
		case 3:
			System.out.print("0"+year+".");
			break;
		case 2:
			System.out.print("00"+year+".");
			break;
		case 1:
			System.out.print("000"+year+".");
			break;
		}
		
		if(month.length()==2) {
			System.out.print(month+".");
		}
		else {
			System.out.print("0"+month+".");
		}
		
		if(day.length()==2) {
			System.out.print(day);
		}
		else {
			System.out.print("0"+day);
		}
	}

}

