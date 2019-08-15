import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			if(i%3==0) {
				System.out.print("X ");
			}
			else {
				System.out.print(i+" ");
			}
		}

}
}
