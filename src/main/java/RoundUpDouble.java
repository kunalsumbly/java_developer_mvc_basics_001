import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RoundUpDouble {
public static void main(String[] args) {
	
	
	 DecimalFormat df = new DecimalFormat("0");
	 
	 Double myDouble = 11.55;
	 Long round = Math.round(myDouble);
	 myDouble = round.doubleValue();
	 System.out.println(myDouble);
	 df.setRoundingMode(RoundingMode.HALF_UP);
	 //System.out.println(Double.valueOf(df.format(myDouble)));
	 
}
}
