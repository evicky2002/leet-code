var subtractProductAndSum = function (n) {
    var sum = 0
    var product = 1
    while (n > 0) {
        var rem = n % 10
        console.log(rem)
        sum += rem
        product *= rem
        n = Math.floor(n / 10)
    }
    return product - sum
};