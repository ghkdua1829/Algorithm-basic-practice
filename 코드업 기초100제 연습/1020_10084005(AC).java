import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String number=scanner.nextLine();
		System.out.print(number.split("\\-")[0]+""+number.split("\\-")[1]);
		
	}
}

