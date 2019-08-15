import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		String gase=scanner.nextLine();
		int count=scanner.nextInt();
		scanner.nextLine();
		String rt[][]=new String[Integer.parseInt(gase.split("\\s")[0])][Integer.parseInt(gase.split("\\s")[1])];
		for(int i=0;i<Integer.parseInt(gase.split("\\s")[0]);i++) {
			for(int j=0;j<Integer.parseInt(gase.split("\\s")[1]);j++) {
				rt[i][j]="0";
			}
		}
		for(int i=0;i<count;i++) {
			String a=scanner.nextLine();
			int x=Integer.parseInt(a.split("\\s")[2]);
			int y=Integer.parseInt(a.split("\\s")[3]);
			for(int j=0;j<Integer.parseInt(a.split("\\s")[0]);j++) {
				if((a.split("\\s")[1]).equals("1")) {
					rt[x-1][y-1]="1";
					x++;
				}
				else {
					rt[x-1][y-1]="1";
					y++;
				}
			}
		}
		
		for(int i=0;i<Integer.parseInt(gase.split("\\s")[0]);i++) {
			for(int j=0;j<Integer.parseInt(gase.split("\\s")[1]);j++) {
				System.out.print(rt[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		
}
}
