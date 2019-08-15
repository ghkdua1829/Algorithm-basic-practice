import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		int n=Integer.parseInt(number.split("\\s")[0]);
		int m=Integer.parseInt(number.split("\\s")[1]);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.println(i+" "+j);
			}
		}

}
}
