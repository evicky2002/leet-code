var countConsistentStrings = function (allowed, words) {
    var result = 0
    var charPass = false
    for (let i = 0; i < words.length; i++) {
        var word = words[i]
        for (let j = 0; j < word.length; j++) {
            var char = word[j]
            for (let k = 0; k < allowed.length; k++) {
                if (char != allowed[k]) {
                    charPass = false
                }
                if (char == allowed[k]) {
                    charPass = true
                    break
                }
            }
            if (!charPass) {
                break
            }
        }
        if (charPass) {
            result++
        }
    }
    return result
};