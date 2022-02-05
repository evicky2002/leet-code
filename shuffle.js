var shuffle = function (nums, n) {
    var result = []
    var mid = n
    for (let i = 0; i < n; i++) {
        result.push(nums[i])
        result.push(nums[mid])
        mid++
    }
    return result
};