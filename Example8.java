public class Example8{
    public static void main(String args[])
{
    int[] array={1,2,3,4,5,6,5,4,2,1};
    System.out.println(Peak(array));
}
static int Peak(int[] array)
{
    int start=0;
    int end=array.length-1;
    while(start<end)
    {
        int mid=start+(end-start)/2;
        if(array[mid]>array[mid+1])
        {
            end=mid;
        }
        else{
            start=mid+1;
        }
    }
    return end;
}
}