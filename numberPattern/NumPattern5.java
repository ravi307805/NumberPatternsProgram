/*
54321
4321
321
21
1
1
21
321
4321
54321
*/

class NumPattern5{
    public static void main(String[] args){
        
        int rows = 5;
        
        for (int i = rows; i >=1; i--){
            for (int j = i; j >= 1; j--){
            
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <=rows; i++){
        
            for (int j = i; j >=1; j--){            
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
