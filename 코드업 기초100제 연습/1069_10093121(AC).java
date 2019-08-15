import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char word= scanner.nextLine().charAt(0);
		if(word=='D') 
			System.out.print("slowly~");
		else if(word=='C')
			System.out.print("run!");
		else if(word=='B')
			System.out.print("good!!");
		else if(word=='A')
			System.out.print("best!!!");
		else
			System.out.print("what?");

}
}
