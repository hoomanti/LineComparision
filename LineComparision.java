public class LineComparision {
	public static void main(String args[]) {
		double x1 = 9;
		double y1 = 6;
		double x2 = 15;
		double y2 = 5;
		double p1 = 14;
		double q1 = 6;
		double p2 = 1;
		double q2 = 9;

		double lengthOfLine1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("Length of first line: " + lengthOfLine1);
		double lengthOfLine2 = Math.sqrt((q2 - q1) * (q2 - q1) + (p2 - p1) * (p2 - p1));
		System.out.println("Length of second line: " + lengthOfLine2);
		if (lengthOfLine1 == lengthOfLine2)
			System.out.println("Both the lines are equal");
		else if (lengthOfLine1 < lengthOfLine2)
			System.out.println("First line is smaller than second line");
		else
			System.out.println("First line is greater than second line");
	}
}
