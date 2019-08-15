import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		scanner.nextLine();
		String num=scanner.nextLine();
		int min=Integer.parseInt(num.split("\\s")[0]);
		for(int i=1;i<count;i++) {
			if(min>Integer.parseInt(num.split("\\s")[i])){
				min=Integer.parseInt(num.split("\\s")[i]);
			}
		}
		System.out.print(min);
	}
}
