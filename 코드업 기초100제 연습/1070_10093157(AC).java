import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int word= scanner.nextInt();
		switch(word) {
		case 1:
		case 12:
		case 2:
			System.out.print("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.print("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("fall");
			break;
		}
		
}
}
