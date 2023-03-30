import java.util.*;
public class Solution {
		   
	    public static void spiralOrder(int[][] matrix) {
	        
	        List<Integer> res = new ArrayList<Integer>();
	        
	        if (matrix.length == 0) {
	            System.out.println(res);
	        }
	        
	        int rowBegin = 0;
	        int rowEnd = matrix.length-1;
	        int colBegin = 0;
	        int colEnd = matrix[0].length - 1;
	        
	        while (rowBegin <= rowEnd && colBegin <= colEnd) {
	            // Traverse Right
	            for (int j = colBegin; j <= colEnd; j ++) {
	                res.add(matrix[rowBegin][j]);
	            }
	            rowBegin++;
	            
	            // Traverse Down
	            for (int j = rowBegin; j <= rowEnd; j ++) {
	                res.add(matrix[j][colEnd]);
	            }
	            colEnd--;
	            
	            if (rowBegin <= rowEnd) {
	                // Traverse Left
	                for (int j = colEnd; j >= colBegin; j --) {
	                    res.add(matrix[rowEnd][j]);
	                }
	            }
	            rowEnd--;
	            
	            if (colBegin <= colEnd) {
	                // Traverse Up
	                for (int j = rowEnd; j >= rowBegin; j --) {
	                    res.add(matrix[j][colBegin]);
	                }
	            }
	            colBegin ++;
	        }
	        System.out.println(res);
	    
	    }
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("**SPIRAL MATRIX**");
	System.out.println("\nEnter no. of rows:");
	int row=sc.nextInt();
	System.out.println("Enter no. of columns:");
	int col=sc.nextInt();
	System.out.println("\nEnter elements of matrix:");
	int matrix[][]=new int[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			matrix[i][j]=sc.nextInt();
		}
	}
	System.out.println("\nINPUT:");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("\nOUTPUT:");
	spiralOrder(matrix);
	

}
}
