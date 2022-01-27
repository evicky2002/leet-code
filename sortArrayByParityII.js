var sortArrayByParityII = function (nums) {
    let oddCount = 1
    let evenCount = 0
    for (let i = 0; i < nums.length; i++) {
        while (nums[i] % 2 != 0 && i % 2 == 0) {
            temp = nums[oddCount]
            nums[oddCount] = nums[i]
            nums[i] = temp
            oddCount += 2
        }
        while (nums[i] % 2 == 0 && i % 2 != 0) {
            temp = nums[evenCount]
            nums[evenCount] = nums[i]
            nums[i] = temp
            evenCount += 2
        }
    }
    return nums
};