public class Array1 {

    public int sumOfArray(int[] arr){
    int sum=0;
    for(int i=0; i<arr.length; i++){
        sum=sum + arr[i];
    }
    return sum;
    }

    public void searchElement(int[] arr,int num){
    for(int i=0; i<arr.length; i++){
       if(num==arr[i]){
        System.out.println("element found at "+i+" position "+arr[i]);
        System.exit(0);
       }
    }
    System.out.println("element not found");
    }
    public int findMax(int []arr){
        int max=arr[0];// int arr3[]={346,435,675,65,78,54,789};
        for(int i =0 ; i<arr.length;i++){
          if(arr[i]>max){
            max=arr[i];
          }
        }
        return max;
    }
    public static void main(String[] args) {
        Array1 obj=new Array1();
        // A[] =new int[5] A is reference  and 5 is size
        //i java eversy arrya is n object and is created in heap
        //A is a referance 
        // A(Stack) -> 1,2,3,4,5 5*4=20 bytes
        // length A.lenght
        //ways to create array int A[]={1,2,3,4,5,6};  A - 1,2,3,4,5 
        //for access  array elements 
        //int A[] =new int[5] ; A->0,0,0,0,0
        //A[0]=5; int[5] ; A->5,0,0,0,0
        // int A[] = {1,2,3,4,5}; A->1,2,3,4,5
        // accessing elements using for each loop 
        //for(int x : A)
        //{sop(x);}

        // int A[]= new int[10];
        // int b[]={1,2,3,4,5,6,7};
        // int c[];
        // c=new int [10];
        // for (int i : b) {
        //     System.out.println(i);
        // }
        int arr[]={1,1,1,1,1};
        // System.out.println(obj.sumOfArray(arr));
        int arr2[]={346,435,675,65,78,54,789};
        //obj.searchElement(arr2, 346);
        int arr3[]={346,435,675,3425,65,78,54,789};
        System.out.println(obj.findMax(arr3));
    
}
}
