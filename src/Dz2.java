public class Dz2 {
    public static void main(String[] args) {
        String[] arr;
        String str;
    }
    static boolean exists(String[] arr,String str)
{
    boolean stringEx=false;
    for (int i=0; i < arr.length & !stringEx; i++)
    {
        if (arr[i].equals(str))
        {
            stringEx=true;
        }

    }
    return stringEx;
}
}
