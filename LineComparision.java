public class LineComparision {
	public static void main(String args[]) {
		double x1 = 3;
		double y1 = 4;
		double x2 = 7;
		double y2 = 1;
		double p1 = 8;
		double q1 = 9;
		double p2 = 12;
		double q2 = 6;

		double lengthOfLine1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("Length of first line: " + lengthOfLine1);
		double lengthOfLine2 = Math.sqrt((q2 - q1) * (q2 - q1) + (p2 - p1) * (p2 - p1));
		System.out.println("Length of second line: " + lengthOfLine2);		
		if (lengthOfLine1 == lengthOfLine2)
			System.out.println("Both the lines are equal");
	}
}
