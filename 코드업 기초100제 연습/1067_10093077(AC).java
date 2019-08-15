import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number= scanner.nextInt();
		if(number>0) {
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}
		
		if(number%2==0) {
			System.out.println("even");
		}
		else
			System.out.println("odd");
	}
}

