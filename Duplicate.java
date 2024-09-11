public class Duplicate {
    public static void main(String[] args) {
        int arr[]={2,3,4,4,6,7,7};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate element is " + arr[i]);
                }
            }
        }
    }
}
