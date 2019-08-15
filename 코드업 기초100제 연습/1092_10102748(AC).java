import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String set=scanner.nextLine();
		int a=Integer.parseInt(set.split("\\s")[0]);
		int b=Integer.parseInt(set.split("\\s")[1]);
		int c=Integer.parseInt(set.split("\\s")[2]);
		int day=1;
		while(!(day%a==0&&day%b==0&&day%c==0)) {
			day++;
		}
		System.out.print(day);
}
}
