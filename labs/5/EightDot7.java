// Dan Mopsick
// CMPT 220L_112
public class EightDot7 {

	// Listing for 8.3 on page 296
	// Question 8.7 on page 308-309
	public static void main(String[] args) {
		// Create array to test program
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
				{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
				{5.5, 4, -0.5}};
		
		// Find the two closest points
		int[] closestPoints = findClosestPoints(points);
		
		// Convert points to easy to use variables
		int p1 = closestPoints[0];
		int p2 = closestPoints[1];
		
		// Display results to the user
		System.out.println("The closest two points are (" + points[p1][0] + ", " + points[p1][1] + " , " + points[p1][2]
				+ ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ").");
	}

	public static int[] findClosestPoints(double[][] points){
		// Initialize array to be returned
		int[] closestPoints = new int[2];
		
		// Calculate distance between first two points as starting point
		int p1 = 0;
		int p2 = 1;
		double shortestDistance = distanceBetween(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1], points[p2][2]);
		
		// Compute distance between every two points
		for(int i = 0; i < points.length; i++){
			for(int j = i + 1; j < points[i].length; j ++){
				double distance = distanceBetween(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
				if(shortestDistance > distance){
					shortestDistance = distance;
					p1 = i;
					p2 = j;
				}
			}
		}
		
		// Save results to the array that will be returned
		closestPoints[0] = p1;
		closestPoints[1] = p2;
		return closestPoints;
	}
	
	public static double distanceBetween(double x1, double y1, double z1, double x2, double y2, double z2){
		return Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
	}
}
