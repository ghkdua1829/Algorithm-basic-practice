import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String nanugi=scanner.nextLine();
		int a=3/2;
		System.out.print(Integer.parseInt(nanugi.split("\\s")[0])%Integer.parseInt(nanugi.split("\\s")[1]));
	}
}

