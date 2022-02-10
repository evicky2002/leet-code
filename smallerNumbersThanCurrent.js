var smallerNumbersThanCurrent = function (nums) {
    var result = []
    for (let i = 0; i < nums.length; i++) {
        var currentNum = nums[i]
        var count = 0
        for (let j = 0; j < nums.length; j++) {
            if (j != i) {
                if (nums[j] < currentNum)
                    count++
            }
        }
        result.push(count)
    }
    return result
};