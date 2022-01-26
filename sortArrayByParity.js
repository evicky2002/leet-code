var sortArrayByParity = function(nums) {
    for(let i = 0; i < nums.length; i++){
        if(nums[i] % 2 != 0){
           var temp = nums[i]
           for(let j = i; j < nums.length-1; j++){
                nums[j] = nums[j+1]
           }   
           nums[nums.length-1] = temp
         }
         if(nums[i] % 2 == 0){
           var temp = nums[i]
           for(let j = i; j >= 0; j--){
               nums[j] = nums[j-1]
           }
           nums[0] = temp
         }
    }    
   return nums
};