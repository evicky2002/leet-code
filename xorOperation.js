var xorOperation = function (n, start) {
    var result = []
    for (let i = 0; i < n; i++) {
        result.push(start + (2 * i))
    }
    var output = 0
    for (let j = 0; j < result.length; j++) {
        output = output ^ result[j]
    }
    return output
};