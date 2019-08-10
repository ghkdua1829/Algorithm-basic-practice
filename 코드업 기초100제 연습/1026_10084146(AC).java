import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		System.out.print(line.split("\\:")[1]);
	}
}

