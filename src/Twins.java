public class Twins {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,1};
        System.out.println(ArrTwin(arr));
    }
    static boolean ArrTwin(int[] arr){
        int n=arr.length;
        boolean bool=false;
        for (int i=0;i<n-1;i++) {
            int p=i+1;
            for (int j=p;j<n;j++){
                if (arr[i]==arr[j]) {
                    bool = true;
                }
                }
            }
        return bool;
        }
    }

