public class AddingTwoMatrix {

    public static void main(String[] args) {
    int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int c[][] = new int[a.length][a[0].length];
    for(int i=0;i<a.length;i++){
        for(int j =0 ;j<a[i].length;j++){

            c[i][j]=a[i][j]+b[i][j];
            
        }
    }
    for (int[] is : c) {
        for (int  is2 : is) {
            System.out.print(is2+ "  ");
        }
        System.err.println();
    }
    }
    
}
