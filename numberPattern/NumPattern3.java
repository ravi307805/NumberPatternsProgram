/*
1
12
123
1234
12345
1234
123
12
1
*/


public class PatternNumber {

	public static void main(String[] args) {
		
	int rows=5;
	for (int i = 1; i <= rows; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    for (int i = rows; i >= 1; i--)
    {
        for (int j = 1; j < i; j++)
        {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

	
}
