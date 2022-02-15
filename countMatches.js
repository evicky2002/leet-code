var countMatches = function (items, ruleKey, ruleValue) {
    var column = 0
    var count = 0

    if (ruleKey == "type") {
        column = 0
    }
    if (ruleKey == "color") {
        column = 1
    }
    if (ruleKey == "name") {
        column = 2
    }
    for (let i = 0; i < items.length; i++) {
        var currentArray = items[i]
        if (currentArray[column] == ruleValue) {
            count++
        }
    }
    return count
};