import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		int j=4;
		for(int i=0;i<line.length();i++) {
			System.out.print("["+line.charAt(i));
			for(int a=i;a<j;a++) {
				System.out.print("0");
			}
			System.out.print("]\n");
		}
	}
}

