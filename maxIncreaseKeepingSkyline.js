var maxIncreaseKeepingSkyline = function (grid) {
    var result = []
    var rows = grid.length
    var i = 0
    while (i < rows) {
        var currentArray = grid[i]
        var j = 0
        var columns = grid.length
        var rowMax = 0
        var resultArray = []
        for (let r = 0; r < currentArray.length; r++) {
            if (currentArray[r] > rowMax) {
                rowMax = currentArray[r]
            }
        }

        while (j < columns) {
            var columnMax = 0
            for (let c = 0; c < grid.length; c++) {
                if (grid[c][j] > columnMax) {
                    columnMax = grid[c][j]
                }
            }
            if (currentArray[j] <= rowMax || currentArray[j] <= columnMax) {
                resultArray.push(Math.min(rowMax, columnMax))
            }
            j++
        }
        i++
        result.push(resultArray)
    }
    var sum = 0
    for (let p = 0; p < grid.length; p++) {
        for (let q = 0; q < grid.length; q++) {
            sum = sum + (result[p][q] - grid[p][q])
        }
    }
    return sum
};