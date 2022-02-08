var kidsWithCandies = function (candies, extraCandies) {
    var max = candies[0]
    var result = []
    for (let i = 1; i < candies.length; i++) {
        if (candies[i] > max) {
            max = candies[i]
        }
    }
    console.log(max)
    for (let j = 0; j < candies.length; j++) {
        if (candies[j] + extraCandies >= max) {
            result.push(true)
        } else {
            result.push(false)
        }
    }
    return result
};