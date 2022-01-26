var maxSubArray = function(nums) {
    var max = nums[0]
    var cur_sum = max 
    for(let i = 1; i < nums.length; i++){
        cur_sum += nums[i]
        if(cur_sum<nums[i]){
            cur_sum = nums[i]
        }else{
            cur_sum = cur_sum
        }
        if(cur_sum>max){
            max = cur_sum
        }else{
            max = max
        }
    }
    return max
};