function findDisappearedNumbers(nums){
    if(nums.length == 1){
        return null
    }else{
        result = []
        for(let i = 1; i <= nums.length; i++){
            let hasNumber = false
            let j = 0
            for(j = 0; j<nums.length ; j++){
                if(i == nums[j]){
                    hasNumber = true
                }
            }
            while(!hasNumber){
                result.push(i)
                break
            }
        }
        return result
    }
}
res = findDisappearedNumbers([1,1])
console.log(res)