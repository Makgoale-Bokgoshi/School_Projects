public class Sudoku_01 {
public static int[][] grid;

public boolean solveSudoku(int[][] grid){
	 int r,c;
	 int[] blankCell = findBlankLocation();
	 
	 r = blankCell[0];
	 c= blankCell[1];
	 
	 if(r==-1){
		 return true;// 
		 
		 //The Grid is already solved
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
public boolean isPossible(int r,int c,int number){
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
public boolean Used_In_Block(int sR,int sC,int number){
	for(int i=0;i<3;i++){
		for(int j = 0;j<3;j++){
			if(grid[i+sR][j+sC]==number){
				return true;
			}
		}
		
	}
	return false;
}
	
	public int[] findBlankLocation(){
		int[] cell = new int[2];
		
		for(int i = 0;i<9;i++){
			for(int j=0;j<9;j++){
				if(grid[i][j]==0){
			cell[0]=i;
			cell[1]=j;
			return cell;
				}
		}
	}
		cell[0]=-1;
		cell[1]=-1;
		return cell;
}
	
	public void printGrid(){
		for(int r=0;r<9;r++){
			if(r%3==0){
				System.out.println("====================");
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
		
		/*This code breaks down when the initial grid has a repeated number in row AND in column,
		it does solve that puzzle,but doesn't realize the error in the initial grid*/
	Sudoku_01 s = new Sudoku_01();
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
