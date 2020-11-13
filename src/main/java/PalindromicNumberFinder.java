public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
     // int myNum = num;
      while(num < Integer.MAX_VALUE){
        num++;
        if(testPalindromicNum(num) == true){
          reverseNum(num);
          break;
        }
      }
      return num;
      
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      boolean test = false;
      String original = Integer.toString(num);
      String reverse = reverseNum(num);
      //String reverse = original.substring(original.length()/2) + original.substring(0,original.length()/2);
      if(original == reverse){
          test = true;
      }
      return test;
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      String original = Integer.toString(num);
      String reverse = original.substring(original.length()/2) + original.substring(0,original.length()/2);
      //if(original == reverse){
        return reverse;
      //}
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
