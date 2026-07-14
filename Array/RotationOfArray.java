public class RotationOfArray {

    public static void main(String[] args) {
        int a[]={10,12,13,14,15,16};
        int temp=a[0];
        for(int i =1;i<a.length;i++){
            a[i-1]=a[i];
        }

        a[a.length-1]=temp;
    //    for(int i =0;i<a.length;i++){
    //         System.out.print(a[i]+" ");;
    //     }

    for (int f : a) {
        System.out.print(f+" ");;
        
    }

        
    }
    
}
