import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String set=scanner.nextLine();
		int a=Integer.parseInt(set.split("\\s")[0]);
		int m=Integer.parseInt(set.split("\\s")[1]);
		int d=Integer.parseInt(set.split("\\s")[2]);
		int n=Integer.parseInt(set.split("\\s")[3]);
		int result=a;
		for(int i=1;i<n;i++) {
			result=result*m+d;
		}
		System.out.print(result);
}
}
