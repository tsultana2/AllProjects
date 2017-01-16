package Partc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* <h1>MatrixTest</h1>
* The Student class uses 
* to create MatrixTest object
* with all Matrix information
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/

public class MatrixTest {
	private int matrixLength=0;
	private int maxBlockSize=0;
	private int maxBlockSizeRow=0;
	private int maxBlockSizeColumn=0;
	Matrix matrix = null; 
	//Overloads the Matrix length
	public  MatrixTest(int matrixLength)
	{
		this.matrixLength=matrixLength;
		matrix= new Matrix(matrixLength);
		
	}
	/**This method checks the 1 in the
	 * arrays 
	 */
	
	public boolean allOne(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat.length;j++)
				if(mat[i][j]!=1)return false;
		
		return true;
		
	}
	/**
	 * Find a block of
	 * square matrix 
	 * from the matrix
	 */
	public int[][] getBlock(int row, int col, int size)
	{
		int[][] retMat= new int[size][size];
		if(row+size > matrixLength || col+size > matrixLength) return null;
		int nr=0;
		
		for(int i=row;i<(row+size);i++)
		{
			int nc=0;	
			for(int j=col;j<(col+size);j++)
			{
				retMat[nr][nc]= matrix.getMatRowColValue(i,j);
				nc++;
			}
			nr++;
		}
		return 	retMat;
		
	}
	/**
	 * Find the maximum
	 * block of 1
	 */
	public void findMaxBlock()
	{
		for (int r=0;r<matrixLength;r++)
		{
			if(r+maxBlockSize>matrixLength) break;
			if((r+maxBlockSize+1)>matrixLength) break;
			for (int c=0;c<=matrixLength;c++)
			{
				if(c+maxBlockSize>matrixLength) break;
				if(matrix.getMatRowColValue(r,c)==1)
				{
					
					
						int bSize=maxBlockSize+1;
						if(c+bSize>matrixLength) break;
					while(true)
					{	
						int[][] block=this.getBlock(r, c, bSize);
						if(this.allOne(block))
						{
							maxBlockSize=bSize;
							maxBlockSizeRow=r;
							maxBlockSizeColumn=c;
							bSize++;
							if(c+bSize>matrixLength) break;
						}
						else
							break;
					}	
				}
			}
		}
		 System.out.println("the largest block is at ("+maxBlockSizeRow+","+maxBlockSizeColumn+") with "+maxBlockSize+" rows");
	}
	
	/**
	 * This main method
	 * tests the MatrixTest class
	 * 
	 */
	public static void main(String[] args) {
		int n=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Enter the number of rows in the square matrix:");
        try{
            n = Integer.parseInt(br.readLine());
        }catch(NumberFormatException | IOException nfe){
            System.err.println("Invalid Format!");
        }
        
		if(n>1)
		{
			MatrixTest myMatrix= new MatrixTest(n);
			myMatrix.matrix.printMatrix(myMatrix.matrix.getMatrix());
			
			myMatrix.findMaxBlock();
			
		}
	}
}
