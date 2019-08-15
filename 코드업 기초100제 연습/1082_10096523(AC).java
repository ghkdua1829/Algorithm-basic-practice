import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		int result;
		for(int i=1;i<16;i++) {
			result=Integer.parseInt(number,16)*i;
			System.out.println(number+"*"+Integer.toHexString(i).toUpperCase()+"="+Integer.toHexString(result).toUpperCase());
		}

}
}
