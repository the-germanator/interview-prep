class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90};
        int target = 90;
        System.out.println(search(nums,target,0,nums.length-1));
    }
    public static int search(int[] nums, int target, int lp, int rp) {
        int mp = (lp + rp) / 2;
        if(lp > rp) return -1;
        if(nums[mp] == target) return mp;
        if(target > nums[mp]) return search(nums, target, mp+1, rp);
        else return search(nums, target, lp, mp);
    }
}
