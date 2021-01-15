import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode; 
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("ENTER HOW MANY FIBONACCI NUMBERS YOU NEED THE SEQUENCE WILL START AT ZERO :");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
sc.close();
 
//Using Binet's formula
for(int i=0;i<num;i++) {
	double z= (1/Math.sqrt(5))*((Math.pow(((1+Math.sqrt(5))/2),i))-(Math.pow(((1-Math.sqrt(5))/2),i)));
	BigDecimal big = new BigDecimal(z);
	big = big.setScale(0, RoundingMode.HALF_UP);
	String rounded = big.toString();
	System.out.println(rounded);
}
	}

}
