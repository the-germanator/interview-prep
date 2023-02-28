class LinearBinarySearch {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90};
        int target = 90;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length - 1;
        
        while(lp <= rp) {
            int mp = (lp + rp) / 2;
            if(nums[mp] == target) return mp;
            else if(target > nums[mp]) {
                lp = mp + 1;
            } else {
                rp = mp;
            }
        }
        return -1;
    }
}