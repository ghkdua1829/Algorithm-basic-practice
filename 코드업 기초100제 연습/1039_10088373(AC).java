import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		BigInteger a=new BigInteger(number.split("\\s")[0]);
		BigInteger b=new BigInteger(number.split("\\s")[1]);
		System.out.print(a.add(b));
	}
}

