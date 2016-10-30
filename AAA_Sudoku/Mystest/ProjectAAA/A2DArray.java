
public class A2DArray {
	
	    int[][] array= new int[9][9];;
	    public A2DArray(int[][] initialArray){
	       this.array = initialArray;
	    }
		public int[] FindUnusedCell(){
			int[] cell = new int[2];// Each cell has an x and a y coordinate				
			for(int i = 0;i<9;i++){ //check all rows
				for(int j=0;j<9;j++){ //check all columns
					if(array[i][j]==0){ //if a cell is not assigned a number,then return cell
						cell[0]=i;
						cell[1]=j;
						return cell; ////
					}
				}
			}
			cell[0]=-1;////
			cell[1]=-1;////
			return cell;
		}
		public boolean solveSudoku(A2DArray Grid){
			int r,c;
			int[] blankCell = FindUnusedCell();

			r = blankCell[0];
			c= blankCell[1];
			if(r==-1){
				//System.out.println("Puzzle already Solved");
				return true; 
				//The Grid is already solved			
			}
			for(int i=1;i<10;i++){
				if(isPossible(r,c,i)){
					Grid.array[r][c]=i;
					if(solveSudoku(Grid)){
						return true;
					}
					Grid.array[r][c]= 0;
				}
				
			}
			return false;
		}
		public boolean isPossible(int r,int c,int number){ //If the number is not used in the row and column and block,then it can be used there.
			if(!Check_Row(r,number)&& !Check_Column(c,number) && !Check_Region(r-r%3,c-c%3,number)){
				return true;
			}
			return false;
		}

		public boolean Check_Row(int row,int number){
			for(int i = 0;i<9;i++){
				if(array[row][i]==number){
					return true;
				}
			}
			return false;
		}

		public boolean Check_Column(int column,int number){
			for(int i = 0;i<9;i++){
				if(array[i][column]==number){
					return true;
				}
			}
			return false;
		}

		public boolean Check_Region(int sR,int sC,int number){//Check if it is used in the current 3x3 block.
			for(int i=0;i<3;i++){
				for(int j = 0;j<3;j++){
					if(array[i+sR][j+sC]==number){//if it is used,then return true. Which means that the number won't be put in that block.
						return true;
					}
				}
			}
			return false;
		}

	    
	    
	    
	    public void printGrid(){
			for(int r=0;r<9;r++){
				if(r%3==0){
					System.out.println("===============================");
				}
				for(int c=0;c<9;c++){
					if(c%3==0){
						System.out.print("|");
					}
					//System.out.println(r+" "+c+" ");
					System.out.print(array[r][c]+"  ");
				}
				System.out.print("|");
				System.out.println();
			}
					System.out.println("===============================");
		}
	   
	}

