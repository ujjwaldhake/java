package Loops;

public class PrimeNumber {

    public static void main(String[] args) {
        boolean PrimeNumber = true;
        int n=17;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                PrimeNumber=false;
                break;
            }
        }
        if(PrimeNumber)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
    }
    
}
