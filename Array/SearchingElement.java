public class SearchingElement {

    public static void main(String[] args) {
        int []a ={23,45,67,89,234,};
        int b = 234;
        for(int i=0;i<a.length ; i++){
            if(a[i]==b){
                System.out.println(b + " found at " +i +" index");
                System.exit(0);
            }
            System.out.println("not found");
        }
            

    }
    
}
