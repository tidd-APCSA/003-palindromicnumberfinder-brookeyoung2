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
     int myNum = num;
      while(myNum < Integer.MAX_VALUE){
        myNum++;
        // System.out.println(myNum);
        if(testPalindromicNum(myNum) == true){
          reverseNum(myNum);
          break;
        }
      }
      return myNum - num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      boolean test = false;
      String original = Integer.toString(num);
      String reverse = reverseNum(num);
      // System.out.println(original);
      // System.out.println(reverse);
      if(original.equals(reverse)){
          test = true;
      }
      return test;
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
     String original = Integer.toString(num);
     String reverse = "";
     for(int i = original.length()-1; i >= 0; i--){
       reverse = reverse + original.charAt(i);
     }
        return reverse;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
