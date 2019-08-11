import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		int n1=Integer.parseInt(number.split("\\s")[0]);
		int n2=Integer.parseInt(number.split("\\s")[1]);
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1%n2);
		System.out.println(String.format("%.2f", (float)n1/(float)n2));

	}
}

