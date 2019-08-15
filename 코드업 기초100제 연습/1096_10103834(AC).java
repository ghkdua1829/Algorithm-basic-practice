import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		scanner.nextLine();

		String[] black=new String[count];
		int[][] array=new int[19][19];
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
			array[i][j]=0;
			}
		}
		for(int i=0;i<count;i++) {
			black[i]=scanner.nextLine();
			array[Integer.parseInt(black[i].split("\\s")[0])-1][Integer.parseInt(black[i].split("\\s")[1])-1]=1;
		}
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
			System.out.print(array[i][j]+" ");
			}
			System.out.print("\n");
		}
		
}
}
