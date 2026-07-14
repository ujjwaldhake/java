public class FindMax {
    public static void main(String[] args) {
        int a[]={234,435,78,687643534 , 879,879};    
        int max=a[0];                         
        for(int i =0 ;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.err.println(max);
    }
    
}
