var maximumWealth = function (accounts) {
    var result = 0
    for (let i = 0; i < accounts.length; i++) {
        var customer = accounts[i]
        var sum = 0
        for (let j = 0; j < customer.length; j++) {
            sum += customer[j]
        }
        if (sum > result) {
            result = sum
        }
    }
    return result
};