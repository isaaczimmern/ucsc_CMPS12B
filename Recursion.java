// Recursion.java
// Isaac Zimmern
// izimmern
// pa1
// Solves 5 recursive methods of an array. 




class Recursion {
	
	public static void main(String[] args){

	 	int[] A = {-1, 2, 6, 12, 9, 2, -5, -2, 8, 5, 7};
	 	int[] B = new int[A.length];
	 	int[] C = new int[A.length];
		int minIndex = minArrayIndex(A);
		int maxIndex = maxArrayIndex(A);

		for(int x: A) System.out.print(x+" ");
		System.out.println();

		System.out.println( "minIndex = " + minIndex );
		System.out.println( "maxIndex = " + maxIndex );
		reverseArray1(A, A.length, B);
		for(int x: B) System.out.print(x+" ");
		System.out.println();

		reverseArray2(A, A.length, C);
		for(int x: C) System.out.print(x+" ");
		System.out.println();

		reverseArray3(A, 0, A.length-1);
		for(int x: A) System.out.print(x+" ");
		System.out.println();

	}

	static void reverseArray1(int[] X, int n, int[] Y){
		  if(n < 1)
       		return;
    		Y[Y.length-n] = X[n-1];
   			reverseArray1(X, n-1, Y);
	}
 	
 	static void reverseArray2(int[] X, int n, int[] Y){
 		if(n < 1)
      		return;
    		Y[n-1] = X[X.length-n];
    		reverseArray2(X, n-1, Y);
 	}
 	
 	static void reverseArray3(int[] X, int i, int j){
 		if(i>=j)
        	return;
   	 		int a=X[j];
    		X[j]=X[i];
    		X[i]=a;
    		reverseArray3(X,i+1,j-1);
 	}
 	
 	static int maxArrayIndex(int[] X){
		 int largest = X[0];
		 int currentMaxIndex = 0;
    for (int i = 0; i < X.length; i++) {
        if(X[i] > X[currentMaxIndex]){
            largest = X[i];
            currentMaxIndex = i;
        }
    }
    return currentMaxIndex;
 	}

 	static int minArrayIndex(int[] X){
		 int smallest = X[0];
		 int currentMinIndex = 0;
    for (int i = 0; i < X.length; i++) {
        if(X[i] < X[currentMinIndex]){
            smallest = X[i];
            currentMinIndex = i;
        }
    }
    return currentMinIndex;
 	}
 	


 }