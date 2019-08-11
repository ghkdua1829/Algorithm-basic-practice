import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		int a=Integer.parseInt(number.split("\\s")[0]);
		int b=Integer.parseInt(number.split("\\s")[1]);
		int c=Integer.parseInt(number.split("\\s")[2]);
		for(int i=0;i<number.split("\\s").length;i++) {
			if(Integer.parseInt(number.split("\\s")[i])%2==0) {
				System.out.println(number.split("\\s")[i]);
			}
		}

	}
}

