import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		scanner.nextLine();
		String num=scanner.nextLine();
		int[] array2=new int[23];
		for(int i=0;i<array2.length;i++) {
			array2[i]=0;
		}
		for(int i=0;i<count;i++) {
			array2[Integer.parseInt(num.split("\\s")[i])-1]++;
		}
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
}
}
