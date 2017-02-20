// Dan Mopsick
// CMPT 220L-112
public class EightDot10 {

	public static void main(String[] args) {
		// Initialize Array
		int[][] array = new int[4][4];

		// Populate array randomly with zero and 1s
		for(int i = 0; i < array.length; i ++){
			for(int j = 0; j < array[i].length; j ++){
				array[i][j] = (int)(Math.random() + 0.5);
			}
		}
		
		// Find row with most 1s
		int rowMost = 0;
		int rowIndex = 0;
		int rowCount = 0;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j ++){
				if(array[i][j] == 1){
					rowCount ++;
				}
				if(rowCount > rowMost){
					rowIndex = i;
					rowMost = rowCount;
				}
			}
			rowCount = 0;
		}
		
		// Find column with most 1s
		int columnMost = 0;
		int columnIndex = 0;
		int columnCount = 0;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j ++){
				if(array[j][i] == 1){
					columnCount ++;
				}
				if(columnCount > columnMost){
					columnIndex = i;
					columnMost = columnCount;
				}
			}
			columnCount = 0;
		}
		
		// Display results to user
		for(int i = 0; i < array.length; i ++){
			for(int j = 0; j < array[i].length; j ++){
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("The largest row index: " + rowIndex);
		System.out.println("The largest column index: " + columnIndex);
	}

}
