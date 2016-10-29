
public class Sudoku {


	public static int[][] grid;
	

	public boolean solveSudoku(int[][] grid){
		int r,c;
		int[] blankCell = findBlankCell();

		r = blankCell[0];
		c= blankCell[1];
		if(r==-1){
			return true; //The Grid is already solved			
		}
		for(int i=1;i<10;i++){
			if(isPossible(r,c,i)){
				grid[r][c]=i;
				if(solveSudoku(grid)){
					return true;
				}
				grid[r][c]= 0;
			}
		}
		return false;
	}
	public boolean isPossible(int r,int c,int number){ //If the number is not used in the row and column and block,then it can be used there.
		if(!Used_In_Row(r,number)&& !Used_In_Column(c,number) && !Used_In_Block(r-r%3,c-c%3,number)){
			return true;
		}
		return false;
	}

	public boolean Used_In_Row(int row,int number){
		for(int i = 0;i<9;i++){
			if(grid[row][i]==number){
				return true;
			}
		}
		return false;
	}

	public boolean Used_In_Column(int column,int number){
		for(int i = 0;i<9;i++){
			if(grid[i][column]==number){
				return true;
			}
		}
		return false;
	}

	public boolean Used_In_Block(int sR,int sC,int number){//Check if it is used in the current 3x3 block.
		for(int i=0;i<3;i++){
			for(int j = 0;j<3;j++){
				if(grid[i+sR][j+sC]==number){//if it is used,then return true. Which means that the number won't be put in that block.
					return true;
				}
			}
		}
		return false;
	}

	public int[] findBlankCell(){
		int[] cell = new int[2];// Each cell has an x and a y coordinate				
		for(int i = 0;i<9;i++){ //check all rows
			for(int j=0;j<9;j++){ //check all columns
				if(grid[i][j]==0){ //if a cell is not assigned a number,then return cell
					cell[0]=i;
					cell[1]=j;
					return cell; /////
				}
			}
		}
		cell[0]=-1;////
		cell[1]=-1;////
		return cell;
	}

	public void printGrid(){
		for(int r=0;r<9;r++){
			if(r%3==0){
				System.out.println("===================");
			}
			for(int c=0;c<9;c++){
				if(c%3==0){
					System.out.print("|");
				}
				System.out.print(grid[r][c]+" ");
			}
			//System.out.print("|");
			System.out.println();
		}
		System.out.println("====================");
	}

	public static void main(String[] args){
		grid = new int[][] {{0,1,0,0,4,6,0,0,0},
				{6,0,0,3,0,0,0,0,0},
				{3,4,8,7,2,0,0,6,9},
				{0,0,1,0,0,0,0,8,0},
				{4,0,7,0,0,0,3,0,5},
				{0,6,0,0,0,0,7,0,0},
				{7,3,0,0,8,2,9,1,4},
				{0,0,0,0,0,7,0,0,8},
				{0,0,0,4,1,0,0,7,0}};

	/*	grid2= new int[][] {{3, 0, 6, 5, 0, 8, 4, 0, 0},
				{5, 2, 0, 0, 0, 0, 0, 0, 0},
				{0, 8, 7, 0, 0, 0, 0, 3, 1},
				{0, 0, 3, 0, 1, 0, 0, 8, 0},
				{9, 0, 0, 8, 6, 3, 0, 0, 5},
				{0, 5, 0, 0, 9, 0, 6, 0, 0},
				{1, 3, 0, 0, 0, 0, 2, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 7, 4},
				{0, 0, 5, 2, 0, 6, 3, 3, 0}};*/
		
		Sudoku s = new Sudoku();
		System.out.println("Incomplete Puzzle");
		s.printGrid();
		System.out.println("---------------------------------");
		if(s.solveSudoku(grid)){
			System.out.println("Solution");
			s.printGrid();

			System.out.println("-------------------------------------------------------------");
		}
		else{
			System.out.println("No Solution");
		}
	}

}
