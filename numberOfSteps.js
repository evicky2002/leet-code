var numberOfSteps = function (num) {
    var count = 0
    while (num > 0) {
        if (num % 2 == 0) {
            num /= 2
            count++
        }
        if (num % 2 == 1) {
            num -= 1
            count++
        }
    }
    return count
};