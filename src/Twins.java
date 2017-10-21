public class Twins {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,4};
        System.out.println(ArrTwin(arr));
    }
    static boolean ArrTwin(int[] arr){
        int n=arr.length;
        boolean bool=false;
        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++){
                if (arr[i]==arr[j]) {
                    bool = true;
                }
                }
            }
        return bool;
        }

    }

