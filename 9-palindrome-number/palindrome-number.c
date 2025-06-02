bool isPalindrome(int x) {
    long int rev = 0;
    int og = x;
    while (x > 0){
        rev=(rev*10)+(x%10);
        x=x/10;
    }
    if (og == rev){
        return true;
    }
    return false;
}