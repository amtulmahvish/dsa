class AddDigits {
    public int addDigits(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9; // divisibility rule of 9
        else return num % 9;
    }
}