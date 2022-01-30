var mostWordsFound = function (sentences) {
    let maxLength = 0
    for (let i = 0; i < sentences.length; i++) {
        var length = sentences[i].split(" ").length
        if (length > maxLength) {
            maxLength = length
        }
    }
    return maxLength
};