public class Example9{
    public static void main(String args[])
    {
        int[] array={1,3,4,5,6,4,3,2,1};
        int target=2;
        System.out.println(Search(array,target));
    }
    static int Search(int[] array,int target)
    {
      int peak=Searchs(array);
      int firstSearch=FindTarget(array,target,0,peak);
      if(firstSearch !=-1)
      {
        return firstSearch;
      }
      return FindTarget(array,target,peak+1,array.length-1);
    }
    static int Searchs(int[] array)
    {
        int start=0;
        int end=array.length-1;
        while(start<end)
        {
         int mid=start+(end-start)/2;
         if(array[mid]<array[mid+1])
         {
            start=mid+1;
         }
         else{
            end=mid;
         }
        }
        return end;
    }

   static int FindTarget(int[] array,int target,int start,int end)
   { 
    boolean isIt=array[start]<array[end];
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        if(array[mid]==target)
        {
            return mid;
        }

       if(isIt){

        if(target>array[mid])
        {
            start=mid+1;
        }
        else if(target<array[mid])
        {
            end=mid-1;
        }
    }
    else{
        if(target>array[mid])
        {
            end=mid-1;
        }
        else if(target<array[mid])
        {
            start=mid+1;
        }
    }
        }
        return -1;
    }
}
    
    
   

   
    