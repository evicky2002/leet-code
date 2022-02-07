var isPerfectSquare = function (num) {
    var perfectSquare = false
    for (let i = 1; i <= num / i; i++) {
        if (num / i == i && num % i == 0) {
            perfectSquare = true
        }
    }
    return perfectSquare

};