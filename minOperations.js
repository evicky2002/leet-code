var minOperations = function (boxes) {
    var result = []
    for (let i = 0; i < boxes.length; i++) {
        var currentBox = i
        var count = 0
        for (let j = 0; j < boxes.length; j++) {
            if (j != currentBox) {
                if (boxes[j] == 1) {
                    if (currentBox > j) {
                        count += currentBox - j
                    } else {
                        count += j - currentBox
                    }
                }
            }

        }
        result.push(count)
    }
    return result
};