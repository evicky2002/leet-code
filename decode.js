var decode = function (encoded, first) {
    var result = []
    result.push(first)
    var resultIndex = 0
    for (let i = 0; i < encoded.length; i++) {
        var temp = result[resultIndex]
        var answer = (temp ^ encoded[i])
        result.push(answer)
        resultIndex++
    }
    return result
};