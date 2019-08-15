import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		scanner.nextLine();
		String number=scanner.nextLine();
		for(int i=0;i<count;i++) {
			System.out.println(number.split("\\s")[i]);
		}
		
}
}
