var arrayStringsAreEqual = function (word1, word2) {
    var wordOne = ""
    var wordTwo = ""
    var pass = true
    var result = false
    for (let i = 0; i < word1.length; i++) {
        wordOne += word1[i]
    }
    for (let j = 0; j < word2.length; j++) {
        wordTwo += word2[j]
    }
    var wordOneLength = wordOne.length
    var wordTwoLength = wordTwo.length
    var maxLength = 0
    if (wordOneLength > wordTwoLength) {
        maxLength = wordOneLength
    } else {
        maxLength = wordTwoLength
    }
    for (let k = 0; k < maxLength; k++) {
        if (wordOne[k] != wordTwo[k]) {
            pass = false
            break
        }
    }
    if (pass) {
        result = true
    }
    return result
};