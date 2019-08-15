import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int standard=scanner.nextInt();
		int sum=0;
		int i=1;
		while(sum<standard) {
			sum+=i;
			i++;
		}
		System.out.print(sum);

}
}
