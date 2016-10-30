import java.util.ArrayList;


public class Sudoku {


	public static A2DArray Grid;

	
/*	public int[] FindUnusedCell(){
		int[] cell = new int[2];// Each cell has an x and a y coordinate				
		for(int i = 0;i<9;i++){ //check all rows
			for(int j=0;j<9;j++){ //check all columns
				if(Grid.array[i][j]==0){ //if a cell is not assigned a number,then return cell
					cell[0]=i;
					cell[1]=j;
					return cell; ////
				}
			}
		}
		cell[0]=-1;////
		cell[1]=-1;////
		return cell;
	}*/

/*	public void printGrid(){
		for(int r=0;r<9;r++){
			if(r%3==0){
				System.out.println("===================");
			}
			for(int c=0;c<9;c++){
				if(c%3==0){
					System.out.print("|");
				}
				System.out.println(r+" "+c+" ");
				System.out.print(Grid.array[r][c]+"  ");
			}
			//System.out.print("|");
			System.out.println();
		}
		System.out.println("====================");
	}*/

	public static void main(String[] args){ 
		ArrayList<A2DArray> myList = new ArrayList<A2DArray>();
	int[][] array1=new int[][] {{0,1,0,0,4,6,0,0,0},
			{6,0,0,3,0,0,0,0,0},
			{3,4,8,7,2,0,0,6,9},
			{0,0,1,0,0,0,0,8,0},
			{4,0,7,0,0,0,3,0,5},
			{0,6,0,0,0,0,7,0,0},
			{7,3,0,0,8,2,9,1,4},
			{0,0,0,0,0,7,0,0,8},
			{0,0,0,4,1,0,0,7,0}};
	A2DArray grid1 = new A2DArray(array1); 
	 myList.add(grid1);
	 

int[][] array2=new int[][] {{3, 0, 6, 5, 0, 8, 4, 0, 0},
			{5, 2, 0, 0, 0, 0, 0, 0, 0},
			{0, 8, 7, 0, 0, 0, 0, 3, 1},
			{0, 0, 3, 0, 1, 0, 0, 8, 0},
			{9, 0, 0, 8, 6, 3, 0, 0, 5},
			{0, 5, 0, 0, 9, 0, 6, 0, 0},
			{1, 3, 0, 0, 0, 0, 2, 5, 0},
			{0, 0, 0, 0, 0, 0, 0, 7, 4},
			{0, 0, 5, 2, 0, 6, 3, 3, 0}};
	A2DArray grid2= new A2DArray(array2);
	myList.add(grid2);
	
    int[][] array3 = { 
            {5, 3, 4, 6, 7, 8, 9, 1, 2}, 
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},  
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},            
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
    A2DArray grid3= new A2DArray(array3);
	myList.add(grid3);
	//	System.out.println(myList.get(0).solveSudoku(grid1));
		Sudoku s = new Sudoku();
		System.out.println("Incomplete Puzzle");
		myList.get(0).printGrid();
		System.out.println("---------------------------------");
		if((myList.get(0).solveSudoku(myList.get(0)))){
			System.out.println("Solution");
			myList.get(0).printGrid();
			System.out.println("----------------------------------------------");
		}
		else{
			System.out.println("No Solution");
		}
	}

}

