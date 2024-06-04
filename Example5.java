public class Example5{
    public static void main(String args[])
    {
        char[]  characters={'b','d','e','g','h'};
        int target='f';
        System.out.println(Search(characters,target));
    }
     
    static int Search(char[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {int mid=start+(end-start)/2;
            if(target > nums[mid])
            {
                start=mid+1;            }
            else{
                end=mid-1;

            }
            }
        
    return start%nums.length;
}
}