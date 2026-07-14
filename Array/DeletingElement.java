public class DeletingElement {

    // public static void main(String[] args) {
    // int a[]={23,34,32,547,8796,324};

    // int di = 1;

    // for(int i = a.length-1;i>di;i--){
    // a[i-1]=a[i];

    // }
    // a[a.length-1]=0;

    // for (int i : a) {
    // System.out.print(i + " ");
    // }

    public static void main(String[] args) {
        int a[] = { 23, 34, 32, 547, 8796, 324 };

        int di = 1; // index to delete

        for (int i = di; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        a[a.length - 1] = 0; // optional (clears last element)

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
