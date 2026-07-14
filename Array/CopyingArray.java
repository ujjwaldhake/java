public class CopyingArray {
    public static void main(String[] args) {
        int a[]={23,45,56,78,83,32,45};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }

        for (int i : b) {
            System.out.print(i+ " ");
        }
    }
}
