public class Example7{
    public static void main(String args[])
    {
        int[] array={1,2,3,4,5,6,7,8,9,10,12,13,14,16,17,18,19,20};
        int target=5;
        System.out.println(ans(array,target));
    }
    static int ans(int[] array,int target)
    {
        int start=0;
        int end=1;
        while(target>array[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
    }
    return Search(array,target,start,end);
}

    static int Search(int[] array,int target,int start,int end)
    {
      while(start<=end)
      {
        int mid=start+(end-start)/2;
        if(target>array[mid])
        {
            start=mid+1;
        }
        else if(target<array[mid]){
            end=mid-1;
        }
        else{
             return mid;
        }
      }
      return -1;
    }
}