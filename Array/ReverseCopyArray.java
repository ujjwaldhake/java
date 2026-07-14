public class ReverseCopyArray {

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int []b= new int[a.length];
        for(int i=a.length-1,j=0;i>=0;i--,j++){
            b[j]=a[i];
        }

        for (int i : b) {
            System.err.print(i + " ");
        }
    }
    
}
