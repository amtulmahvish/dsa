class Solution {
    public void pattern13(int n) {
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num = num+1;
            }
            System.out.println();
        }
    }
}