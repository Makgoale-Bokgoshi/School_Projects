
public class Sudoku_Grid {
	
	
	private int[][] grid;
	
	public void Grid( int[][] n){
		grid = n;
	}
	
	public int[][] getGrid(){
		return grid;
	}
	public static void main(String[] args){
	Sudoku_Grid g = new Sudoku_Grid();	
	int[][] input ={{5,3,0,0,7,0,0,0,0},
		{6,0,0,1,9,5,0,0,0},
		{0,9,8,0,0,0,0,6,0},
		{8,0,0,0,6,0,0,0,3},
		{4,0,0,8,0,3,0,0,1},
		{7,0,0,0,2,0,0,0,6},
		{0,6,0,0,0,0,2,8,0},
		{0,0,0,4,1,9,0,0,5},
		{0,0,0,0,8,0,0,7,9}};
	g.Grid(input);
	
int [][] input2={{0,9,5,4,6,0,0,0,0},
		{3,0,4,9,0,1,0,5,0},
		{0,0,0,3,0,0,0,0,4},
		{6,0,0,7,0,4,0,2,0},
		{0,0,1,0,2,0,3,0,0},
		{0,4,0,5,0,9,0,0,6},
		{9,0,0,0,0,7,0,0,0},
		{0,6,0,2,0,8,5,0,3},
		{0,0,0,0,4,3,2,9,0}};

	int [][] input3={{9,5,2,4,0,0,0,0,7},
			{0,0,0,0,0,0,0,0,5},
			{8,0,0,0,2,9,0,0,6},
			{0,0,0,0,0,1,8,0,0},
			{2,0,0,7,0,3,0,0,9},
			{0,0,8,9,0,0,0,0,0},
			{7,0,0,6,3,0,0,0,8},
			{5,0,0,0,0,0,0,0,0},
			{6,0,0,0,0,2,7,9,3}};
	
int [][] input4={{0,1,0,0,4,6,0,0,0},
		{6,0,0,3,0,0,0,0,0},
		{3,4,8,7,2,0,0,6,9},
		{0,0,1,0,0,0,0,8,0},
		{4,0,7,0,0,0,3,0,5},
		{0,6,0,0,0,0,7,0,0},
		{7,3,0,0,8,2,9,1,4},
		{0,0,0,0,0,7,0,0,8},
		{0,0,0,4,1,0,0,7,0}};
int [][] input5= {{0,2,0,3,0,0,7,0,0},
		{0,7,3,0,0,4,0,6,5},
		{0,0,5,0,0,0,0,0,0},
		{0,0,1,0,0,6,0,4,0},
		{6,0,0,0,0,0,0,0,9},
		{0,3,0,1,0,0,8,0,0},
		{0,0,0,0,0,0,6,0,0},
		{5,6,0,7,0,0,2,3,0},
		{0,0,7,0,0,1,0,9,0}};
int[][] input6={{9,0,0,0,8,7,0,0,0},
		{0,0,8,0,0,0,0,0,0},
		{2,3,0,1,4,0,0,0,7},
		{0,0,2,9,5,0,0,0,0},
		{6,0,0,0,0,0,0,0,2},
		{0,0,0,0,7,4,9,0,0},
		{3,0,0,0,6,5,0,2,4},
		{0,0,0,0,0,0,5,0,0},
		{0,0,0,3,9,0,0,0,8}};
	}
}