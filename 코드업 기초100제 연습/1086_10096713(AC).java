import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String num =scanner.nextLine();
		double w=Integer.parseInt(num.split("\\s")[0]);
		double h=Integer.parseInt(num.split("\\s")[1]);
		double b=Integer.parseInt(num.split("\\s")[2]);
		System.out.print(String.format("%.2f", w*h*b/8/1024/1024)+" MB");

}
}
