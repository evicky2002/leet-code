var decompressRLElist = function (nums) {
    var result = []
    for (let i = 0; i < nums.length - 1; i++) {
        var num = nums[i]
        while (num > 0) {
            result.push(nums[i + 1])
            num--
        }
        i++
    }
    return result
};