import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class FormattingPractice {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		
		//DecimalFormatting practice
		System.out.println("Enter the radius of the circle: ");
		int rad = scan.nextInt();
		
		double area  = Math.pow(rad, 2) * Math.PI;
		DecimalFormat fmt = new DecimalFormat("0.0000");
		System.out.println("The circles area is " + fmt.format(area));
		
		
		//NumberFormatting practice
		System.out.println("Enter a price: ");
		double price = scan.nextDouble();
		NumberFormat fmt2 = NumberFormat.getCurrencyInstance();
		
		System.out.println("The price is " + fmt2.format(price));
		
		System.out.println("Enter a percentage tax: ");
		int tax = scan.nextInt();
		NumberFormat fmt3 = NumberFormat.getPercentInstance();
		
		System.out.println("The percent tax is " + fmt3.format(tax));
		
	}
}