var containsDuplicate = function (nums) {
    var result = false
    for (let i = 0; i < nums.length; i++) {
        for (let j = 0; j < nums.length; j++) {
            if (i != j) {
                if (nums[i] == nums[j]) {
                    result = true
                    break
                }
            }
        }
        if (result) {
            break
        }
    }
    return result;
};