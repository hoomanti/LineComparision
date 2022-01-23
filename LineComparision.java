public class LineComparision {
	public static void main(String args[]) {
		double x1 = 3;
		double y1 = 4;
		double x2 = 7;
		double y2 = 1;

		double lengthOfLine = Math.sqrt((y2 -y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println(lengthOfLine);
	}
}
