var targetIndices = function (nums, target) {
    var isSwapped = false
    do {
        isSwapped = false
        for (let i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                temp = nums[i + 1]
                nums[i + 1] = nums[i]
                nums[i] = temp
                isSwapped = true
            }
        }

    } while (isSwapped)
    var resultIndices = []
    var greatestIndex = 0
    var startingIndex = 0
    for (let j = 0; j < nums.length; j++) {
        if (nums[j] > target) {
            greatestIndex = j
            break
        } else {
            greatestIndex = nums.length - 1
        }
    }
    for (let k = 0; k < nums.length; k++) {
        if (nums[k] == target) {
            startingIndex = k
            break
        }
    }
    for (let z = startingIndex; z <= greatestIndex; z++) {
        if (nums[z] == target) {
            resultIndices.push(z)
        }
    }
    return resultIndices
};