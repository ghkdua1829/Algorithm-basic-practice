import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		String a;
		String[][] road=new String[10][10];
		int j=1;
		for(int i=0;i<10;i++) {
			a=scanner.nextLine();
			for(int k=0;k<10;k++) {
				road[i][k]=a.split("\\s")[k];
			}
		}

		for(int i=1;i<9;i++) {
			if(road[i][j].equals("2")) {
				road[i][j]="9";
				break;
			}
			while(road[i][j+1].equals("0")) {
				road[i][j]="9";
				j++;
			}
			if(road[i][j].equals("2")) {
				road[i][j]="9";
				break;
			}
			road[i][j]="9";

		}
		for(int i=0;i<10;i++) {
			for(int k=0;k<10;k++) {
				System.out.print(road[i][k]+" ");
			}
			System.out.println();
			}
}
}
