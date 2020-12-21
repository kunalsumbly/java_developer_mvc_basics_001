
public class TestBitWise {
 public static void main(String[] args) {
	boolean oneFlag = true;
	boolean secondFlag = true;
	
	if (callMe() & callThem()) {
		System.out.println("bitwise condition");
	}
	
	/*
	 * if (callMe() && callThem()) { System.out.println("and condition"); }
	 */
	
}

 private static boolean callThem() {
	 System.out.println("callThem");
	return true;
}

private static boolean callMe() {
	System.out.println("callMe");
	return false;
}
}
