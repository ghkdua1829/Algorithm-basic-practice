import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int[][] array=new int[19][19];
		for(int i=0;i<19;i++) {
			String a=scanner.nextLine();
			for(int j=0;j<19;j++) {
					array[i][j]=Integer.parseInt(a.split("\\s")[j]);
			}
		}
		int count=scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<count;i++) {
			String b=scanner.nextLine();
			for(int j=0;j<19;j++) {
				if(array[Integer.parseInt(b.split("\\s")[0])-1][j]==1)
					array[Integer.parseInt(b.split("\\s")[0])-1][j]=0;
				else
					array[Integer.parseInt(b.split("\\s")[0])-1][j]=1;
				if(array[j][Integer.parseInt(b.split("\\s")[0])-1]==1)
					array[j][Integer.parseInt(b.split("\\s")[0])-1]=0;
				else
					array[j][Integer.parseInt(b.split("\\s")[0])-1]=1;
			}
		}
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
					System.out.print(array[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		
}
}
