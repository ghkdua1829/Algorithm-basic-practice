import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		int i=0;
		while(!number.split("\\s")[i].equals("0")) {
			System.out.println(number.split("\\s")[i]);
			i++;
		}
		System.out.println("0");

}
}
