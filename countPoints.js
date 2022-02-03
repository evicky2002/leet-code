var countPoints = function (points, queries) {
    var result = []
    for (let i = 0; i < queries.length; i++) {
        var count = 0;
        var circle = queries[i]
        var x1 = circle[0]
        var y1 = circle[1]
        var radius = circle[2]
        for (let j = 0; j < points.length; j++) {
            var point = points[j]
            var x2 = point[0]
            var y2 = point[1]
            var distance = Math.sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))
            if (distance <= radius) {
                count++
            }
        }
        result.push(count)
    }
    return result
};