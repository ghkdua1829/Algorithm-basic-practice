import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		float a=scanner.nextFloat();
		DecimalFormat form = new DecimalFormat("0.000000");
		String b=form.format(a);
		System.out.print(b);
	}

}

