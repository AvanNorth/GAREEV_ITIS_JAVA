public class Twins {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,5};
        System.out.println(ArrTwin(arr));
    }
    static boolean ArrTwin(int[] arr){
        int n=arr.length;
        boolean bool=false;
        for (int i=0;i<n-1;i++) {

                if (arr[i]==arr[i+1]) {
                    bool=true;
                }
            }
        return bool;
        }

    }

