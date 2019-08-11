import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		System.out.print(Integer.parseInt(number.split("\\s")[0])+Integer.parseInt(number.split("\\s")[1]));
	}
}

