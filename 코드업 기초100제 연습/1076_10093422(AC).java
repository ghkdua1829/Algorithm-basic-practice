import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char number=scanner.nextLine().charAt(0);
		char word='a';
		while(!(word==number)) {
			System.out.print(word+" ");
			word++;
		}
		System.out.print(word);

}
}
