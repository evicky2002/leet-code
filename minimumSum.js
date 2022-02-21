var minimumSum = function (num) {
    var array = []
    while (num > 0) {
        array.push(num % 10)
        num = Math.floor(num / 10)
    }
    var isSwapped = false
    do {
        isSwapped = false
        for (let i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1]
                array[i + 1] = array[i]
                array[i] = temp
                isSwapped = true
            }
        }
    } while (isSwapped)

    var firstNum = array[0] * 10 + array[2]
    var secondNum = array[1] * 10 + array[3]

    return firstNum + secondNum
};