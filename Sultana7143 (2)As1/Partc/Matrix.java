package Partc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
* <h1>Matrix</h1>
* The Matrix class initialize a Matrix and print it.
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/
public class Matrix {
	private int matLen;
	private int[][] matrix;
	
		 
   /**
   * This method is used to set Matrix length
   * and initialize Matrix.
   * @param matLen This is the only parameter to set Matrix length
   * @return Void This method returns nothing.
   */
	public void setMatrixLength(int matLen) {
	   this.matLen = matLen;
	   matrix = new int[matLen][matLen];
	}

	/**
    * This method is used to get Matrix length
    * 
    */
	public int getMatrixLength() {
	   return this.matLen;
	} 
	//Returns the two dimentional arrays
	public int[][] getMatrix() {
		   return this.matrix;
		} 
	//returns current object matrix
	
	public int getMatRowColValue(int r, int c) {
		   return this.matrix[r][c];
		}
	/**
	 * This is a boolean method
	 * which varifies the user input
	 * and returns true of false
	 * according to the matrix criteria
	 */
	public boolean checkInput(String iS)
	{
		if(iS.isEmpty())
		{
			System.out.println("Your input is empty! Please enter again.");
			return false;
		}
		
		if(iS.length() != matLen)
		{
			System.out.println("Your input size is not "+matLen + " chars");
			return false;
		}
		for (int i=0;i<iS.length();i++)
		{
			if ((iS.charAt(i)=='0' || iS.charAt(i)=='1')==false)
			{
				System.out.println("Your input has other char than 0 or 1");
				return false;
			}
		}
		return true;
	}
	//Overloads the matrix length
	public Matrix(int matrixLength){
		if(matrixLength>1)
		{
			setMatrixLength(matrixLength);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			for(int i=0;i<matrixLength;i++)
			{
				String s="";
				while(true)
				{
					int lineNo=i+1;
					System.out.println("Enter the numbers for row no: " + lineNo + " (0 or 1 only)\n");
					try {
						s = br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					s=s.trim();
					if(checkInput(s))break;
					
					
				}
				for (int j=0;j<s.length();j++)
					matrix[i][j]= Integer.parseInt(s.substring(j,j+1));
			}
			System.out.println("Matrix input completed.");
		}
	}
	/**
	 * This method pronts
	 * the passed by two dimentional
	 * array
	 */
	public void printMatrix(int[][] pMat)
	{
		System.out.println("\nMattrix: (Size "+pMat.length+")");
		for (int i=0;i<pMat.length;i++)
		{
			
			for (int j=0;j<pMat.length;j++)
				System.out.print(pMat[i][j] + " ");
			System.out.println("");
		}
	}
	
	
}
	
