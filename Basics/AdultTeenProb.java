class Solution {
    public void isAdult(int age) {
        // Your code goes here
        if(age >= 18){
            System.out.println("Adult");
        }
        else if (age<=18){
            System.out.println("Teen");
        }
        else {
            System.out.println("Invalid age");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
    }
}