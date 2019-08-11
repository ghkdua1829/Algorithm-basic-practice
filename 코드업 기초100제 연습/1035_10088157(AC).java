import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String number=scanner.nextLine();
		String a8=Integer.toOctalString(Integer.parseInt(number,16));
		System.out.print(a8);
	}
}

