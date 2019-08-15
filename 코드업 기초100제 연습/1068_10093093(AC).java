import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number= scanner.nextInt();
		if(number>=90&&number<=100) {
			System.out.print("A");
		}else if(number>=70&&number<90){
			System.out.print("B");
		}else if(number>=40&&number<70){
			System.out.print("C");
		}else if(number>=0&&number<40){
			System.out.print("D");
		}
}
}
