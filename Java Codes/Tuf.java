public class Tuf {

	public static void main(String[] args) {
		int n = 4;
	    int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

		
	}
	
	
	static void solve(int i, int j, int a[][], int n,int  vis) {
		    if (i == n - 1 && j == n - 1) {
		      
		      return;
		    }

		    // downward
		    if (i + 1 < n  && a[i + 1][j] == 1) {
		     
		      solve(i + 1, j, a, n, vis);
		  
		    }

		    // left
		    if (j - 1 >= 0 && a[i][j - 1] == 1) {
		   
		      solve(i, j - 1, a, n, vis);
		  
		    }

		    // right 
		    if (j + 1 < n && a[i][j + 1] == 1) {
		     
		      solve(i, j + 1, a, n, vis);
		 
		    }
		 // upward
		    if (i - 1 >= 0  && a[i - 1][j] == 1) {
		     
		      solve(i - 1, j, a, n, vis);
		    
		    }
		   
		    if (i - 1 >= 0 && j-1>=0 && a[i - 1][j-1] == 1) {
		         solve(i - 1, j-1, a, n, vis);
		      
		    }
		    
		    // downward
		    if (i - 1 >= 0  && j+1<n && a[i - 1][j+1] == 1) {
		     
		      solve(i - 1, j, a, n, vis);
		  
		    }

		    // left
		    if (j - 1 >= 0 && i+1<n && a[i+1][j - 1] == 1) {
		   
		      solve(i+1, j - 1, a, n, vis);
		  
		    }

		    // right 
		    if (j + 1 < n && i+1<n && a[i+1][j + 1] == 1) {
		     
		      solve(i+1, j + 1, a, n, vis);
		 
		    }

		   
		    
		  }

}
