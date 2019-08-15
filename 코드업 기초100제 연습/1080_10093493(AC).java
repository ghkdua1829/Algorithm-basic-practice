import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int sum=0;
		int i=1;
		while(true) {
			sum+=i;
			if(sum>=number) {
				System.out.print(i);
				break;
			}
			i++;
		}

}
}
