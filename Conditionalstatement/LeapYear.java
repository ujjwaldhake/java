package Conditionalstatement;

public class LeapYear {

    public static void main(String[] args) {
        
        int year =2000;

        if(year%4==0){
                if(year%100==0){
                 if(year%400==0){
                 System.out.println(" a leap year");
                    
                }else{
                    System.out.println("Not a leap year");
                }
                    
                }else {
                    System.out.println(" a leap year");
                }
        }else{
            System.out.println("Not a leap year");

        }
    }
    
}
