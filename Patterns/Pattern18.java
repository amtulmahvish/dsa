class Solution {
    public void pattern18(int n) {
         for (int i = 0; i < n; i++) {
             for(char ch = (char)(('A'+ n-1)-i); ch <= ('A'+ n-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
         }
    }
}