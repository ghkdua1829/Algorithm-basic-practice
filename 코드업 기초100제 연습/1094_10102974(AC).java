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
		for(int i=count-1;i>=0;i--) {
			System.out.print(num.split("\\s")[i]+" ");
		}
	}
}
