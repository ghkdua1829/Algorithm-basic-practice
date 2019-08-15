import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int sum=0;
		for(int i=0;i<=number;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.print(sum);

}
}
