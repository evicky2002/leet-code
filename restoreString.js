var restoreString = function (s, indices) {
    var result = []
    for (let i = 0; i < indices.length; i++) {
        result[indices[i]] = s[i]
    }
    return result.join("")
};