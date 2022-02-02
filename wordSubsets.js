//This is a brute force approach, so it is not an efficient algorithm for this problem, but hey it works!!!
var wordSubsets = function (words1, words2) {
    var result = []
    for (let i = 0; i < words1.length; i++) {
        let hasChanged = false
        let mainStr = words1[i]
        for (let j = 0; j < words2.length; j++) {
            let modifiedStr = mainStr
            let subStr = words2[j]
            for (c = 0; c < subStr.length; c++) {
                hasChanged = false
                for (k = 0; k < modifiedStr.length; k++) {
                    if (subStr[c] == modifiedStr[k]) {
                        let newStr = ""
                        if (k == 0) {
                            newStr = modifiedStr.substring(1, modifiedStr.length)
                        } else {
                            newStr += modifiedStr.substring(0, k)
                            newStr += modifiedStr.substring(k + 1, modifiedStr.length)
                        }
                        modifiedStr = newStr
                        hasChanged = true
                        break
                    }
                } if (!hasChanged) {
                    break
                }
            }
            if (!hasChanged) {
                break
            }
        } if (hasChanged) {
            result.push(mainStr)
        }
    }
    return result
};