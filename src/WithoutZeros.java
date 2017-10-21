public class WithoutZeros {
    public static void main(String[] args) {
        int[] arr={0,-5,0,-2,0};
        Zero(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void Zero(int[] arr) {
        int n=arr.length;
        for (int i=1;i<n;i++)
        {
            if(arr[i]==0){
            arr[i]=-arr[i-1];
            }
        }

    }
}
