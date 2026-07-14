package Conditionalstatement ;
 

public class GreatestNumber {

    public static void main(String[] args) {
        int a=134252;
        int b=4232;
        int c=405;
        if(a>b && a>c){
            System.err.println(a + " is greter ");
        }else if (b>a && b>c){
            System.err.println(b + " is greter ");
        }else{
         System.err.println(c + " is greter ");

        }
    }
    
}
