import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		for(int i=0;i<number.split("\\s").length;i++) {
			if(!number.split("\\s")[i].equalsIgnoreCase("0")) {
				System.out.println(number.split("\\s")[i]);
			}
			else {
				System.out.println(number.split("\\s")[i]);
				break;
			}
		}
		
}
}
