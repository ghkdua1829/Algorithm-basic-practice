import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String num =scanner.nextLine();
		double h=Integer.parseInt(num.split("\\s")[0]);
		double b=Integer.parseInt(num.split("\\s")[1]);
		double c=Integer.parseInt(num.split("\\s")[2]);
		double s=Integer.parseInt(num.split("\\s")[3]);
		System.out.print(String.format("%.1f", h*b*c*s/8/1024/1024)+" MB");

}
}
