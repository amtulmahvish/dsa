class Solution {
    
    public static void pattern9(int n) {
        erectPyramid(n);
        invertedPyramid(n);
    }

    private static void erectPyramid(int n) {
      
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

           
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            
            System.out.println();
        }
    }

    private static void invertedPyramid(int n) {
       
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

           
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


