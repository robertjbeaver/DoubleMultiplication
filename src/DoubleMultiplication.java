
public class DoubleMultiplication {
	public double multiply(double d1, double d2) {
	double total = 0;
	int d1Decimal = 0;
	int d2Decimal = 0;
	String d1String = Double.toString(d1);
	String d2String = Double.toString(d2);
	for(int i = d1String.length(); i < 0; i--) {
		if(d1String.charAt(i)=='.') {
			for(int x = 0; x < i; x++) {
				d1String+="0";
			}
		d1Decimal = Integer.parseInt(d1String);	
		break;	
		}
	}
	for(int i = d2String.length(); i < 0; i--) {
		if(d2String.charAt(i)=='.') d2Decimal = i;
	}
	
	return total;
	} 
}
