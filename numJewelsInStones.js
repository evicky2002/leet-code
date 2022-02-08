var numJewelsInStones = function (jewels, stones) {
    var result = 0
    for (let i = 0; i < jewels.length; i++) {
        var jewel = jewels[i]
        for (let j = 0; j < stones.length; j++) {
            if (jewel == stones[j]) {
                result++
            }
        }
    }
    return result
};