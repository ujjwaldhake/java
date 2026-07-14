public class InsertingElement {

    public static void main(String[] args) {
        int a[] =  new int[10];
        a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;a[5]=6;
      int n=6;
      int n1=20;
      int index=2;
       for(int i=n;i>index;i--){
        a[i]=a[i-1];
       }
       a[index]=n1;

       for (int i : a) {
        System.err.print(i+" ");
       }
    }
    
}
