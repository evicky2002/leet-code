var minTimeToVisitAllPoints = function (points) {
    var timeTaken = 0

    for (let i = 0; i < points.length - 1; i++) {
        console.log(points.length)
        console.log(i)
        var distanceX;
        var distanceY;
        var pointA = points[i]
        var pointB = points[i + 1]

        //X
        //If both X is positive
        if (pointA[0] >= 0 && pointB[0] >= 0) {
            var temp = pointA[0] - pointB[0]
            distanceX = Math.abs(temp)
        }
        //If any X is positive

        if (pointA[0] <= 0 || pointB[0] <= 0) {
            if (!(pointA[0] < 0 && pointB[0] < 0)) {
                var num1 = Math.abs(pointA[0])
                var num2 = Math.abs(pointB[0])
                var temp = num1 + num2
                distanceX = temp
            }
        }
        //If both X is negative

        if (pointA[0] < 0 && pointB[0] < 0) {
            var temp = pointA[0] - pointB[0]
            distanceX = Math.abs(temp)
        }

        //Y
        //If both Y is positive
        if (pointA[1] >= 0 && pointB[1] >= 0) {
            var temp = pointA[1] - pointB[1]
            distanceY = Math.abs(temp)
        }
        //If any Y is positive

        if (pointA[1] <= 0 || pointB[1] <= 0) {
            if (!(pointA[1] < 0 && pointB[1] < 0)) {
                var num1 = Math.abs(pointA[1])
                var num2 = Math.abs(pointB[1])
                var temp = num1 + num2
                distanceY = temp
            }
        }
        //If both Y is negative

        if (pointA[1] < 0 && pointB[1] < 0) {
            var temp = pointA[1] - pointB[1]
            distanceY = Math.abs(temp)
        }
        timeTaken += Math.max(distanceX, distanceY)
        console.log("Distance X : " + distanceX)
        console.log("Distance Y : " + distanceY)
        console.log("Time taken : " + timeTaken)


    }
    return timeTaken

};