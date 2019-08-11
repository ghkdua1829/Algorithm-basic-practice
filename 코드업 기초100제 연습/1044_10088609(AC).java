import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		BigInteger s=new BigInteger(number);
		BigInteger b=new BigInteger("1");
		System.out.print(s.add(b));
	}
}

