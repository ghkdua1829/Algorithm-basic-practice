import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String num =scanner.nextLine();
		int r=Integer.parseInt(num.split("\\s")[0]);
		int g=Integer.parseInt(num.split("\\s")[1]);
		int b=Integer.parseInt(num.split("\\s")[2]);
		int a=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int k=0;k<b;k++) {
					System.out.println(i+" "+j+" "+k);
					a++;
				}
			}
		}
		System.out.print(a);

}
}
