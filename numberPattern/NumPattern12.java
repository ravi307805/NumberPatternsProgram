/*
1 
2 7 
3 8 13 
4 9 14 19 
5 10 15 20 25
*/
class NumPattern12{
	int rows= 5;
		public static void main(String[] args) {

			
			for (int i = 1; i<=rows ; i++ ) {
				for (int j=i; j>=1 ; j-- ) {
					if (j<=i) {
						System.out.print(j+rows+" ");
					}
				
				
				}
				System.out.println();
			}

		}
}